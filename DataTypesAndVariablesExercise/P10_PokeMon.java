package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int targets = 0;
        int constN = N;

        while (N >= M){
            if (N == 0.5 * constN && Y != 0){
                N = N / Y;
            }
            if (N >= M) {
                N = N - M;
                targets += 1;
            }
        }
        System.out.println(N);
        System.out.println(targets);
    }
}
