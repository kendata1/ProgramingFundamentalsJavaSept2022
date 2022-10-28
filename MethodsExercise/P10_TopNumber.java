package MethodsExercise;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            if (isHoldingOddDigit(i) && isSumDivisibleByEight(i)){
                System.out.println(i);
            }
        }


    }
    public static boolean isSumDivisibleByEight (int num){
        int sum = 0;
        boolean isItDivisible = true;
       while (num > 0){
           int currentDigit = num % 10;
           sum += currentDigit;

           num = num / 10;
       }
       if (sum % 8 != 0){
           isItDivisible = false;
       }
       return isItDivisible;
    }
    public static boolean isHoldingOddDigit (int num){

        boolean isHoldingOddDigit = false;

        while (num > 0){
            int currentDigit = num % 10;

            if (currentDigit % 2 != 0) {
                isHoldingOddDigit = true;
            }
            num = num / 10;
        }
        return isHoldingOddDigit;
    }
}
