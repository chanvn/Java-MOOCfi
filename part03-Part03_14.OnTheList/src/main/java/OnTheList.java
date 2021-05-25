
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String text = scanner.nextLine();
        boolean hasWord = list.contains(text);
        if (hasWord){
            System.out.println(text+" was found!");
        }else{
            System.out.println(text+" was not found!");
        }

    }
}
