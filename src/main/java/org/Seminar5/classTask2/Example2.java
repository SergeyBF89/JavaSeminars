package org.Seminar5.classTask2;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 1};
        System.out.println(searchDubl(array));
        System.out.println(searchTwoDubl(array));
    }

    /**
     * 1-й способ
     * @param array исходный массив
     * @return есть ли дубликаты в массиве
     */
    private static boolean searchDubl(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                return true;
            } else {
                map.put(array[i], 1);
            }
        }
        return false;
    }

    /**
     * 2-й способ
     * @param array исходный массив
     * @return есть ли дубликаты в массиве
     */
    private static boolean searchTwoDubl (int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 1);
        }
        return (map.size() != array.length);
    }
}
