
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mainCharacter = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story:\nOnce upon a time there was "+mainCharacter
                + ", who was "+job+".\nOn the way to work, "+mainCharacter+
                " reflected on life.\nPerhaps "+mainCharacter+" will not be "+job+" forever."
        );
    }
}
