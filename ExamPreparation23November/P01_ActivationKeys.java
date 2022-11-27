package ExamPreparation23November;

import java.util.Scanner;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")){
        String [] commandArr = command.split(">>>");

        switch (commandArr [0]){
            case "Contains":
                String substring = commandArr [1];
                if (input.contains(substring)){
                System.out.printf("%s contains %s%n", input, substring);
                } else {
                    System.out.println("Substring not found!");
                }
                break;
            case "Flip":
                int startIndex = Integer.parseInt(commandArr[2]);
                int endIndex = Integer.parseInt(commandArr[3]);
                String beginning = input.substring(0, startIndex);
                String stringToModify = input.substring(startIndex,endIndex);
                String end = input.substring(endIndex, input.length());
                switch (commandArr[1]){
                    case "Upper":
                        stringToModify = stringToModify.toUpperCase();
                        input = beginning + stringToModify + end;
                        break;
                    case "Lower":
                        stringToModify = stringToModify.toLowerCase();
                        input = beginning + stringToModify + end;
                        break;
                }
                System.out.println(input);
                break;
            case "Slice":
                int startSlice = Integer.parseInt(commandArr[1]);
                int endSlice = Integer.parseInt(commandArr[2]);
                String toStart = input.substring(0, startSlice);
                String toEnd = input.substring(endSlice, input.length());
                input = toStart + toEnd;
                System.out.println(input);
                break;
        }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + input);
    }
}
