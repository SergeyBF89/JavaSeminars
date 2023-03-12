package org.Seminar3.classTask3;

import org.Seminar3.classTask3.model.Cube;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(13, "Зеленый", "Деревянный"); // задаем параметры кубов
        Cube cube2 = new Cube(73, "Желтый", "Металлический");
        Cube cube3 = new Cube(23, "Красный", "Картонный");
        Cube cube4 = new Cube(3, "Желтый", "Металлический");

        List<Cube> cubeList = new ArrayList<>(); // создали список кубов
        cubeList.add(cube1); // заполняем список кубов
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);

        int countCubeYel = 0;
        int summaVolume = 0;
        int countCubeWood = 0;

        for (Cube cube : cubeList) { // проход по листу
            if (cube.getColor().equals("Желтый")) {
                countCubeYel++;
                summaVolume += volumeCube(cube.getSize());
            }
            if (cube.getMaterial().equals("Деревянный") && cube.getSize() == 3) {
                countCubeWood++;
            }
        }
        System.out.println("кол-во желтых кубиков = " + countCubeYel + " и их суммарный размер = " + summaVolume);
        System.out.println("кол-во деревянных кубиков с ребром 3 см = " + countCubeWood);
    }

    /**
     * @param size сторона куба
     * @return объем куба
     */
    private static int volumeCube(Integer size) {
        return size * size * size;
    }
}
