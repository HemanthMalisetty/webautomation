package Unicorn.AbstractClasses;
import Unicorn.Pages.WaitTimeBoard.WaitTimeBoards;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public abstract class WaitTimeBoardsBase<T extends WaitTimeBoardsBase> extends AddEditBase<WaitTimeBoards> {
    private WaitTimeBoardsBaseBy by = new WaitTimeBoardsBaseBy();
    private UnicornDriverHelper dh = new UnicornDriverHelper();

    @Override
    public T isLoaded() {
        title = "Wait Time Board Details";
        super.isLoaded();
        return (T)this;
    }

    public class WaitTimeBoardsBaseBy{
        By      boardId = By.id("vmWaitTimeBoardWaitTimeBoardId"),
                name = By.id("vmWaitTimeBoardBoardName"),
                parent = By.id("vmWaitTimeBoardParentId"),
                location = By.id("vmWaitTimeBoardLocationId"),
                type = By.id("vmWaitTimeBoardBoardType"),
                theme = By.id("vmWaitTimeBoardBoardTheme"),
                layout = By.id("vmWaitTimeBoardBoardLayout"),
                cycleTime = By.id("vmWaitTimeBoardCycleTimeInMins"),
                bufferTime = By.id("vmWaitTimeBoardBufferTime"),
                waitTime = By.id("vmWaitTimeBoardWaitTime");

    }
    @Override
    protected WaitTimeBoards clickAdd()
    {
        super.add();
        return new WaitTimeBoards().isLoaded();
    }
    @Override
    public WaitTimeBoards clickCancel()
    {
        super.cancel();
        return new WaitTimeBoards().isLoaded();
    }
    @Override
    public WaitTimeBoards clickBack()
    {
        super.back();
        return new WaitTimeBoards().isLoaded();
    }
    @Override
    protected WaitTimeBoards clickUpdate()
    {
        super.update();
        return new WaitTimeBoards().isLoaded();
    }
    @Override
    protected WaitTimeBoards clickDelete()
    {
        super.delete();
        return new WaitTimeBoards().isLoaded();
    }


    public T selectParent(String parent)
    {
        dh.getDhs().selectOption(by.parent, parent);
        return (T)this;
    }

    public String getParent()
    {
        return dh.getDhs().getSelectedOptionText(by.parent);
    }

    public boolean isParentDisplayed()
    {
        return dh.isDisplayed(by.parent);
    }

    public T selectLocation(String location)
    {
        dh.getDhs().selectOption(by.location, location);
        return (T)this;
    }

    public T selectLocation(int index)
    {
        dh.getDhs().selectOption(by.location, index);
        return (T)this;
    }
    public String getLocation()
    {
        return dh.getDhs().getSelectedOptionText(by.location);
    }

    public boolean isLocationDisplayed()
    {
        return dh.isDisplayed(by.location);
    }

    public T selectType(String type)
    {
        dh.getDhs().selectOption(by.type, type);
        return (T)this;
    }

    public String getType()
    {
        return dh.getDhs().getSelectedOptionText(by.type);
    }

    public boolean isTypeDisplayed()
    {
        return dh.isDisplayed(by.type);
    }

    public T setBoardId(String boardId)
    {
        dh.setText(by.boardId, boardId);
        return (T)this;
    }

    public T setBoardId()
    {
        return setBoardId(excel.BoardId);
    }
    public String getBoardId()
    {
        return dh.getValue(by.boardId);
    }

    public boolean isBoardIdDisplayed()
    {
        return dh.isDisplayed(by.boardId);
    }


    public T setName(String name)
    {
        dh.setText(by.name, name);
        return (T)this;
    }

    public String getName()
    {
        return dh.getValue(by.name);
    }

    public boolean isNameDisplayed()
    {
        return dh.isDisplayed(by.name);
    }

    public T setTheme(String theme)
    {
        dh.setText(by.theme, theme);
        return (T)this;
    }

    public String getTheme()
    {
        return dh.getValue(by.theme);
    }

    public boolean isThemeDisplayed()
    {
        return dh.isDisplayed(by.theme);
    }


    public T setLayout(String layout)
    {
        dh.setText(by.layout, layout);
        return (T)this;
    }

    public String getLayout()
    {
        return dh.getValue(by.layout);
    }

    public boolean isLayoutDisplayed()
    {
        return dh.isDisplayed(by.layout);
    }


    public T setCycleTime(String cycleTime)
    {
        dh.setText(by.cycleTime, cycleTime);
        return (T)this;
    }

    public String getCycleTime()
    {
        return dh.getValue(by.cycleTime);
    }

    public boolean isCycleTimeDisplayed()
    {
        return dh.isDisplayed(by.cycleTime);
    }


    public T setBufferTime(String bufferTime)
    {
        dh.setText(by.bufferTime, bufferTime);
        return (T)this;
    }

    public String getBufferTime()
    {
        return dh.getValue(by.bufferTime);
    }

    public boolean isBufferTimeDisplayed()
    {
        return dh.isDisplayed(by.bufferTime);
    }


    public T setWaitTime(String waitTime)
    {
        dh.setText(by.waitTime, waitTime);
        return (T)this;
    }

    public String getWaitTime()
    {
        return dh.getValue(by.waitTime);
    }

    public boolean isWaitTimeDisplayed()
    {
        return dh.isDisplayed(by.waitTime);
    }
}