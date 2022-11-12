package ObjectAndClassesExercise;

import java.util.*;

public class P04_Students {
    static class Student {
        private String firstname;
        private String lastname;
        private double grade;

        public Student(String firstname, String lastname, double grade) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.grade = grade;
        }

        public String getFirstname() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString () {
            return String.format("%s %s: %.2f",this.firstname, this.lastname, this.grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= number ; i++) {
            String input = scanner.nextLine();
            String [] studentData = input.split(" ");

            String firstname = studentData[0];
            String lastname = studentData[1];
            double grade = Double.parseDouble(studentData [2]);

            Student currentStudent = new Student(firstname,lastname,grade);
            studentList.add(currentStudent);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student item : studentList){
            System.out.println(item);
        }
    }
}
