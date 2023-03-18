package org.Seminar4.classTask2;

import java.util.LinkedList;

public class Emample2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int summa = 0;
        for (int i = 0; i < 10; i++) {
            list.add(i);
            if (i % 2 == 0) {
                summa += i;
            }
        }
        System.out.println(list);
        System.out.println("Сумма четных элементов = " + summa);
//        System.out.println("peek = " + list.peek()); // 0
//        System.out.println(list); // [0, 1, 2, 3, 4, 5]
//        System.out.println("pop = " + list.pop()); // 0
//        System.out.println(list); // [1, 2, 3, 4, 5]
//        list.addFirst(3);
//        System.out.println(list); // [3, 1, 2, 3, 4, 5]
//        list.addLast(7);
//        System.out.println(list); // [3, 1, 2, 3, 4, 5, 7]
//        list.remove(3);
//        System.out.println(list); // [3, 1, 2, 4, 5, 7]
//        list.remove((Integer) 3); // [1, 2, 4, 5, 7]
//        System.out.println(list);
//        System.out.println(list.contains(2)); // true

    }
}
