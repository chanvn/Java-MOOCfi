
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int birthYrSum = 0;
        int numberOfPpl = 0;
        String longestName="";
        while (true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            }
            
            String[] splitted = text.split(",");
            int nameLen = splitted[0].length();
            birthYrSum+=Integer.valueOf(splitted[1]);
            numberOfPpl++;
            if (nameLen>(longestName.length())){
                longestName=splitted[0];
            }
        }
        
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+1.0*birthYrSum/numberOfPpl);
    }
}
