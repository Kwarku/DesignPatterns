package pl.narodzinyprogramisty.Observer;

import java.util.Scanner;

public class ObserverMain {
    public static void main(String[] args) {
        Subject sub = new Subject();
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);

        Scanner scan = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}
