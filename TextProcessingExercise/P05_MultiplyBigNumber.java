package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstBi = new BigInteger(scanner.nextLine());
        BigInteger secondBi = new BigInteger(scanner.nextLine());

        System.out.println(firstBi.multiply(secondBi));
    }
}
