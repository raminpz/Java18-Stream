package org.example.operacionesterminales;

import org.example.operacionesintermedias.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {

    public static void main(String[] args) {

        /**
         * Usamos la clase PRODUCTO
         */
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1",9.99));
        products.add(new Product("Product2",20.89));
        products.add(new Product("Product3",100.99));
        products.add(new Product("Product4",49.9));


        // Aqui modificamos los precios con la suma y esta multiplicado por 0.21, como el iva
        products.stream()
                .filter(product -> product.getPrice()>10.0)
                .forEach(product ->product.setPrice(product.getPrice() + product.getPrice()*0.21));
        System.out.println("products = " + products);

    }
}
