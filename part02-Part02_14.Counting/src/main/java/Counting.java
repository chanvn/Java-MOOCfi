
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = 0;
        int num = Integer.valueOf(scanner.nextLine());
        while (i<num+1){
            System.out.println(i);
            i++;
        }
        
    }
}
