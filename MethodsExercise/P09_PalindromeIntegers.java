package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            System.out.println(isItPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isItPalindrome(String input) {
        char[] numbersStraightArr = new char[input.length()];
        char[] numbersBackwardsArr = new char[input.length()];

        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            numbersStraightArr[i] = currentSymbol;
        }
        int arrIndex = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentSymbol = input.charAt(i);
            numbersBackwardsArr[arrIndex] = currentSymbol;
            arrIndex += 1;
        }
        if (Arrays.equals(numbersBackwardsArr, numbersStraightArr)) {
            isPalindrome = true;
        } else {
            isPalindrome = false;
        }
        return isPalindrome;
    }
}
