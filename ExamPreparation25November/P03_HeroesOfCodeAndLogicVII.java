package ExamPreparation25November;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map <String, Integer> heroHpMap = new LinkedHashMap<>();
        Map <String, Integer> heroMpMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] heroArr = scanner.nextLine().split("\\s+");
            String heroName = heroArr[0];
            int hp = Integer.parseInt(heroArr[1]);
            int mp = Integer.parseInt(heroArr[2]);

            heroHpMap.put(heroName, hp);
            heroMpMap.put(heroName, mp);

        }
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String [] commandArr = command.split("\\s+-\\s+");
            String heroName = commandArr [1];
            int heroMp = heroMpMap.get(heroName);
            int heroHp = heroHpMap.get(heroName);

            switch (commandArr [0]){
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandArr [2]);
                    String spellName = commandArr [3];
                    if (heroMp >= mpNeeded){
                        heroMpMap.put(heroName, heroMp - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",heroName, spellName, heroMpMap.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(commandArr [2]);
                    String attacker = commandArr [3];

                    if (heroHp > damage){
                        heroHpMap.put(heroName, heroHp - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",heroName, damage, attacker,heroHpMap.get(heroName));
                    } else {
                        System.out.printf("%s has been killed by %s!%n",heroName, attacker);
                        heroHpMap.remove(heroName);
                        heroMpMap.remove(heroName);
                    }
                    break;

                case "Recharge":
                    int amountRecovered = 0;
                    int amount = Integer.parseInt(commandArr [2]);
                    heroMp = heroMp + amount;

                    if (heroMp > 200) {
                        heroMp = 200;
                        amountRecovered = 200 - heroMpMap.get(heroName);
                    } else {
                        amountRecovered = amount;
                    }
                    heroMpMap.put(heroName, heroMp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amountRecovered);

                    break;
                case "Heal":
                    int healthRecovered = 0;
                    int healAmount = Integer.parseInt(commandArr [2]);
                    heroHp = heroHp + healAmount;

                    if (heroHp > 100) {
                        heroHp = 100;
                        healthRecovered = 100 - heroHpMap.get(heroName);
                    } else {
                        healthRecovered = healAmount;
                    }
                    heroHpMap.put(heroName, heroHp);
                    System.out.printf("%s healed for %d HP!%n", heroName, healthRecovered);
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : heroMpMap.entrySet()) {
            String hero = entry.getKey();
            int mp = entry.getValue();
            int hp = heroHpMap.get(entry.getKey());

            System.out.printf("%s%n  HP: %d%n  MP: %d%n", hero, hp,mp);
        }
    }
}
