package ArraysExercise;

import java.util.Scanner;

public class P03_ZIgZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] redArr = new String[n];
        String[] blueArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                if (i % 2 != 0) {
                    if (j == 0) {
                        redArr[i - 1] = input[j];
                    } else {
                        blueArr[i - 1] = input[j];
                    }
                } else {
                    if (j == 0) {
                        blueArr[i - 1] = input[j];
                    } else {
                        redArr[i - 1] = input[j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(redArr [i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(blueArr [i] + " ");
        }
    }
}