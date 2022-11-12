package AssociativeArraysMoreExercise;

import java.util.HashMap;
import java.util.Scanner;

public class P01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contestAndPassword = scanner.nextLine();

        HashMap <String, String> contestAndPasswordMap = new HashMap<>();
        while (!contestAndPassword.equals("end of contests")){

            String [] contestAndPasswordArr = contestAndPassword.split(":");
            String contest = contestAndPasswordArr [0];
            String password = contestAndPasswordArr [1];

            contestAndPasswordMap.put(contest,password);

            contestAndPassword = scanner.nextLine();
        }

        String submissionsInput = scanner.nextLine();
        while (!submissionsInput.equals("end of submissions")){




            submissionsInput = scanner.nextLine();
        }
    }
}
