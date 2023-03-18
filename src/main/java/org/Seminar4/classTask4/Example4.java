package org.Seminar4.classTask4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, -2, -3, 4, -5, 6, 7, -8, -9));
        System.out.println(solution(list));
        System.out.println(solution11(list));
    }

    /**
     * @param list исходный список
     * @return список без отрицательных элементов (удаление с лева на право)
     */
    private static List<Integer> solution (List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    /**
     * @param list исходный список
     * @return список без отрицательных элементов (удаление с права на лево)
     */
    private static List<Integer> solution11 (List<Integer> list) {
        for (int i = list.size()- 1; i >= 0; i--) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        return list;
    }
}
