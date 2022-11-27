package RegularExpresionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "\\%(?<customer>[A-Z][a-z]*)\\%[^\\|\\$\\%\\.]*\\<(?<product>\\w+)\\>[^\\|\\$\\%\\.]*\\|(?<count>[0-9]+)\\|[^\\|\\$\\%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalIncome = 0;


        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
            String name = matcher.group(1);
            String product = matcher.group(2);
            int count = Integer.parseInt(matcher.group(3));
            double pricePerCount = Double.parseDouble(matcher.group(4));
            double price = count * pricePerCount;
            totalIncome += price;

                System.out.printf("%s: %s - %.2f%n",name, product, price);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
