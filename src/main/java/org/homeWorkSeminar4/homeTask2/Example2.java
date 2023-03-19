package org.homeWorkSeminar4.homeTask2;

import java.util.Deque;
import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        String inputString1 = "()";
        String inputString2 = "()[]{}";
        String inputString3 = "(]";

        System.out.println(inputString1 + ": " + isValid(inputString1));
        System.out.println(inputString2 + ": " + isValid(inputString2));
        System.out.println(inputString3 + ": " + isValid(inputString3));
    }

    /**
     * @param inputString исходные строки
     * @return действительны или нет входные данные
     */
    private static boolean isValid (String inputString) {
        char[] array = inputString.toCharArray();
        Deque deque = new LinkedList();
        String open = "([{";
        for (Character ch : array) {
            if (open.contains(ch.toString())) deque.add(ch);
            else if (deque.isEmpty()) return false;
            else if (ch.equals(']') && !deque.pollLast().equals('[')) return false;
            else if (ch.equals(')') && !deque.pollLast().equals('(')) return false;
            else if (ch.equals('}') && !deque.pollLast().equals('{')) return false;
        }
        return deque.isEmpty();
    }
}
