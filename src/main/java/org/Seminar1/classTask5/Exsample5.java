package org.Seminar1.classTask5;

import java.util.Scanner;

public class Exsample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
//            array[i] = i;
            array[i] = scanner.nextInt();
        }
        int [] res = new int[n];
        res[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            res[i] = res[i -1] + array[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

}
