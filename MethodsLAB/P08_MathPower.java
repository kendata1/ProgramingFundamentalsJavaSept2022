package MethodsLAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(num,power)));
    }
    public static double mathPower(double num , double power){
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * num;
        }
        return result;
    }
}
