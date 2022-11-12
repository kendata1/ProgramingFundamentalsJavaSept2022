package ObjectAndClassesLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Songs {

    public static class Songs {
        private  String typeList;
        private String name;
        private String time;

        public Songs (String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List <Songs> listOfSongs = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs; i++) {
            String input = scanner.nextLine();
            String [] songDataArr = input.split("_");

            String typeList = songDataArr[0];
            String name = songDataArr[1];
            String time = songDataArr[2];

            Songs currentSong = new Songs(typeList,name,time);

            listOfSongs.add(currentSong);
        }

        String command = scanner.nextLine();

        if (command.equals("all")){
            for (Songs item : listOfSongs){
                System.out.println(item.getName());
            }
        } else {
            for (Songs item : listOfSongs) {
                if (command.equals(item.typeList)){
                    System.out.println(item.getName());
                }
            }
        }
    }
}
