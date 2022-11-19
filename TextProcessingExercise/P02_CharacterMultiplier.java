package TextProcessingExercise;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = scanner.next();

        int sum = multiplyChars(firstWord,secondWord);
        System.out.println(sum );


    }

    public static int multiplyChars(String firstWord, String secondWord) {
        int sum = 0;

        for (int i = 0; i < Math.min(firstWord.length(), secondWord.length()); i++) {
            sum = sum + firstWord.charAt(i) * secondWord.charAt(i);
        }
        if (firstWord.length() != secondWord.length()) {
            if (firstWord.length() > secondWord.length()) {
                for (int i = secondWord.length(); i < firstWord.length(); i++) {
                    sum += firstWord.charAt(i);
                }
            } else {
                for (int i = firstWord.length(); i < secondWord.length(); i++) {
                    sum += secondWord.charAt(i);
                }
            }
        }
        return sum;
    }
}
