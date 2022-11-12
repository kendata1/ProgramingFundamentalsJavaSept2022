package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceAll(" ","");

        LinkedHashMap<Character, Integer> counterMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            counterMap.putIfAbsent(currentChar,0);
            counterMap.put(currentChar, counterMap.get(currentChar) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counterMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
