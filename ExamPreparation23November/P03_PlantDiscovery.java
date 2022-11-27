package ExamPreparation23November;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map <String, Integer> rarityMap = new HashMap<>();
        Map <String,Double> ratingMap = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String [] inputArr = input.split("<->");
            String plantName = inputArr [0];
            int rarity = Integer.parseInt(inputArr [1]);

            ratingMap.put(plantName,0.0);

            rarityMap.put(plantName,rarity);
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandArr = command.split("[: -]+");
            String toDo = commandArr[0];
            String plantName = commandArr[1];
            if (!rarityMap.containsKey(plantName)) {
                System.out.println("error");
            } else {
                switch (toDo) {
                    case "Rate":
                        double rating = Double.parseDouble(commandArr[2]);
                        if (ratingMap.get(plantName) == 0.0){
                            ratingMap.put(plantName, rating);
                        } else {
                            double averageRating = (ratingMap.get(plantName) + rating) / 2;
                            ratingMap.put(plantName,averageRating);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(commandArr[2]);
                        rarityMap.put(plantName, newRarity);
                        break;
                    case "Reset":
                        ratingMap.put(plantName, 0.0);
                        break;
                }
                command = scanner.nextLine();
            }
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : rarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), ratingMap.get(entry.getKey()));
        }
    }
}
