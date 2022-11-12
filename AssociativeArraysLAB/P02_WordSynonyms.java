package AssociativeArraysLAB;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap <String, List<String>> synonymMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymMap.containsKey(word)) {
                synonymMap.put(word, new ArrayList<>());
            }
            synonymMap.get(word).add(synonym);

        }
        for (Map.Entry<String, List<String>> entry : synonymMap.entrySet()) {
            String synonyms = String.join(", ", entry.getValue());

            System.out.printf("%s - %s%n", entry.getKey(),synonyms);
        }
    }
}
