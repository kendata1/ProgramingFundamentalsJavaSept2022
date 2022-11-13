package AssociativeArraysExercise;

import java.util.*;

public class P03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap <String, List <Double> > ordersMap = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String [] inputArr = input.split(" ");

            String name = inputArr [0];
            double price = Double.parseDouble(inputArr[1]);
            double quantity = Double.parseDouble(inputArr [2]);

            if (!ordersMap.containsKey(name)){
                ordersMap.put(name, new ArrayList<>());
                ordersMap.get(name).add(price);
                ordersMap.get(name).add(quantity);
            } else {
                double oldQuantity = ordersMap.get(name).get(1);
                ordersMap.get(name).set(0,price);
                ordersMap.get(name).set(1,oldQuantity + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : ordersMap.entrySet()) {
            double totalPrice = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }

    }
}
