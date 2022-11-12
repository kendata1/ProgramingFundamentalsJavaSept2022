package ObjectAndClassesLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student (String firstName, String lastName, int age, String homeTown){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String [] studentDataArr = input.split("\\s+");

            String firstname = studentDataArr[0];
            String lastname = studentDataArr[1];
            int age = Integer.parseInt(studentDataArr [2]);
            String homeTown = studentDataArr[3];

            Student currentStudent = new Student(firstname,lastname,age,homeTown);
            studentList.add(currentStudent);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student item : studentList){
            if (city.equals(item.getHomeTown())){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(), item.getLastName(),item.getAge());
            }
        }
    }
}
