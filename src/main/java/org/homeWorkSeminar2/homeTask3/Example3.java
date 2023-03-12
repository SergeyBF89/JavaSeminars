package org.homeWorkSeminar2.homeTask3;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] myArray = new int[] {1, 3, 99, 10, -4, -5, -77, 9, 8};
        int summa = 0;
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] <= -10 && myArray[i] >= -99 || myArray[i] >= 10 && myArray[i] <= 99) {
                summa += i;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 0) {
                myArray[i] = summa;
            }
        }
        System.out.println(Arrays.toString(myArray));

    }
}
