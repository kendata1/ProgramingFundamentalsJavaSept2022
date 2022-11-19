package TextProcessingExercise;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encryptedSb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            char newChar = (char) (currentSymbol + 3);
            encryptedSb.append(newChar);
        }
        System.out.println(encryptedSb);

    }
}
