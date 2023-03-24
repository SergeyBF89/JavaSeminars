package org.Seminar6.classTask1;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        Set<Integer> set = new HashSet<>(array);
        double percent = set.size() * 100 / array.size();
        System.out.println("percent = " + percent);
    }
}
