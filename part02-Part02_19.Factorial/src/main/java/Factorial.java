
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = 1;
        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        if (num == 0){
            factorial=1;
        }else{
            for (int i=2;i<=num;i++){
                factorial*=i;
            }
        }
        System.out.println("Factorial: "+factorial);
    }
}
