
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int amountOfPos = 0;
        int posSum = 0;
        
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num==0){
                break;
            }
            if (num>0){
                amountOfPos++;
                posSum+=num;
            }
        }
        if (amountOfPos>0){
            System.out.println(1.0*posSum/amountOfPos);
        }else{
            System.out.println("Cannot calculate the average");
        }
        
    }
}
