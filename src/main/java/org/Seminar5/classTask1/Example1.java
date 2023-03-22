package org.Seminar5.classTask1;


import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "if one collection contains a null element";
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i), 0);
            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);

            /**
             *   более старый способ, но тоже рабочий
             *   if (!mapCh.containsKey(str.charAt(i))) {
             *                 mapCh.put(str.charAt(i), 1);
             *             } else {
             *                 mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
             *            }
              */

        }
        for (Map.Entry<Character, Integer> ch : mapCh.entrySet()) {
            System.out.println(ch.getKey() + " встретился - " + ch.getValue() + " раз");
        }
    }
}
