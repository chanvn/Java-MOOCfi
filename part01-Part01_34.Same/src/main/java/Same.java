
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        System.out.println("Enter the second string:");
        String second = scan.nextLine();
        boolean isSame = first.equals(second);
        if (isSame){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
