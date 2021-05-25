
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text="1";
        while (true){
            if (text.equals("")){
                break;
            }
            text = scanner.nextLine();
            String[] spacesString = text.split(" ");
            for (int i=0;i<spacesString.length;i++){
                System.out.println(spacesString[i]);
            }
        }
        
    }
}
