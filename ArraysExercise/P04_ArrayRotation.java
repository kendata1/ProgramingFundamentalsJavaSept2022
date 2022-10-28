package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotationCount = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < rotationCount; i++) {
            int firstNum = 0;
            for (int j = 0; j < numbersArr.length; j++) {
                if (j == 0) {
                    firstNum = numbersArr[j];
                }
                    if(j > 0) {
                        numbersArr[j - 1] = numbersArr[j];
                    }
            }
            numbersArr [numbersArr.length - 1] = firstNum;
        }
            for (int i = 0; i < numbersArr.length; i++) {
                System.out.printf("%d ", numbersArr[i]);
            }
        }
    }

