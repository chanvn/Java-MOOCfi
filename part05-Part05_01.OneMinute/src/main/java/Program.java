
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Scanner s = new Scanner(System.in);
        Timer t = new Timer();
        while (true){
            t.advance();
            System.out.println(t);
        }
    }
}
