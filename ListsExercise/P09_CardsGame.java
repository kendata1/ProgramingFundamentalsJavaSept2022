package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> fistDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        while (fistDeck.size() != 0 && secondDeck.size() != 0) {

            int firstDeckCard = fistDeck.get(0);
            int secondDeckCard = secondDeck.get(0);
            fistDeck.remove(0);
            secondDeck.remove(0);

            if (firstDeckCard > secondDeckCard){
                fistDeck.add(firstDeckCard);
                fistDeck.add(secondDeckCard);
            } else if (firstDeckCard < secondDeckCard){
                secondDeck.add(secondDeckCard);
                secondDeck.add(firstDeckCard);
            }
        }

        if (fistDeck.size() == 0){
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondDeck));

        } else if (secondDeck.size() == 0) {
            System.out.printf("First player wins! Sum: %d", getCardsSum(fistDeck));

        }
    }
    public static int getCardsSum (List<Integer> cardsList){
        int sum = 0;
        for (int card : cardsList){
            sum += card;
        }
        return sum;
    }
}


