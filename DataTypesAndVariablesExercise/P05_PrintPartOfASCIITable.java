package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startingNumber; i <= lastNumber; i++) {
            char currentSymbol = (char) i;
            System.out.printf("%c ",currentSymbol);
        }
    }
}
