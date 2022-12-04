package FinalExam;

import java.util.Scanner;

public class P01_StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String [] commandArr = command.split(" ");

            switch (commandArr [0]){
                case "Translate":
                    String stringToReplace = commandArr [1];
                    String replacement = commandArr [2];
                    input = input.replaceAll(stringToReplace,replacement);
                    System.out.println(input);
                    break;

                case "Includes":
                String substring = commandArr [1];
                    if(input.contains(substring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;

                case "Start":
                    String startSubstring = commandArr [1];
                    if(input.startsWith(startSubstring)){
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "Lowercase":
                    input = input.toLowerCase();
                    System.out.println(input);
                    break;

                case "FindIndex":
                    String charToFind = commandArr[1];
                    System.out.println(input.lastIndexOf(charToFind));
                    break;
                case "Remove":
                int startIndex = Integer.parseInt(commandArr[1]);
                int count = Integer.parseInt(commandArr[2]);

                String startingString = input.substring(0,startIndex);
                String endString = input.substring(startIndex + count);

                input = startingString + endString;
                    System.out.println(input);
            }
            command = scanner.nextLine();
        }
    }
}
