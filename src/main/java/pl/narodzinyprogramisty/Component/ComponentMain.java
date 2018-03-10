package pl.narodzinyprogramisty.Component;

public class ComponentMain {
    public static void main(String[] args) {
        Folder folder1 = new Folder("Pulpit");
        File plik1 = new File("Kot.png");
        File plik2 = new File("śmieszny kot.png");

        Folder folder2 = new Folder("Dane");
        File plik3 = new File("Prezentacja.pdf");

        folder1.add(plik1);
        folder1.add(plik2);
        folder1.add(folder2);
        folder2.add(plik3);
        folder1.traverse();

    }
}
