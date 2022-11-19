package TextProcessingLAB;

import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            for (int j = 0; j < currentWord.length(); j++) {
                sb.append(currentWord);
            }
        }
        System.out.println(sb);
    }
}
