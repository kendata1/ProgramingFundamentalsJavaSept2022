package DataTypesAndVariablesLAB;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);
        char symbolThree = scanner.nextLine().charAt(0);

        String word = String.valueOf(symbolOne) + String.valueOf(symbolTwo) + String.valueOf(symbolThree);
        System.out.println(word);
    }
}
