package MethodsExercise;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNum(firstNum,secondNum,thirdNum);
    }
    public static void printSmallestNum (int firstNum, int secondNum, int thirdNum) {
        int smallestNum = firstNum;

        if (secondNum < smallestNum) {
            smallestNum = secondNum;
        }
        if (thirdNum < smallestNum){
            smallestNum = thirdNum;
        }
        System.out.printf("%d",smallestNum);
    }
}
