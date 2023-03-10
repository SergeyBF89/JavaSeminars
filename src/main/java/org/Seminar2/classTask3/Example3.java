package org.Seminar2.classTask3;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 5, 7, 18, 9, 4, 2, 1}));
    }
    public static int solution(int[] inputArray) {
        int count = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] == inputArray[i] * 2) {
                count++;
            }
        }
        return count;
    }
}
