package org.Seminar3.classTask4;

import org.Seminar3.classTask3.model.Cube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(13, "Зеленый", "Деревянный");
        Cube cube2 = new Cube(73, "Желтый", "Металлический");
        Cube cube3 = new Cube(23, "Красный", "Картонный");
        Cube cube4 = new Cube(23, "Красный", "Картонный");
        Cube cube5 = new Cube(23, "Красный", "Картонный");
        Cube cube6 = new Cube(3, "Желтый", "Металлический");

        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        cubeList.add(cube5);
        cubeList.add(cube6);
        System.out.println("входящая коллекция : " + cubeList.size());
        System.out.println("уникальная коллекция : " + uniqueCollection(cubeList).size());
    }

    /**
     * @param cubeList входящая коллекция
     * @return уникальную коллекцию
     */
    private static Collection<Cube> uniqueCollection(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }
}
