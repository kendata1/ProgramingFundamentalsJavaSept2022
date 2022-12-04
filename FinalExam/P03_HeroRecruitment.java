package FinalExam;

import java.util.*;

public class P03_HeroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> heroSpellBook = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split("\\s+");
            String heroName = inputArr[1];


            switch (inputArr[0]) {
                case "Enroll":
                    if (heroSpellBook.containsKey(heroName)) {
                        System.out.printf("%s is already enrolled.%n", heroName);
                    } else {
                        heroSpellBook.put(heroName, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String spellName = inputArr[2];
                    if (heroSpellBook.containsKey(heroName)) {
                        if (heroSpellBook.get(heroName).contains(spellName)) {
                            System.out.printf("%s has already learnt %s.%n", heroName, spellName);
                        } else {
                            heroSpellBook.get(heroName).add(spellName);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }
                    break;
                case "Unlearn":
                    String unlearnSpell = inputArr[2];
                    if (heroSpellBook.containsKey(heroName)) {
                        if (heroSpellBook.get(heroName).contains(unlearnSpell)) {
                            heroSpellBook.get(heroName).remove(unlearnSpell);
                        } else {
                            System.out.printf("%s doesn't know %s.%n", heroName, unlearnSpell);
                        }
                    } else {
                        System.out.printf("%s doesn't exist.%n", heroName);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> entry : heroSpellBook.entrySet()) {
            System.out.printf("== %s: ", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (i == entry.getValue().size() - 1) {
                    System.out.printf("%s", entry.getValue().get(i));
                } else {
                    System.out.printf("%s, ", entry.getValue().get(i));
                }
            }
            System.out.println();
        }
    }
}
