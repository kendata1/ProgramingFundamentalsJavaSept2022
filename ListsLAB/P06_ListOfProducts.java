package ListsLAB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> productsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            productsList.add(input);
        }
        Collections.sort(productsList);

        int number = 1;
        for (String item : productsList){
            System.out.printf("%d.%s%n", number, item);
            number ++;
        }
    }
}
