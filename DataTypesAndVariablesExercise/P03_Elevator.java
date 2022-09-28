package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double coursesOfElevator = (int) Math.ceil((double) numberOfPeople / capacityOfElevator);
        System.out.printf("%.0f",coursesOfElevator);
    }
}
