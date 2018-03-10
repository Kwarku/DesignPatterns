package pl.narodzinyprogramisty.Decorator;

//change text format, simulation html page
public class HtmlFormatText implements Decorator {
    Decorator decoratorObject;

    public HtmlFormatText(Decorator decoratorObject) {
        this.decoratorObject = decoratorObject;
    }
    public String getText() {
        return "&lt; div&gt;" + decoratorObject.getText() + "&lt; div&lt;";
    }
}
