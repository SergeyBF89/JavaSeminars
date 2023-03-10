package org.Seminar2.classTask2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        System.out.println(summa5());

    }
    public static int summa5() {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        int n = scanner.nextInt();
        int lastNum = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int currentNum = scanner.nextInt();
            if (currentNum % 10 == 5 && lastNum % 2 == 0) {
                summa +=currentNum;
            }
            lastNum = currentNum;
        }
        scanner.close();
        return summa;
    }
}
