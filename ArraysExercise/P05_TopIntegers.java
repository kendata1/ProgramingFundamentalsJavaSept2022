package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers [i] <= numbers [j]){
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.printf("%d ",numbers [i]);
            }
        }
    }
}
