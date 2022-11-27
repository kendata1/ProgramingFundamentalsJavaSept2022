package RegularExpresionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racersList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        Pattern letter = Pattern.compile("[A-Za-z]");
        Pattern digit = Pattern.compile("[0-9]");
        LinkedHashMap<String, Integer> racersMap = new LinkedHashMap<>();

        while (!input.equals("end of race")) {
            StringBuilder nameSb = new StringBuilder();
            Matcher letterMatcher = letter.matcher(input);
            while (letterMatcher.find()) {
                nameSb.append(letterMatcher.group());
            }
            String name = nameSb.toString();

            if (racersList.contains(name)) {
                int kilometers = 0;
                Matcher digitMatcher = digit.matcher(input);
                while (digitMatcher.find()) {
                    kilometers += Integer.parseInt(digitMatcher.group());
                }
                racersMap.putIfAbsent(name, 0);
                racersMap.put(name, racersMap.get(name) + kilometers);
            }
            input = scanner.nextLine();
        }
        List<String> topThreeNames = racersMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + topThreeNames.get(0));
        System.out.println("2nd place: " + topThreeNames.get(1));
        System.out.println("3rd place: " + topThreeNames.get(2));
    }
}
