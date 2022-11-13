package AssociativeArraysExercise;

import java.util.*;

public class P07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<String, Integer> keyMaterialsMap = new HashMap<>();
        LinkedHashMap<String, Integer> junkItemsMap = new LinkedHashMap<>();
        keyMaterialsMap.put("shards", 0);
        keyMaterialsMap.put("fragments", 0);
        keyMaterialsMap.put("motes", 0);


        while (keyMaterialsMap.get("shards") < 250 && keyMaterialsMap.get("fragments") < 250 && keyMaterialsMap.get("motes") < 250) {

            String input = scanner.nextLine();
            String inputArr[] = input.split(" ");
            int counts = 0;

            for (int j = 0; j < inputArr.length / 2; j++) {

                if (keyMaterialsMap.get("shards") >= 250 || keyMaterialsMap.get("fragments") >= 250 || keyMaterialsMap.get("motes") >= 250){
                    break;
                }

                String material = "";
                int quantity = 0;

                for (int i = counts; i < counts + 2; i++) {
                    if (i % 2 == 0) {
                        quantity = Integer.parseInt(inputArr[i]);
                    } else {
                        material = inputArr[i].toLowerCase();
                    }
                }
                counts = counts + 2;
                switch (material) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        keyMaterialsMap.putIfAbsent(material, 0);
                        keyMaterialsMap.put(material, keyMaterialsMap.get(material) + quantity);
                        break;
                    default:
                        junkItemsMap.putIfAbsent(material, 0);
                        junkItemsMap.put(material, junkItemsMap.get(material) + quantity);
                        break;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : keyMaterialsMap.entrySet()) {
            if (entry.getValue() >= 250) {
                switch (entry.getKey()) {
                    case "shards":
                        System.out.println("Shadowmourne obtained!");
                        entry.setValue(entry.getValue() - 250);
                        break;
                    case "fragments":
                        System.out.println("Valanyr obtained!");
                        entry.setValue(entry.getValue() - 250);
                        break;
                    case "motes":
                        System.out.println("Dragonwrath obtained!");
                        entry.setValue(entry.getValue() - 250);
                        break;
                }
            }
        }
        System.out.printf("shards: %d%nfragments: %d%nmotes: %d%n", keyMaterialsMap.get("shards"), keyMaterialsMap.get("fragments"), keyMaterialsMap.get("motes"));
        for (Map.Entry<String, Integer> entry : junkItemsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}

