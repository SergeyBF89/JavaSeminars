package org.Seminar5.classTask3;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        System.out.println(translationNumRomanOfArabic(map));
    }

    /**
     * @param map исходная карта
     * @return перевод из Римских в арабские цифры
     */
    private static int translationNumRomanOfArabic(Map<Character, Integer> map) {
        String str = "LVIII";
        int summa = map.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                summa -= map.get(str.charAt(i));
            } else {
                summa += map.get(str.charAt(i));
            }
        }
        return summa;
    }
}
