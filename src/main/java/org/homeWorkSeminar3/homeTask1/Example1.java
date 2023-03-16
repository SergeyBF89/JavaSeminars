package org.homeWorkSeminar3.homeTask1;

import org.homeWorkSeminar3.homeTask1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        Product product1 = new Product("Водка", 399.99, 2);
        Product product2 = new Product("Водка высший градус", 1200.0, 1);
        Product product3 = new Product("Виски высший Шотландский", 4999.89, 1);
        Product product4 = new Product("Виски", 2400.99, 1);
        Product product5 = new Product("Коньяк", 700.0, 2);
        Product product6 = new Product("Пиво высший сорт", 250.0, 2);

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);

        String searchName = "высший";
        Double maxPrice = 0.0;

        for (Product product : productList) {
            if (product.getNameProduct().toLowerCase().contains(searchName) && product.getSort() == 1
                    || product.getSort() == 2) {
                if (maxPrice < product.getPrice()) {
                    maxPrice = product.getPrice();
                }
            }
        }
        System.out.println("Наибольшая цена товара 1-й или 2-й категории со словом \"высший\" = " + maxPrice);

    }
}
