package org.Seminar1.classTask1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("result = %d", subtractProductAndSum(n));
        scanner.close();
    }

    /**
     * @apiNote произведение-сумма
     * @param n число
     * @return
     */
    public static int subtractProductAndSum(int n) {
        int summa = 0, multiplication = 1;
        while (n != 0) {
            summa += n % 10;
            multiplication *= n % 10;
            n /= 10;
        }
        return multiplication - summa;
    }
}

