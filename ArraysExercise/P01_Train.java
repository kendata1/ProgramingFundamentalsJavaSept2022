package ArraysExercise;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int [] peopleInWagonArr = new int [wagonsCount];
        int sum = 0;

        for (int i = 0; i < wagonsCount; i++) {
            peopleInWagonArr [i] = Integer.parseInt(scanner.nextLine());
            sum += peopleInWagonArr [i];
        }
        for (int i = 0; i < wagonsCount; i++) {
            System.out.printf("%d ",peopleInWagonArr [i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
