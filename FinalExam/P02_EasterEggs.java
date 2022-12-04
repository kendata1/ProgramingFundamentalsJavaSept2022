package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "[@#]+(?<color>[a-z]{3,})[@#]+[^0-9A-Za-z]*?[\\/]+(?<quantity>[0-9]+)[\\/]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String color = matcher.group("color");
            String quantity = matcher.group("quantity");

            System.out.printf("You found %s %s eggs!%n",quantity,color);
        }
    }
}
