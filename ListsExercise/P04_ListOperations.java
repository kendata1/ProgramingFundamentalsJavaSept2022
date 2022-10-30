package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String [] inputArr = input.split(" ");
            int index = 0;
            int number = 0;

            switch (inputArr [0]){
                case "Add":
                    number = Integer.parseInt(inputArr[1]);
                    numbersList.add(number);
                    break;

                case "Insert":
                    index = Integer.parseInt(inputArr[2]);
                    number = Integer.parseInt(inputArr[1]);
                    if (index < 0 || index > numbersList.size() - 1){
                        System.out.println("Invalid index");
                    } else {
                        numbersList.add(index,number);
                    }
                    break;

                case "Remove":
                    index = Integer.parseInt(inputArr[1]);
                    if (index < 0 || index > numbersList.size() - 1){
                        System.out.println("Invalid index");
                    } else {
                        numbersList.remove(index);
                    }
                    break;

                case "Shift":
                    int count = Integer.parseInt(inputArr[2]);
                    switch (inputArr [1]){
                        case  "left":
                            for (int i = 1; i <= count; i++) {
                                int saveValue = numbersList.get(0);
                                for (int j = 0; j < numbersList.size() - 1; j++) {
                                    numbersList.set(j,numbersList.get(j+1));
                                }
                                numbersList.set(numbersList.size() - 1, saveValue);
                            }
                            break;

                        case "right":
                            for (int i = 1; i <= count; i++) {
                                int saveValue = numbersList.get(numbersList.size() - 1);
                                for (int j = numbersList.size() - 1; j > 0; j--) {
                                    numbersList.set(j,numbersList.get(j-1));
                                }
                                numbersList.set(0, saveValue);
                            }
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.printf("%d ", numbersList.get(i));
        }
    }
}
