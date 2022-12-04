package ExamPreparation25November;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#|\\|])(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int sumOfCalories = 0;

        StringBuilder infoSb = new StringBuilder();
        while (matcher.find()){
            int calories = Integer.parseInt(matcher.group("calories"));
            String nutrition = matcher.group("calories");
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");


            infoSb.append(String.format("Item: %s, Best before: %s, Nutrition: %s%n", itemName, expirationDate,nutrition));

            sumOfCalories += calories;

        }

        int daysToLast = 0;

        if (sumOfCalories > 0) {
            daysToLast = sumOfCalories / 2000;
        }

        System.out.printf("You have food to last you for: %d days!%n", daysToLast);
        System.out.println(infoSb);

    }
}
