package TextProcessingLAB;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(stringToRemove)){

            text = text.replace(stringToRemove , "");
        }
        System.out.println(text);
    }
}
