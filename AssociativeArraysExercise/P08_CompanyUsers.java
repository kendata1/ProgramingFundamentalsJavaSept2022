package AssociativeArraysExercise;

import java.util.*;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> employersMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" -> ");

            String company = inputArr[0];
            String id = inputArr[1];

            employersMap.putIfAbsent(company, new ArrayList<>());
            if (!employersMap.get(company).contains(id)) {
                employersMap.get(company).add(id);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : employersMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String item : entry.getValue()) {
                System.out.printf("-- %s%n", item);
            }
        }
    }
}
