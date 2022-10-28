package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersArr.length - 1; i++) {
            boolean isMagic = false;
            int magicIndex = 0;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] + numbersArr[j] == magicNumber) {
                    isMagic = true;
                    magicIndex = j;
                }
            }
            if (isMagic) {
                System.out.printf("%d %d%n", numbersArr[i], numbersArr[magicIndex]);
            }
        }
    }
}