package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.contains("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                int numberToSave = inputArr[index2];
                inputArr[index2] = inputArr[index1];
                inputArr[index1] = numberToSave;

            } else if (input.contains("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                int result = inputArr[index1] * inputArr[index2];
                inputArr[index1] = result;

            } else if (input.equals("decrease")) {
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i] = inputArr[i] - 1;
                }

            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < inputArr.length - 1; i++) {
            System.out.printf("%d, ", inputArr [i]);
        }
        System.out.printf("%d", inputArr[inputArr.length - 1]);
    }
}

