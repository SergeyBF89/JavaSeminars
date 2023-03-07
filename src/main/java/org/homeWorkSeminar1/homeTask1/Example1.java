package org.homeWorkSeminar1.homeTask1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int summa = 0;
        while (numbers != 0) {
            int secondNum = scanner.nextInt();
            if (numbers > 0 && secondNum < 0) {
                summa += numbers;
            }
            numbers = secondNum;
        }
        System.out.println("summa = " + summa);
        scanner.close();
    }
}
