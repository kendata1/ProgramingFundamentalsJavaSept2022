package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalAmount = 0;
        int totalDays = 0;

        while (startingYield >= 100) {
            totalAmount += startingYield;
            totalAmount -= 26;
            totalDays += 1;
            startingYield -= 10;
        }
        totalAmount -= 26;
        if (totalAmount < 0){
            totalAmount = 0;
        }
        System.out.println(totalDays);
        System.out.println(totalAmount);
    }
}
