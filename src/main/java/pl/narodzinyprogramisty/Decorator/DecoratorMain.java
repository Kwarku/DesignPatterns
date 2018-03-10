package pl.narodzinyprogramisty.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        RawText rawText = new RawText();

        ConsoleFormatText cft = new ConsoleFormatText(rawText);
        HtmlFormatText hft = new HtmlFormatText(rawText);

        System.out.println("raw text: " + rawText.getText());
        System.out.println("console text: " + cft.getText());
        System.out.println("html text: " + hft.getText());

    }
}
