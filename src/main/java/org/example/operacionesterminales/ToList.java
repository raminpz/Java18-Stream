package org.example.operacionesterminales;

import org.example.operacionesintermedias.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void main(String[] args) {


        /**
         * Usamos la clase PRODUCTO
         */
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1",9.99));
        products.add(new Product("Product2",20.89));
        products.add(new Product("Product3",100.99));
        products.add(new Product("Product4",49.9));

        // Aquí usando toList(), no mostramos por pantalla, ni guardamos a la bd, sino que despues de obtener los precios, podemos
        // ma dar al front por ejemplo.
        List<Double> prices = products.stream()
                .map(Product::getPrice)
                .filter(price -> price >10.0)
                .collect(Collectors.toList());


        System.out.println("prices = " + prices);

        List<Double> prices2 = products.stream()
                .map(Product::getPrice)
                .filter(price -> price >10.0)
                .toList(); // Aqui abreviado con el método toList()


        System.out.println("prices = " + prices2);
    }
}
