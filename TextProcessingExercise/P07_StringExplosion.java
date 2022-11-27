package TextProcessingExercise;

import java.util.Scanner;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //abv>1>1>2>2asdasd
        StringBuilder textBuilder = new StringBuilder(input);
        int totalStrength = 0;
        for (int i = 0; i < textBuilder.length(); i++) {
            char currentSymbol = textBuilder.charAt(i);
            if (currentSymbol == '>') {
                int powerOfExplosion = Integer.parseInt(textBuilder.charAt(i + 1) + "");
                totalStrength += powerOfExplosion;
                } else if (currentSymbol != '>' && totalStrength > 0){
                textBuilder.deleteCharAt(i);
                totalStrength --;
                i --;
            }
        }
        System.out.println(textBuilder);
    }
}
