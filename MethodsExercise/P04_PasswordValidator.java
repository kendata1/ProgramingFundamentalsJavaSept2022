package MethodsExercise;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        isItValid(password);

    }
    public static void isItValid (String password){

        boolean invalidPasswordLength = (password.length() < 6 || password.length() > 10);
        boolean onlyLettersAndDigits = true;
        int digitSum = 0;

        if(invalidPasswordLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);

            if (!((currentSymbol >= 48 && currentSymbol <= 57) || (currentSymbol >= 65 && currentSymbol <= 90) || (currentSymbol >= 97 && currentSymbol <= 122))){
                onlyLettersAndDigits = false;
            }
            if ((currentSymbol >= 48 && currentSymbol <= 57)){
                digitSum += 1;
            }
        }
        if (onlyLettersAndDigits && digitSum >= 2 && !invalidPasswordLength){
            System.out.printf("Password is valid");
        } else {
            if (!onlyLettersAndDigits){
                System.out.printf("Password must consist only of letters and digits%n");
            }
            if(digitSum < 2){
                System.out.printf("Password must have at least 2 digits%n");
            }
        }
    }
}
