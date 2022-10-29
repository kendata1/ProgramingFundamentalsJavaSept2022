package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){

            if (input.contains("Add")){
                String [] inputArr = input.split(" ");
                listOfWagons.add(Integer.parseInt(inputArr[1]));
            } else {
                for (int i = 0; i < listOfWagons.size(); i++) {
                    if (listOfWagons.get(i) + Integer.parseInt(input) <= maxCapacity) {
                        listOfWagons.set(i, listOfWagons.get(i) + Integer.parseInt(input));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < listOfWagons.size(); i++) {
            System.out.printf("%d ", listOfWagons.get(i));
        }
    }
}
