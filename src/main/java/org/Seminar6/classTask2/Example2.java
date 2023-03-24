package org.Seminar6.classTask2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        Set<Integer> cross = new HashSet<>(set1);
        cross.retainAll(set2);
        System.out.println(cross);
    }
}
