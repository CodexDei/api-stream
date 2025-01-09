package org.codexdei.api.stream.example.tests_exercises;

import org.codexdei.api.stream.example.models.product.CATEGORY;
import org.codexdei.api.stream.example.models.product.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class productCalculator {

    public static void main(String[] args) {

        /* El siguiente requerimiento es para una lista de productos List<Producto> ,
        de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.
        La clase Producto debe tener el atributo precio del tipo double y cantidad int,
        entonces utilizando stream convertir la lista de productos en el gran total del tipo double. */

        double totalProduct = Arrays.asList(new Product("Milk", CATEGORY.DAIRY,1,3,105),
                                                  new Product("Beens",CATEGORY.GRAINS,3.5,2,145),
                                                  new Product("Rice",CATEGORY.GRAINS,5,7,180)).stream()
                                    .map(p -> (p.getPrice() * p.getQuantitySould()))
                                    .reduce(0.0,(Double::sum));
        System.out.println(totalProduct);

        /* Dado un flujo de productos con atributos como nombre, precio, y stock,
        encuentra todos los productos con un precio mayor a 5 y un stock mayor a 120.
        Genera una lista de cadenas con el formato:
        "Producto: [nombre], Precio: [precio]". */

        List<Product> productList = Arrays.asList(new Product("Oil",CATEGORY.STAPLES,10,3,105),
                                                  new Product("Beens",CATEGORY.GRAINS,7,2,200),
                                                  new Product("Lentils",CATEGORY.GRAINS,3.5,2,145),
                                                  new Product("Tomato sauce",CATEGORY.STAPLES,10,7,180)).stream()
                .filter(p -> p.getPrice() > 5 && p.getStock() > 120)
                .collect(Collectors.toUnmodifiableList());


        productList.forEach(p -> System.out.println("Product: " + p.getProductName() + ", " + p.getPrice()));

        System.out.println("****************** SOULDS ************************");

        /* Tienes una lista de productos vendidos, donde cada producto pertenece
        a una categoría (por ejemplo, electrónica, ropa, etc.). Calcula el total
        de ingresos generados por categoría. */

        List<Product> productList2 = Arrays.asList(new Product("Milk", CATEGORY.DAIRY,1,3),
                new Product("Beens",CATEGORY.GRAINS,3.5,2),
                new Product("Laptop_lenovo",CATEGORY.ELETRONICS,1000,2),
                new Product("Tablet_Fire",CATEGORY.ELETRONICS,100,2),
                new Product("Beens",CATEGORY.GRAINS,3.5,2),
                new Product("Oil",CATEGORY.STAPLES,5,3),
                new Product("Car",CATEGORY.TOYS,5,3),
                new Product("Margarine",CATEGORY.STAPLES,1,3),
                new Product("Doll",CATEGORY.TOYS,5,3),
                new Product("Rice",CATEGORY.GRAINS,5,7));

        Map<CATEGORY,Double> totalCategory = productList2.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.summingDouble(Product::getTotalPriceSould)
                ));
        totalCategory.forEach( (category,total) ->
                System.out.println("Category: " + category + " Total soulds:" + total));
    }
}
