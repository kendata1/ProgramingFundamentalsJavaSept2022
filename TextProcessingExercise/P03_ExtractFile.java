package TextProcessingExercise;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split("\\\\");
        String [] data = inputArr[inputArr.length - 1].split("\\.");

        String fileName = data [0];
        String fileExtension = data[1];

        System.out.printf("File name: %s%nFile extension: %s",fileName,fileExtension);

    }
}
