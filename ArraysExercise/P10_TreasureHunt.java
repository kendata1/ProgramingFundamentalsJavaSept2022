package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] initialLoot = scanner.nextLine().split("\\|");
        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")){
            String [] commandArr = input.split(" ");

            switch (commandArr[0]) {
                case "Loot":
                    for (int i = 1; i < commandArr.length; i++) {
                        boolean alreadyContained = false;
                        for (int j = 0; j < initialLoot.length; j++) {
                            if (commandArr[i].equals(initialLoot[j])) {
                                alreadyContained = true;
                                break;
                            }
                        }
                        if (!alreadyContained) {
                            String newChest = commandArr[i] + " " + String.join(" ", initialLoot);
                            initialLoot = newChest.split(" ");
                        }
                    }
                    break;

                case "Drop":
                    int position = Integer.parseInt(commandArr[1]);
                    if(position >= 0 && position < initialLoot.length){
                        String dropItem = initialLoot [position];
                        for (int i = position; i < initialLoot.length - 1; i++) {
                        initialLoot [i] = initialLoot[i + 1];
                        }
                        initialLoot [initialLoot.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArr[1]);
                    if (count >= 0 && count < initialLoot.length){
                        for (int i = 0; i < count; i++) {
                            System.out.print(initialLoot[initialLoot.length - count + i]);
                            if (i != count - 1){
                                System.out.print(", ");
                            }
                        }
                        String [] tempChest = new String[initialLoot.length - count];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = initialLoot[i];
                        }
                        initialLoot = tempChest;
                    } else if (count >= 0){
                        for (int i = 0; i < initialLoot.length; i++) {
                            System.out.print(initialLoot[i]);
                            if (i != initialLoot.length - 1){
                                System.out.print(", ");
                            }
                        }
                        initialLoot = new String[0];
                    }
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();
        }
        String treasureCount = String.join("",initialLoot);
        int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter ++;
        }
        double averageGain = (1.0 * charCounter) / initialLoot.length;

        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
