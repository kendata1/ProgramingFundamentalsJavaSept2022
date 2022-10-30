package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String[] specialNumberAndPower = scanner.nextLine().split(" ");

        String specialNumber = specialNumberAndPower[0];
        int power = Integer.parseInt(specialNumberAndPower[1]);
        int sum = 0;

        while (numbersList.contains(specialNumber)) {
            int specialNumberIndex = numbersList.indexOf(specialNumber);
            int startOfDetonation = Math.max(specialNumberIndex - power, 0);
            int endOfDetonation = Math.min(specialNumberIndex + power, numbersList.size() - 1);


            for (int j = endOfDetonation; j >= startOfDetonation; j--) {
                numbersList.remove(j);
            }
        }
        System.out.println(numbersList.stream().mapToInt(Integer::parseInt).sum());
    }
}
