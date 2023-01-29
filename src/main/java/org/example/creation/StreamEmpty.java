package org.example.creation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEmpty {
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.empty(); // names que está vacio
        List<String> names2 = new ArrayList<>();
        names2.add("Ramiro");
        names2.add("Emily");
        names2.add("Carolina");
        names2.add("Linda");
        Stream<String> namesStream2 = names2.stream();

        // Concatenamos los dos
        Stream<String> names = Stream.concat(namesStream, namesStream2);

    }
}
