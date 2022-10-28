package MethodsLAB;

import java.util.Scanner;

public class P01_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        printSignInteger(num);

    }
    public static void printSignInteger(int num) {
        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        } else  if (num < 0){
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.printf("The number %d is zero.",num);
        }
    }
}
