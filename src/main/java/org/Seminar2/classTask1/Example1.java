package org.Seminar2.classTask1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(pow(x, n));
    }

    private static double pow(double x, int n) {
        double result = 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        }
        return result;
    }

}
