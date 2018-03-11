package pl.narodzinyprogramisty.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1, 5, -6, 7, -8, 9, 10, -10, 6, 4, -3);

        list.stream()
                .filter(num -> num > 0)
                .unordered()
                .collect(Collectors.toList())
                .forEach(System.out::println);


        List<String> names = Arrays.asList("Paweł", "Kasia", "Basia", "Tomek", "Łukasz", "Marianna", "Marian");


        names.stream()
                .filter(name -> name.endsWith("a"))
                .sorted()
                .collect(Collectors.toList())
                .forEach(name -> System.out.print(name + " "));
    }
}
