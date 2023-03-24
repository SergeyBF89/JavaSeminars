package org.Seminar6.classTask3;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {

        /**
         *  вариант решения через Set и Map
         */

        List<String> mas1 = new ArrayList<>(List.of("qwe", "asd", "qwe", "x"));
        List<String> mas2 = new ArrayList<>(List.of("qwe", "v", "x"));
        Set<String> cross = new HashSet<>(mas1);
        List<String> all = new ArrayList<>(mas1);
        all.addAll(mas2);
        cross.retainAll(mas2);

        Map<String, Integer> count2 = new HashMap<>();

        /**
         * Set решение
         */

        for (String item : cross) {
            int count = 0;
            for (String allItem : all) {
                if (item.equals(allItem)) {
                    count++;
                    /**
                     * Map решение
                     */
                    Integer itemCount = count2.get(item);
                    if (itemCount == null) itemCount = 0;
                    itemCount++;
                    count2.put(item, itemCount);
                }
            }
            System.out.println(item + " = " + count);
        }
        System.out.println(count2);
    }
}
