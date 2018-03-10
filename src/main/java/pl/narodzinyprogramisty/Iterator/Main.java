package pl.narodzinyprogramisty.Iterator;

public class Main {
    public static void main(String[] args) {
        ListWithId<String> users = new ListWithId<>();

        users.add("Czesc");
        users.add("Co");
        users.add("Tam");
        users.add("Jak");
        users.add("Życeie");


       String user =  users.get(103);
        System.out.println();


    }
}
