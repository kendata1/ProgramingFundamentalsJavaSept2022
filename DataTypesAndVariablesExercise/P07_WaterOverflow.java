package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int quantityOfWater = Integer.parseInt(scanner.nextLine());
            sum += quantityOfWater;

            if (sum > 255){
                System.out.printf("Insufficient capacity!%n");
                sum -= quantityOfWater;
            }
        }
        System.out.println(sum);
    }
}
