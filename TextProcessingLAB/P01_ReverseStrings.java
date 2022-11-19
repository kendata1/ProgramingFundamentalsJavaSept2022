package TextProcessingLAB;

import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("end")){
            StringBuilder sb = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                char currentSymbol = word.charAt(i);
                sb.append(currentSymbol);
            }
            System.out.printf("%s = %s%n",word,sb);

            word = scanner.nextLine();
        }
    }
}
