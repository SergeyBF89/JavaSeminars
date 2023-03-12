package org.Seminar3.classTask1;

import org.Seminar3.classTask1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Items items = new Items("qwe", "zxc", 3.0); // создание элементов
        Items items1 = new Items("qwe1", "asd", 3.0);
        Items items2 = new Items("qwe2", "ert", 3.0);
        Items items3 = new Items("qwe", "dfg", 3.0);

        List<Items> itemsList = new ArrayList<>(); // создание листа(массива)
        itemsList.add(items); // добавление элементов в массив
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        int sumVolume = 0;
        List<String> country = new ArrayList<>(); // лист для накопления стран
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)) {
                sumVolume += itemsList.get(i).getVolume(); // накопили сумму
                country.add(itemsList.get(i).getCountry()); // добавили страну
            }
        }
        System.out.println("summa = " + sumVolume);
        System.out.println(" country : " + country);

    }
}
