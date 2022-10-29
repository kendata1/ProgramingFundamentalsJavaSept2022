package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());
        List<String> guestsList = new ArrayList<String>();

        for (int i = 1; i <= commandsCount; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            boolean isInTheList = false;
            String name = inputArr[0];

            for (int j = 0; j < guestsList.size(); j++) {
                if (guestsList.get(j).equals(name)) {
                    isInTheList = true;
                    break;
                }
            }
            if (!input.contains("not")) {
                if (isInTheList) {
                    System.out.printf("%s is already in the list!%n",name);
                } else {
                    guestsList.add(name);
                }
            } else {
                if (isInTheList){
                    guestsList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (int i = 0; i < guestsList.size(); i++) {
            System.out.printf("%s%n",guestsList.get(i));
        }
    }
}
