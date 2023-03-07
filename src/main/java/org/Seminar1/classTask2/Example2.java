package org.Seminar1.classTask2;


import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        int a = scanner.nextInt();
        for (int i = 1; i < N; i++) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                count++;
            }
            a = b;
        }
        System.out.println("count = " + count);
        scanner.close();
    }
}
