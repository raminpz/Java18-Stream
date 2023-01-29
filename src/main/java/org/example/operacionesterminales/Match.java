package org.example.operacionesterminales;

import java.util.ArrayList;
import java.util.List;

public class Match {
    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();
        texts.add("addd2");
        texts.add("aaa2");
        texts.add("abbb2");
        texts.add("abbb1");
        texts.add("abbb3");
        texts.add("accc2");

        // Aqui hacemos la consulta si hay texto que empieze con z, para eso usamos anyMatch
        boolean result = texts.stream().anyMatch(text ->text.startsWith("z"));
        System.out.println("result = " + result);


        // Con allMatch, todos deberian cumplir el predicado, todos comiencen con a, si todos los textos comienzan con
        //a, arroja true, sino flase
        boolean result2 = texts.stream().allMatch(text ->text.startsWith("a"));
        System.out.println("result = " + result2);

        //Con noneMatch, que ninguno coencida, true porque ninguno coencide con z
        boolean result3 = texts.stream().noneMatch(text ->text.startsWith("z"));
        System.out.println("result = " + result3);
    }
}
