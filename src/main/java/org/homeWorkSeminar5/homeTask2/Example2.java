package org.homeWorkSeminar5.homeTask2;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        String str = "Россия идёт вперед всей планеты. Россия - это не планета.".toLowerCase();
        String searchWord = "Россия".toLowerCase();
        Integer count = desiredWord(str, searchWord);
        System.out.println("кол-во искомого слова: " + searchWord + " = " + count);

    }

    /**
     * @param str входная строка
     * @param searchWord искомое слово
     * @return кол-во искомого слова
     */
    private static Integer desiredWord(String str, String searchWord) {
        Map<String, Integer> map = new HashMap<>();
        String[] arrayText = str.split(" ");
        for (String current : arrayText) {
            if (!searchWord.equals(current.toLowerCase())) {
                continue;
            }
            int count = map.getOrDefault(searchWord.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }
        return map.get(searchWord);
    }


}
