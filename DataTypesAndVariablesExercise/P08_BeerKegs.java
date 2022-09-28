package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestSize = 0;
        String  modelOfBiggestKeg = "";

        for (int i = 1; i <=n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double size = Math.PI * Math.pow(radius, 2) * height;
            if (size > biggestSize){
                biggestSize = size;
                modelOfBiggestKeg = model;
            }
        }
        System.out.printf("%s",modelOfBiggestKeg);
    }
}
