package ListsLAB;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < numbersList.size() - 1; i++) {
            double firstNumToSum = numbersList.get(i);
            double secondNumToSum = numbersList.get(i + 1);

            if (firstNumToSum == secondNumToSum){
                numbersList.set(i,firstNumToSum + secondNumToSum);
                numbersList.remove(i + 1);
                i = -1;
            }
        }
        String result = joinElementsByDelimiter(numbersList," ");
        System.out.println(result);
    }
    public static String joinElementsByDelimiter (List <Double> items, String delimiter) {
        String result = "";
        for (int i = 0; i < items.size(); i++) {
            double item = items.get(i);
            result += (new DecimalFormat ("0.#").format(item) + delimiter);
        }
        return result;
    }
}
