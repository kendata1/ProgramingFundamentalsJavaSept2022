package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] usernamesArr = scanner.nextLine().split(", ");
        List <String> validUsernames = new ArrayList<>();
        for (int i = 0; i < usernamesArr.length; i++) {
            boolean isValid = false;
            String currentUsername = usernamesArr[i];
            if (currentUsername.length() > 3 && currentUsername.length() < 16) {
                for (int j = 0; j < currentUsername.length(); j++) {
                    char currentSymbol = currentUsername.charAt(j);
                    isValid = false;
                    if (Character.isLetter(currentSymbol) || Character.isDigit(currentSymbol) || currentSymbol == '-' || currentSymbol == '_') {
                        isValid = true;
                    } else {
                        break;
                    }
                }
            }
            if (isValid) {
                validUsernames.add(currentUsername);
            }
        }
        System.out.println(String.join(System.lineSeparator(), validUsernames));
    }
}
