package ExamPreparation23November;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        String regexBarcode = "@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        String regexProductGroup = "[0-9]";
        Pattern patternBarcode = Pattern.compile(regexBarcode);
        Pattern patternProductGroup = Pattern.compile(regexProductGroup);

        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            Matcher matcherBarcode = patternBarcode.matcher(input);


            if (matcherBarcode.find()) {
                String productGroup = "";
                Matcher matcherProductGroup = patternProductGroup.matcher(matcherBarcode.group(1));
                if (matcherProductGroup.find()){
                    productGroup += matcherProductGroup.group();
                    while (matcherProductGroup.find()) {
                        productGroup += matcherProductGroup.group();
                    }
                } else {
                    productGroup = "00";
                }
                System.out.println("Product group: " + productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
