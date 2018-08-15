package Unicorn

import Helpers.DriverHelper
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class UnicornDriverHelper : DriverHelper() {
    private val dh = DriverHelper()
    fun waitForTitle(title: String) {
        WebDriverWait(dh.driver, 20).until(object : ExpectedCondition<Boolean> {
            override fun apply(webDriver: WebDriver?): Boolean? {
                return webDriver!!.title == title

            }

            override fun toString(): String {
                return "Timeout exceeded waiting for: $title to load"
            }
        })
    }

    fun waitForUnicorn() {
        WebDriverWait(dh.driver, 25).until(object : ExpectedCondition<Boolean> {

            override fun apply(webDriver: WebDriver?): Boolean? {
                return ExpectedConditions.invisibilityOf(
                        dh.driver.findElement(By.className("unicorn"))).apply(dh.driver)
            }

            override fun toString(): String {
                return "Time exceeded waiting for unicorn to disappear"
            }

        })
    }
}
