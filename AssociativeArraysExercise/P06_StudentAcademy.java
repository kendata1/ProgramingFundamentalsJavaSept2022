package AssociativeArraysExercise;

import java.util.*;

public class P06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap <String , List<Double>> gradeMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            gradeMap.putIfAbsent(student, new ArrayList<>());
            gradeMap.get(student).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : gradeMap.entrySet()) {
            double gradesSum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                gradesSum += entry.getValue().get(i);
            }
            double averageGrade = gradesSum / entry.getValue().size();

            if (averageGrade >= 4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),averageGrade);
            }
        }
    }
}
