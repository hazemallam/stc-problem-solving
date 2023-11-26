package org.stc.utilties;

import java.util.Stack;

public class Strings {
    public static String reverseSubstring(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder result = new StringBuilder();
        Stack<Integer> indces = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                indces.push(i);
            } else if (charArray[i] == ')') {
                reverse(charArray, indces.pop() + 1, i - 1);
            }
        }

        for (char c : charArray) {
                result.append(c);
        }

        return result.toString();
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
