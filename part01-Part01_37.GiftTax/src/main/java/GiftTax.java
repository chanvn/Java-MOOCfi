
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());
        double lowerLim = 0;
        double threshhold = 0;
        double taxRate = 0;
        double tax = 0;
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 25001) {
            lowerLim = 100;
            taxRate = 0.08;
            threshhold = 5000;
        } else if (gift < 55001) {
            lowerLim = 1700;
            taxRate = 0.10;
            threshhold = 25000;
        } else if (gift < 200001) {
            lowerLim = 4700;
            taxRate = 0.12;
            threshhold = 55000;
        } else if (gift < 1000001) {
            lowerLim = 22100;
            taxRate = 0.15;
            threshhold = 200000;
        } else {
            lowerLim = 142100;
            taxRate = 0.17;
            threshhold = 1000000;
        }

        if (gift >= 5000) {
            tax = (lowerLim + (gift - threshhold) * taxRate);
            System.out.println("Tax: " + tax);
        }
    }
}
