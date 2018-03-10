package pl.narodzinyprogramisty.Decorator;

public class ConsoleFormatText implements Decorator {
    private Decorator decoratorObject;

    public ConsoleFormatText(Decorator decoratorObject) {
        this.decoratorObject = decoratorObject;
    }

    public String getText() {
        return "~linus@login: " + decoratorObject.getText();
    }
}
