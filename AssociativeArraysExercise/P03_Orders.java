package AssociativeArraysExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap <String, Double> ordersMap = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String [] inputArr = input.split(" ");

            String name = inputArr [0];
            double price = Double.parseDouble(inputArr[1]);
            int quantity = Integer.parseInt(inputArr [2]);
            double totalPrice = price * quantity;

            if (!ordersMap.containsKey(name)){
                ordersMap.put(name,totalPrice);
            } else {
                ordersMap.put(name, )
            }


            input = scanner.nextLine();
        }
    }
}
