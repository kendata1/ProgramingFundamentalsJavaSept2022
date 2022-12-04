package ExamPreparation25November;

import java.util.Scanner;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        StringBuilder passwordSb = new StringBuilder(password);

        while (!command.equals("Done")){
            String [] commandArr = command.split(" ");

            switch (commandArr [0]){
                case "TakeOdd":
                    StringBuilder oddPasswordSb = new StringBuilder();
                    for (int i = 0; i < passwordSb.length(); i++) {
                        if (i % 2 != 0){
                            oddPasswordSb.append(passwordSb.charAt(i));
                        }
                    }
                    passwordSb = oddPasswordSb;
                    System.out.println(passwordSb);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandArr [1]);
                    int length = Integer.parseInt(commandArr [2]);
                    passwordSb.delete(index, index + length);
                    System.out.println(passwordSb);
                    break;
                case "Substitute":
                    String substring = commandArr [1];
                    String replacement = commandArr [2];
                    String subPassword = passwordSb.toString();

                    if (subPassword.contains(substring)){
                        subPassword = subPassword.replaceAll(substring,replacement);
                        passwordSb = new StringBuilder(subPassword);
                        System.out.println(passwordSb);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + passwordSb);
    }
}
