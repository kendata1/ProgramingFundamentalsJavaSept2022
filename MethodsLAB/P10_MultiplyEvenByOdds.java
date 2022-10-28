package MethodsLAB;

import java.util.Scanner;

public class P10_MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultiplesOfEvensAndOdds(Math.abs(input)));

    }
    public static int getEvenSum (int number){
        int evenSum = 0;
        for (int i = 0; number > 0; i++) {
            int currentNum = number % 10;
            if (currentNum % 2 == 0){
                evenSum += currentNum;
            }
            number = number / 10;
        }
        return evenSum;
    }
    public static int getOddSum (int number){
        int oddSum = 0;
        for (int i = 0; number > 0; i++) {
            int currentNum = number % 10;
            if (currentNum % 2 != 0){
                oddSum += currentNum;
            }
            number = number / 10;
        }
        return oddSum;
    }
    public static int getMultiplesOfEvensAndOdds (int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        return evenSum * oddSum;
    }
}
