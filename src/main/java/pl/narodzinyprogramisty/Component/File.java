package pl.narodzinyprogramisty.Component;

public class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }
    public void traverse() {
        System.out.println("  --"+name);

    }
}
