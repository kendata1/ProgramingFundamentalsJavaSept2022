package MethodsExercise;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.printf("%s", middleChar(input));


    }
    public static String middleChar (String input){
        char middleChar = input.charAt(input.length() / 2);
        char secondMiddleChar = input.charAt(input.length() / 2 - 1);

        String middleCharStr = "" + middleChar;
        String middleChars = "" + secondMiddleChar + middleChar;

        if (input.length() % 2 == 0){
            return  middleChars;
        } else {
            return middleCharStr;
        }
    }
}
