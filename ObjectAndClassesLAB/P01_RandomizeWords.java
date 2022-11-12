package ObjectAndClassesLAB;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] wordsArr = input.split("\\s+");
        Random rnd = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int randomIntGenerator = rnd.nextInt(wordsArr.length);
            String saveWord = wordsArr[i];

            wordsArr [i] = wordsArr [randomIntGenerator];
            wordsArr [randomIntGenerator] = saveWord;
        }
        System.out.println(String.join(System.lineSeparator(),wordsArr));
    }
}
