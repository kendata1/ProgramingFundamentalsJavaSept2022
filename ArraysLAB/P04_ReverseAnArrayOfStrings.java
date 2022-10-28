package ArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] elements = scanner.nextLine().split(" ");
        for (int i = 0; i < elements.length / 2; i++) {
            String savedElement = elements [i];
            elements [i] = elements [elements.length - 1 - i];
            elements [elements.length - 1 - i] = savedElement;
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("%s ", elements [i]);
        }
    }
}
