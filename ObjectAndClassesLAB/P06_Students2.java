package ObjectAndClassesLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Students2 {
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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] studentDataArr = input.split("\\s+");

            String firstname = studentDataArr[0];
            String lastname = studentDataArr[1];

            int age = Integer.parseInt(studentDataArr[2]);
            String homeTown = studentDataArr[3];



            if (isStudentExisting(studentList,firstname,lastname)){
                Student student = getStudent(studentList,firstname,lastname);

                student.setFirstName(firstname);
                student.setLastName(lastname);
                student.setAge(age);
                student.setHomeTown(homeTown);

            }else {
                Student currentStudent = new Student (firstname, lastname, age, homeTown);
                studentList.add(currentStudent);
            }

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student item : studentList) {
            if (city.equals(item.getHomeTown())) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }


    private static boolean isStudentExisting (List <Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent (List <Student> students, String firstname, String lastName) {
        Student existingStudent = null;

        for (Student item : students) {
            if (item.getFirstName().equals(firstname) && item.getLastName().equals(lastName)) {
                existingStudent = item;
            }
        }
        return existingStudent;
    }
}
