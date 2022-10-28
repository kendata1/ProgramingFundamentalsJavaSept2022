package MethodsLAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(getResultOfMathOperations(firstNum, operator, secondNum)));


    }

    public static double getResultOfMathOperations(int firstNum, String operator, int secondNum) {
        double result = 0;

        switch (operator) {
            case "/":
                result = (double) firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
        }
        return result;
    }
}

