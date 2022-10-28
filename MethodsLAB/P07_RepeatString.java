package MethodsLAB;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input,count));

    }
    public static String repeatString (String input, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += input;
        }
        return result;
    }
}
