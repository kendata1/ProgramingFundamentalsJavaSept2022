package MethodsExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_FactorielDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        if (firstNum >= 0 && secondNum >=0){

            double factorielDivision = (double) returnFactoriel(firstNum) / returnFactoriel(secondNum);
            System.out.println(new DecimalFormat("0.00").format(factorielDivision));
        }
    }
    public static long returnFactoriel(int num){
        long factoriel = 1;
        for (int i = num; i > 0; i--) {
            factoriel = factoriel * i;
        }
        return factoriel;
    }
}
