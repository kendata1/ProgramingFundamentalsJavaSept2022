package TextProcessingLAB;

import java.util.Scanner;

public class P05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder digitsSb = new StringBuilder();
        StringBuilder lettersSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            if(Character.isDigit(currentSymbol)){
                digitsSb.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)){
                lettersSb.append(currentSymbol);
            } else {
                otherSb.append(currentSymbol);
            }
        }
        System.out.printf("%s%n%s%n%s%n",digitsSb,lettersSb,otherSb);
    }
}
