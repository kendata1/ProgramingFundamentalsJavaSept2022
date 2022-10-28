package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(Locale.ROOT);
        printCountOfVowels(input);

    }
    public static void printCountOfVowels (String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i' || currentSymbol == 'o' || currentSymbol == 'u'){
                vowelsCount += 1;
            }
        }
        System.out.println(vowelsCount);
    }
}
