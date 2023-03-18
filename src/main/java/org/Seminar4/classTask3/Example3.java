package org.Seminar4.classTask3;

import java.util.LinkedList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(solution(list));
    }

    /**
     * @param list исходный список элементов
     * @return измененный список элементов
     */
    private static List<Integer> solution(List<Integer> list) {
        int notEvenSum = 0;
        for (Integer el : list) {
            if (el % 2 != 0) {
                notEvenSum += el;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 != 0) {
                list.set(i, notEvenSum);
            }
        }
        return list;
    }
}
