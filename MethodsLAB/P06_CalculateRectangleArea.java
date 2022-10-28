package MethodsLAB;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double area = getRectangleArea(height,width);

        System.out.printf("%.0f",area);
    }
    public static double getRectangleArea (double height, double width){
        return height * width;
    }
}
