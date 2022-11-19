package TextProcessingExercise;

import java.util.Scanner;

public class P06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char firstOccur = input.charAt(0);

        StringBuilder editedSb = new StringBuilder();
        editedSb.append(firstOccur);

        for (int i = 1; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (firstOccur != currentSymbol){
                editedSb.append(currentSymbol);
                firstOccur = currentSymbol;
            }
        }
        System.out.println(editedSb);
    }
}
