package Unicorn.SiteComponent;


public class ConfirmPrompt<T, W> extends RemoveRowFromTable<T>{
    private W w;
    public ConfirmPrompt(T t, W w)
    {
        super(t);
        this.w = w;
    }

    public W yes()
    {
        super.clickYes();
        return w;
    }
}