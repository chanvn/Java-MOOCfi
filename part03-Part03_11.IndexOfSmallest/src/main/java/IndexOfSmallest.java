
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();
        // implement here a program that reads user input
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num==9999){
                break;
            }
            numList.add(num);
        }
        // until the user enters 9999
        ArrayList<Integer> indices = new ArrayList<>();
        int smallest=numList.get(0);
        for (int i = 0;i<numList.size();i++){
            if (numList.get(i)<=smallest){
                indices.add(i);
                smallest=numList.get(i);
            }
        }
        System.out.println("Smallest number: "+smallest);
        for (int index : indices){
            System.out.println("Found at index: "+index);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
