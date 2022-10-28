package ArraysExercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (secondArr [j].equals(firstArr [i])){
                    System.out.print(secondArr [j] + " ");
                }
            }
        }
    }
}
