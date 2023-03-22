package org.homeWorkSeminar5.homeTask1;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        wordsText();
    }

    /**
     * кол-во входящих слов и их вывод
     */
    private static void wordsText () {
        String str = "Россия идёт вперед всей планеты. Россия - это не планета.";
        String[] arrayText = str.split(" ");
        Map<String, Integer> map = countWords(arrayText);
        for (Map.Entry<String, Integer> word : map.entrySet()) {
            System.out.println(word.getKey() + " : встречается = " + word.getValue() + " раз");
        }
    }

    /**
     * @param arrayText строковый массив
     * @return счетчик вхождений слов
     */
    private static Map<String, Integer> countWords (String[] arrayText) {
        Map<String, Integer> map = new HashMap<>();
        for (String current : arrayText) {
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }
        return map;
    }


}
