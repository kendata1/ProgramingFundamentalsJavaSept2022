package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List <Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String [] inputArr = input.split(" ");

            if (inputArr[0].equals("Delete")){
                int elementToRemove = Integer.parseInt(inputArr[1]);
                while (integerList.contains(elementToRemove)) {
                    integerList.remove(Integer.valueOf(elementToRemove));
                }
            } else if (inputArr [0].equals("Insert")) {
                int element = Integer.parseInt(inputArr[1]);
                int position = Integer.parseInt(inputArr[2]);

                integerList.add(position,element);
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < integerList.size(); i++) {
            System.out.printf("%d ", integerList.get(i));
        }
    }
}
