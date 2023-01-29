package org.example.operacionesintermedias;

import java.util.ArrayList;
import java.util.List;

public class Map {
    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();
        texts.add("ddd2");
        texts.add("aaa2");
        texts.add("bbb2");
        texts.add("bbb1");
        texts.add("bbb3");
        texts.add("ccc2");

        // El map se utiliza para extraer datos o transformaslos
        // Aquí vemos dos formas de imprimir las longuitudes de los textos
        //texts.stream()
        //        .map(text -> text.length())
        //        .forEach(System.out::println);

        texts.stream()
                .map(String::length)
                .forEach(System.out::println);

        /**
         * Usamos la clase PRODUCTO
         */
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1",9.99));
        products.add(new Product("Product2",20.89));
        products.add(new Product("Product3",100.99));
        products.add(new Product("Product4",49.9));

        products.stream()
                .map(Product::getPrice)
                .filter(price -> price >10.0)
                .forEach(System.out::println);
    }
}
