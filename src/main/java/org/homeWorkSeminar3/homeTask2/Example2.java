package org.homeWorkSeminar3.homeTask2;

import org.homeWorkSeminar3.homeTask2.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", "Россия", 0.5, 54.5, 1);
        Product product2 = new Product("Пельмени", "Россия", 0.7, 350.0, 1);
        Product product3 = new Product("Макароны", "Россия", 0.9, 45.99, 2);
        Product product4 = new Product("Маргарин", "Россия", 0.4, 35.0, 3);
        Product product5 = new Product("Картофель эконом", "Россия", 1.0, 24.5, 2);
        Product product6 = new Product("Морковь эконом", "Россия", 1.0, 24.5, 2);
        Product product7 = new Product("Пшено", "Россия", 0.9, 19.99, 3);
        Product product8 = new Product("Бананы", "Эквадор", 1.0, 54.8, 1);

        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт продукта 1, 2, или 3 :");
        int sortProduct = scanner.nextInt();
        Double minPrice = productList.get(0).getPrice();
        scanner.close();

        for (Product product : productList) {
            if (product.getSort().equals(sortProduct) && product.getPrice() < minPrice) {
                minPrice = product.getPrice();
            }
        }
        StringBuilder name = new StringBuilder();
        for (Product product : productList) {
            if (product.getSort().equals(sortProduct) && Objects.equals(product.getPrice(), minPrice)) {
                name.append(product.getNameProduct()).append("\n");
            }
        }
        System.out.println(name + "Цена = " + minPrice);

    }
}
