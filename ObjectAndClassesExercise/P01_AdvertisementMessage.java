package ObjectAndClassesExercise;

import java.util.Random;
import java.util.Scanner;

public class P01_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String [] Phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String [] Events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String [] Authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] Cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();
        for (int i = 1; i <= number; i++) {

        int randomPhrase = rnd.nextInt(Phrases.length);
        int randomEvent = rnd.nextInt(Events.length);
        int randomAuthor = rnd.nextInt(Authors.length);
        int randomCity = rnd.nextInt(Cities.length);

        System.out.printf("%s %s %s - %s.%n",Phrases [randomPhrase], Events [randomEvent], Authors [randomAuthor], Cities [randomCity] );

        }
    }
}
