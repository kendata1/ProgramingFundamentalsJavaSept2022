package TextProcessingExercise;

import java.util.Scanner;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //abv>1>1>2>2asdasd
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol == '>') {
                int explosionIndex = i;
                int powerOfExplosion = Character.getNumericValue(input.charAt(i + 1));

                for (int j = 1; j <= powerOfExplosion; j++) {

                }
            }
        }
    }
}
