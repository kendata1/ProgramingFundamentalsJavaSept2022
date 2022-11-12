package ObjectAndClassesExercise;

import java.util.Scanner;

public class P02_Articles {
    static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        void edit(String newContent){
            this.content = newContent;
        }
        void changeAuthor (String newAuthor){
            this.author = newAuthor;
        }
        void rename (String newTitle){
            this.title = newTitle;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] articleDataArr = input.split(", ");
        int number = Integer.parseInt(scanner.nextLine());

        Article currentArticle = new Article(articleDataArr[0], articleDataArr[1], articleDataArr[2]);

        for (int i = 1; i <= number; i++) {
            String command = scanner.nextLine();
            String [] commandArr = command.split(": ");

            switch (commandArr[0]){
                case "Edit":
                    currentArticle.edit(commandArr[1]);
                    break;
                case "ChangeAuthor":
                    currentArticle.changeAuthor(commandArr[1]);
                    break;
                case "Rename":
                    currentArticle.rename(commandArr[1]);
                    break;
            }
        }
        System.out.printf("%s - %s: %s",currentArticle.getTitle(),currentArticle.getContent(),currentArticle.getAuthor());
    }
}
