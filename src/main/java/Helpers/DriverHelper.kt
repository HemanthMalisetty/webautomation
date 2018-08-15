package Helpers

import org.openqa.selenium.*
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.WebDriverWait

import java.util.stream.Collectors


/**
 * Created by Jordan on 5/2/17.
 */
open class DriverHelper {
    protected var defaultWaitTime = 20
    var dhs = SelectHelper()
    var driver = LocalDriverManager.getDriver()
        protected set

    @JvmOverloads
    open fun click(locator: By, message: String  = "$locator  cannot be clicked"git ) {
        waitForElementToBeClickable(locator, message)

        WebDriverWait(driver, 5).until(object : ExpectedCondition<Boolean> {
            override fun apply(webDriver: WebDriver?): Boolean? {
                try {
                    driver.findElement(locator).click()
                } catch (e: WebDriverException) {
                    println("Failed to click locator: " + locator)
                    return false
                }

                return true
            }

            override fun toString(): String {
                return message
            }

        })
    }

    @JvmOverloads
    open fun click(xpath: String, message: String = "$xpath  cannot be clicked") {
        click(By.xpath(xpath), message)
    }

    fun setText(locator: By, text: String) {
        waitForElementToExist(locator)
        WebDriverWait(LocalDriverManager.getDriver(), 5).until(ExpectedConditions.visibilityOfElementLocated(locator))
        driver.findElement(locator).clear()
        driver.findElement(locator).sendKeys(text)
    }

    fun setText(xpath: String, text: String) {
        setText(By.xpath(xpath), text)
    }

    open fun getText(locator: By): String {
        waitForElementToExist(locator)
        return driver.findElement(locator).text
    }

    fun getValue(by: By): String {
        return getAttribute(by, "value")
    }

    fun getAttribute(by: By, attribute: String): String {
        return driver.findElement(by).getAttribute(attribute)
    }

    fun getText(xpath: String): String {
        return this.getText(By.xpath(xpath))
    }

    fun getURL(url: String) {
        driver.get(url)
    }

    fun findElements(xpath: String): List<WebElement> {
        return findElements(By.xpath(xpath))
    }

    fun findElements(locator: By): List<WebElement> {
        return driver.findElements(locator)
    }

    fun findElement(locator: By): WebElement {
        return driver.findElement(locator)
    }

    fun findElement(xpath: String): WebElement {
        return findElement(By.xpath(xpath))
    }

    fun isSelected(locator: By): Boolean? {
        waitForElementToExist(locator)
        return driver.findElement(locator).isSelected
    }

    fun isDisplayed(by: By): Boolean {
        val elements = driver.findElements(by)
        try {
            return !elements.isEmpty() && elements[0].isDisplayed
        } catch (e: StaleElementReferenceException) {
            return false
        }

    }

    fun isSelected(xpath: String): Boolean? {
        return isSelected(By.xpath(xpath))
    }

    fun isClickable(locator: By): Boolean? {
        waitForElementToExist(locator)
        return driver.findElement(locator).isEnabled
    }

    fun tab() {
        driver.findElement(By.tagName("body")).sendKeys(Keys.TAB)
    }

    fun waitForElementToBeClickable(locator: By, message: String) {
        waitForElementToBeClickable(locator, defaultWaitTime, message)
    }

    fun waitForElementToBeClickable(xpath: String) {
        waitForElementToBeClickable(By.xpath(xpath))
    }

    @JvmOverloads
    fun waitForElementToBeClickable(locator: By, waitTime: Int = defaultWaitTime) {
        WebDriverWait(driver, waitTime.toLong()).until(object : ExpectedCondition<WebElement> {
            override fun apply(webDriver: WebDriver?): WebElement? {
                return ExpectedConditions.elementToBeClickable(locator).apply(driver)
            }

            override fun toString(): String {
                return waitTime.toString() + " seconds for element to be clickable at locator: '" + locator + "'\n"
            }
        })
    }

    fun waitForElementToBeClickable(locator: By, waitTime: Int, message: String) {
        WebDriverWait(driver, waitTime.toLong()).until(object : ExpectedCondition<WebElement> {
            override fun apply(webDriver: WebDriver?): WebElement? {
                return ExpectedConditions.elementToBeClickable(locator).apply(driver)
            }

            override fun toString(): String {
                return waitTime.toString() + " seconds for: " + message
            }
        })
    }

    fun waitForElementToBeVisible(xpath: String) {
        waitForElementToBeVisible(By.xpath(xpath))
    }

    @JvmOverloads
    fun waitForElementToBeVisible(locator: By, waitTime: Int = defaultWaitTime) {
        WebDriverWait(driver, waitTime.toLong()).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator))
    }

    fun waitForElementToExist(xpath: String) {
        waitForElementToExist(By.xpath(xpath))
    }

    @JvmOverloads
    fun waitForElementToExist(locator: By, waitTime: Int = defaultWaitTime) {
        WebDriverWait(driver, waitTime.toLong()).until(object : ExpectedCondition<Boolean> {
            override fun apply(webDriver: WebDriver?): Boolean? {
                return elementExists(locator)
            }

            override fun toString(): String {
                return "element to exist. Locator: '$locator'"
            }
        })
    }

    fun elementExists(locator: By): Boolean{
        return driver.findElements(locator).size > 0
    }

    fun waitForElementToExist(xpath: String, waitTime: Int) {
        waitForElementToExist(By.xpath(xpath), waitTime)
    }

    fun waitForTextToBe(locator: By, expectedText: String) {
        WebDriverWait(driver, 15).until(object : ExpectedCondition<Boolean> {
            override fun apply(webDriver: WebDriver?): Boolean? {
                return ExpectedConditions.textToBe(locator, expectedText).apply(driver)
            }

            override fun toString(): String {
                return "text at locator: '$locator' to be '$expectedText'."
            }
        })
    }

    fun waitForTextNotToBe(locator: By, unexpectedText: String) {
        WebDriverWait(driver, defaultWaitTime.toLong()).until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, unexpectedText)))
    }

    fun waitForTextNotToBe(xpath: String, unexpectedText: String) {
        waitForTextNotToBe(By.xpath(xpath), unexpectedText)
    }

    fun waitForUrlToBe(url: String) {
        WebDriverWait(driver, defaultWaitTime.toLong()).until(ExpectedConditions.urlToBe(url))
    }

    @JvmOverloads
    fun waitForUrlToContain(url: String, timeInSeconds: Int = defaultWaitTime) {
        WebDriverWait(driver, timeInSeconds.toLong()).until(object : ExpectedCondition<Boolean> {
            override fun apply(webDriver: WebDriver?): Boolean? {
                return driver.currentUrl.contains(url)
            }

            override fun toString(): String {
                return "waiting for url to contain'" + url + "' but found '" + driver.currentUrl + "'"
            }
        })
    }

    //TODO Find better way to denote failure (receives a TimeoutException)

    //endregion

    fun scrollToTopOfPage()
    {
        (driver as JavascriptExecutor).executeScript("window.scrollTo(0,0)")
    }

    inner class SelectHelper {

        fun selectOption(locator: By? = null, xpath: String? = null, option : String? = null, index : Int? = null)
        {
            var loc : By? = null

            when (xpath != null) {
                true -> loc = By.xpath(xpath)
                false -> loc = locator!! // Convert to non nullable type

                else -> println("Locator and xpath are null")

            }
            when (option != null)
            {
                true -> {
                    WebDriverWait(driver, defaultWaitTime.toLong()).until(object : ExpectedCondition<Boolean> {
                        override fun apply(webDriver: WebDriver?): Boolean? {
                            try {
                                Select(driver.findElement(loc)).selectByVisibleText(option)
                            } catch (e: WebDriverException) {
                                return false
                            }
                            return true
                        }

                        override fun toString(): String {
                            var options = Select(driver.findElement(loc)).options.stream().map(WebElement::getText).collect(Collectors.toList())
                            return "option to appear: '$option'\nFound the following options: {$options}"
                        }
                    })
                }
                false -> {
                    val ind = index!! //Convert to non nullable type
                    val select = Select(driver.findElement(locator))
                    WebDriverWait(driver, defaultWaitTime.toLong()).until(object : ExpectedCondition<Boolean> {
                        override fun apply(webDriver: WebDriver?): Boolean? {
                            try {
                                select.selectByIndex(ind)
                            } catch (e: NoSuchElementException) {
                                return false
                            }

                            return true
                        }

                        override fun toString(): String {
                            return "Could Not Find the option by index\nIndex Given: $index \nNumber of elements found:  ${select.options.size}"
                        }
                    })
                }
            }
        }

        fun selectOption(locator: By, option: String) {
            WebDriverWait(driver, defaultWaitTime.toLong()).until(object : ExpectedCondition<Boolean> {
                override fun apply(webDriver: WebDriver?): Boolean? {
                    try {
                        Select(driver.findElement(locator)).selectByVisibleText(option)
                    } catch (e: WebDriverException) {
                        return false
                    }

                    return true
                }

                override fun toString(): String {
                    //val options = Select(driver.findElement(locator)).options.stream().map<String>(Function<WebElement, String> { it.getText() }).collect<ArrayList<String>, Any>(Collectors.toCollection(Supplier<ArrayList<String>> { ArrayList() }))
                    var options = Select(driver.findElement(locator)).options.stream().map(WebElement::getText).collect(Collectors.toList())
                    return "option to appear: '$option'\nFound the following options: {$options}"
                }
            })
        }

        fun selectOption(xpath: String, option: String) {
            selectOption(By.xpath(xpath), option)
        }

        fun selectOption(locator: By, index: Int) {
            val select = Select(driver.findElement(locator))
            WebDriverWait(driver, defaultWaitTime.toLong()).until(object : ExpectedCondition<Boolean> {
                override fun apply(webDriver: WebDriver?): Boolean? {
                    try {
                        select.selectByIndex(index)
                    } catch (e: NoSuchElementException) {
                        return false
                    }

                    return true
                }

                override fun toString(): String {
                    return "Could Not Find the option by index\nIndex Given: $index \nNumber of elements found:  ${select.options.size}"
                }
            })
        }

        fun selectOption(xpath: String, index: Int) {
            selectOption(By.xpath(xpath), index)
        }

        fun getOptions(locator: By): List<String> {
            val select = Select(driver.findElement(locator))
            //return select.options.stream().map<String>(Function<WebElement, String> { it.getText() }).collect<ArrayList<String>, Any>(Collectors.toCollection(Supplier<ArrayList<String>> { ArrayList() }))
            return select.options.stream().map(WebElement::getText).collect(Collectors.toList())
        }

        fun getSelectedOption(locator: By): String {
            return Select(findElement(locator)).firstSelectedOption.text
        }

        fun getSelectedOption(xpath: String): String {
            return getSelectedOption(By.xpath(xpath))
        }
    }
}
