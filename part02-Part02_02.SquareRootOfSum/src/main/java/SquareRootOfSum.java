
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondNum = Integer.valueOf(scanner.nextLine());
        int sum = firstNum+secondNum;
        double sqrt = Math.sqrt(sum);
        System.out.println(sqrt);

    }
}
