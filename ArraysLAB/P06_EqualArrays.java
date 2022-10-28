package ArraysLAB;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int diffIndex = 0;
        boolean isIdentical = true;

        for (int i = 0; i < firstArr.length; i++) {
            int firstArrNumber = firstArr [i];
            int secondArrNumber = secondArr [i];

            if (firstArrNumber == secondArrNumber){
                sum += firstArrNumber;
            }else{
                isIdentical = false;
                diffIndex = i;
                break;
            }
        }
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",diffIndex);
        }
    }
}
