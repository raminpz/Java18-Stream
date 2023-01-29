package org.example.operacionesintermedias;

import java.util.ArrayList;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(4);

        System.out.println(numbers.size());
        System.out.println("numbers = " + numbers);

        // El distinc, es para traer solo los distintos, no los duplicados
        // vemos que distinct, es una operacion intermedia, por eso se agrega el count, que es una operacion terminal
        long num = numbers.stream().distinct().count();
        System.out.println("num = " + num);
    }

}
