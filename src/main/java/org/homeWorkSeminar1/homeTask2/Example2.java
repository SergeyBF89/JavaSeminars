package org.homeWorkSeminar1.homeTask2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = "";
        result = str.trim();
        String[] words = result.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.printf(words[i] + " ");
        }



    }
}
