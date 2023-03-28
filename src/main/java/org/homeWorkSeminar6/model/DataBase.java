package org.homeWorkSeminar6.model;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class DataBase {
    public static Set<Laptop> createBase(Integer number) {
        Set<Laptop> result = new LinkedHashSet<>();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int ramSize = (int) Math.pow(2, (1 + rand.nextInt(6)));
            int diskSize = 1 + rand.nextInt(4);
            String os = (rand.nextInt(2) == 0 ? "Windows" : "Mac OS");
            String color = getRandomColor();
            Laptop note= new Laptop("model - " + i, ramSize, diskSize, os, color);
            result.add(note);
        }
        return result;
    }

    private static String getRandomColor() {
        int i = new Random().nextInt(6);
        switch (i) {
            case 1 -> {
                return "red";
            }
            case 2 -> {
                return "blue";
            }
            case 3 -> {
                return "silver";
            }
            case 4 -> {
                return "gold";
            }
            case 5 -> {
                return "black";
            }
            default -> {
                return "white";
            }
        }
    }

    public static void printBase(Set<Laptop> base) {
        for (Laptop item : base) {
            System.out.println(item);
        }
    }
}