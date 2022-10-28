package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> cardsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();
            String [] commandArr = input.split(", ");

            switch (commandArr[0]) {
                case "Add":
                    if (cardsList.contains(commandArr[1])) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cardsList.add(commandArr[1]);
                        System.out.println("Card successfully added");
                    }
                    break;

                case "Remove":
                    if (cardsList.contains(commandArr[1])) {
                        cardsList.remove(commandArr[1]);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;

                case "Remove At":
                    int index = Integer.parseInt(commandArr[1]);
                    if (!(index >= 0 && index < cardsList.size())) {
                        System.out.println("Index out of range");
                    } else {
                        cardsList.remove(index);
                        System.out.println("Card successfully removed");
                    }
                    break;


                case "Insert":
                    int indexToInsert = Integer.parseInt(commandArr[1]);
                    if (!(indexToInsert >= 0 && indexToInsert < cardsList.size())) {
                        System.out.println("Index out of range");
                    } else {
                        if (cardsList.contains(commandArr[2])) {
                            System.out.println("Card is already added");
                        } else {
                            cardsList.add(indexToInsert, commandArr[2]);
                            System.out.println("Card successfully added");
                        }
                    }

                    break;
            }
        }
        System.out.println(String.join(", ", cardsList));
    }
}
