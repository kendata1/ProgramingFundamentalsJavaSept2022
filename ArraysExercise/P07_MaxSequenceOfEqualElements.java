package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int biggestCount = 0;
        int[] longestSequenceArr = new int[0];
        for (int i = 0; i < numbersArr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] == numbersArr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            int[] longSequenceArr = new int[count + 1];
            if (count > biggestCount) {
                biggestCount = count;
                for (int j = 0; j <= count; j++) {
                    longSequenceArr[j] = numbersArr[i];
                }
                longestSequenceArr = longSequenceArr;
            }
        }
        for (int z = 0; z <= biggestCount; z++) {
            System.out.printf("%d ", longestSequenceArr[z]);
        }
    }
}

