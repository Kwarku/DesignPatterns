package pl.narodzinyprogramisty.Component;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
    private String name;

    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void traverse() {
        System.out.println("-"+name);
        for (Component c : children) {
            c.traverse();
        }
    }
}
