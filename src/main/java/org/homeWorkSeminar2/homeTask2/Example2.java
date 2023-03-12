package org.homeWorkSeminar2.homeTask2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isSequenceGrowth(n));
    }

    /**
     * @param n длинна последовательности
     * @return если последовательность возрастающая или нет
     */
    private static boolean isSequenceGrowth(int n) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int y = scanner.nextInt();
            if (y <= x) {
                return false;
            }
        }
        return true;

    }
}
