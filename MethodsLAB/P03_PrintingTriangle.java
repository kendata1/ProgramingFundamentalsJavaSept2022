package MethodsLAB;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < num; i++) {
            printLine(1, i);
        }

        printLine(1 , num);

        for (int i = num - 1; i > 0 ; i--) {
            printLine(1,i);
        }

    }

    public static void printLine (int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
