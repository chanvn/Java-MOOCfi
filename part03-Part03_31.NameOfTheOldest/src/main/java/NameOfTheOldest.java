
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String oldest = "";
        int oldestAge = 0;
        while (true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            }
            
            String[] splitted = text.split(",");
            int age = Integer.valueOf(splitted[1]);
            if (age>oldestAge){
                oldest=splitted[0];
                oldestAge=age;
            }
        }
        System.out.println("Name of the oldest: "+oldest);

    }
}
