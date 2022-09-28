package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11_SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowBalls = Integer.parseInt(scanner.nextLine());
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;
        double bestValue = 0;

        for (int i = 1; i <=numberOfSnowBalls ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((double)snowballSnow / snowballTime,snowballQuality);
            if(snowballValue > bestValue){
                bestValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime =snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnowballSnow , bestSnowballTime, bestValue, bestSnowballQuality);
    }
}
