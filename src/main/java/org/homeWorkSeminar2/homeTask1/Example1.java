package org.homeWorkSeminar2.homeTask1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isSumPrimeNum(n));
    }

    /**
     * @param n длинна последовательности
     * @return сумму простых чисел
     */
    private static int isSumPrimeNum (int n) {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (isPrime(number)) {
                summa += number;
            }
        }
        return summa;
    }

    /**
     * @param number число для проверки
     * @return простое число или нет
     */
    private static boolean isPrime(int number) {
        Double sq = Math.sqrt(number);
        for (int i = 2; i <= sq.intValue(); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
