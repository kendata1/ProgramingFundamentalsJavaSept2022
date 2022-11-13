package AssociativeArraysExercise;

import java.util.*;

public class P05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap <String, List<String>> courseMap = new LinkedHashMap<>();

        while (!input.equals("end")){
            String [] inputArr = input.split(" : ");
            String courseName = inputArr [0];
            String studentName = inputArr [1];

            courseMap.putIfAbsent(courseName, new ArrayList<>());
            courseMap.get(courseName).add(studentName);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }
    }
}
