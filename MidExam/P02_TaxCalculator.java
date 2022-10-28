package MidExam;

import java.util.Scanner;

public class P02_TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(">>");
        double totalTax = 0;
        for (int i = 0; i < input.length; i++) {
            String [] carArr = input[i].split(" ");
            double tax = 0;
            switch (carArr[0]){
                case "family":
                    tax = 50.0;
                    tax = tax - Integer.parseInt(carArr[1]) * 5.0;
                    tax = tax + Math.floor((Integer.parseInt(carArr[2]) / 3000.0)) * 12;
                    totalTax += tax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",carArr[0],tax);
                    break;
                case "heavyDuty":
                    tax = 80.0;
                    tax = tax - Integer.parseInt(carArr[1]) * 8.0;
                    tax = tax + Math.floor((Integer.parseInt(carArr[2]) / 9000.0)) * 14;
                    totalTax += tax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",carArr[0],tax);
                    break;
                case "sports":
                    tax = 100.0;
                    tax = tax - Integer.parseInt(carArr[1]) * 9.0;
                    tax = tax + Math.floor((Integer.parseInt(carArr[2]) / 2000.0)) * 18;
                    totalTax += tax;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",carArr[0],tax);
                    break;
                default:
                    System.out.println("Invalid car type.");
                    break;
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.",totalTax);
    }
}
