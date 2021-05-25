
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int amountOfNums = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }
            sum += num;
            amountOfNums++;
        }
        System.out.println("Average of the numbers: " + 1.0*sum/amountOfNums);
    }
}
