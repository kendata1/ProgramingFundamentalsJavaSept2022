package ListsLAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")){

            String [] commandArr = inputLine.split(" ");
            String command = commandArr [0];

            switch (command) {
                case "Add":
                    numbersList.add(Integer.parseInt(commandArr[1]));
                    break;
                case "Remove":
                    numbersList.remove(Integer.valueOf(commandArr [1]));
                    break;
                case "RemoveAt":
                    numbersList.remove(Integer.parseInt(commandArr[1]));
                    break;
                case "Insert":
                    numbersList.add(Integer.parseInt(commandArr [2]), Integer.parseInt(commandArr[1]));
                    break;
            }
            inputLine = scanner.nextLine();
        }
        for (Integer item : numbersList){
            System.out.printf("%d ", item);
        }
    }
}
