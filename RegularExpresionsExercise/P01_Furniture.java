package RegularExpresionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[1-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        double sum = 0;
        List <String> productList = new ArrayList<>();


        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String productName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                double totalPrice = price * quantity;
                sum += totalPrice;
                productList.add(productName);
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        productList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", sum);
    }
}
