package ListsLAB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")) {

            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Contains":
                    if (numbersList.contains(Integer.parseInt(commandArr[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 == 0) {
                                System.out.printf("%d ", numbersList.get(i));
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 != 0) {
                                System.out.printf("%d ", numbersList.get(i));
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        sum += numbersList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandArr[1];
                    int number = Integer.parseInt(commandArr[2]);

                    switch (condition) {
                        case "<":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum < number) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            break;
                        case ">":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum > number) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            break;
                        case "<=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum <= number) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            break;
                        case ">=":
                            for (int i = 0; i < numbersList.size(); i++) {
                                int currentNum = numbersList.get(i);
                                if (currentNum >= number) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            break;
                    }
                    System.out.println();
                    break;
            }
            inputLine = scanner.nextLine();
        }
    }
}
