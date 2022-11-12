package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> minedResourceMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = "";
            int quantity = 0;

            for (int i = 1; i <= 2; i++) {
                if (i % 2 == 1) {
                    resource = input;
                    input = scanner.nextLine();
                } else {
                    quantity = Integer.parseInt(input);
                }
            }
            minedResourceMap.putIfAbsent(resource,0);
            minedResourceMap.put(resource,minedResourceMap.get(resource) + quantity);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : minedResourceMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
