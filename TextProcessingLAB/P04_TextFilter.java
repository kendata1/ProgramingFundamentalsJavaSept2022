package TextProcessingLAB;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWordsArr.length; i++) {
            text = text.replace(bannedWordsArr[i], repeatString(bannedWordsArr[i], "*" ) );
        }

        System.out.println(text);


    }
    public static String repeatString (String word, String repeatWord){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(repeatWord);
        }
        return sb.toString();
    }
}
