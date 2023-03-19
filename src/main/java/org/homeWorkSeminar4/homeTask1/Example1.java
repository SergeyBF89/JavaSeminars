package org.homeWorkSeminar4.homeTask1;

import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(turnOverList(list));
    }

    /**
     * @param list исходный список
     * @return перевернутый список
     */
    private static LinkedList<Integer> turnOverList (LinkedList<Integer> list) {
        LinkedList<Integer> resultList = new LinkedList<>();
        while (list.size() > 0) {
            resultList.addFirst(list.pop());
        }
        return resultList;
    }

}
