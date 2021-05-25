
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String number = scanner.nextLine();
            if (number.equals("end")){
                break;
            }
            int num = Integer.valueOf(number);
            double cube = Math.pow(1.0*num, 3);
            System.out.println((int)cube);
        }
    }
}
