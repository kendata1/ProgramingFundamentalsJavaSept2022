package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, String> registerMap = new LinkedHashMap<>();


        for (int i = 0; i < commandsCount; i++) {
            String input = scanner.nextLine();

            String [] inputArr = input.split("\\s+");

            String command = inputArr [0];
            String username = inputArr [1];

            switch (command){
                case "register":
                    String plateNumber = inputArr [2];

                    if (!registerMap.containsKey(username)){
                        registerMap.put(username,plateNumber);
                        System.out.printf("%s registered %s successfully%n", username,plateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", registerMap.get(username));
                    }

                    break;
                case "unregister":
                    if (!registerMap.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        registerMap.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : registerMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
