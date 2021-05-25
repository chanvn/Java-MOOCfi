/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanv
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary sd;

    public TextUI(Scanner scanner, SimpleDictionary sd) {
        this.scanner = scanner;
        this.sd = sd;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            processString(command);
        }

    }

    public void processString(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();

        System.out.print("Translation: ");
        String translation = scanner.nextLine();

        sd.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String toBeTranslated = scanner.nextLine();

        if (sd.translate(toBeTranslated) != null) {
            System.out.println("Translation: " + sd.translate(toBeTranslated));
        } else {
            System.out.println("Word " + toBeTranslated + " was not found");
        }
    }

}
