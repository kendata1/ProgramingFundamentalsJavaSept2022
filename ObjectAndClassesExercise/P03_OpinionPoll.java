package ObjectAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_OpinionPoll {

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List <Person> personList = new ArrayList<>();

        for (int i = 1; i <= number ; i++) {
            String input = scanner.nextLine();
            String [] inputArr = input.split(" ");

            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            Person currentPerson = new Person(name, age);
            personList.add(currentPerson);
        }
        for (Person item : personList){
            if (item.getAge() > 30){
                System.out.printf("%s - %d%n",item.getName(), item.getAge());
            }
        }
    }
}
