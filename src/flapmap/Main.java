package flapmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names1 = List.of("1", "2", "3");
        List<String> names2 = List.of("4", "5", "6");
        List<String> names3 = List.of("7", "8", "9");

        List<String> res= Stream.of(names1,names2,names3)
                .flatMap(e->e.stream())
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
