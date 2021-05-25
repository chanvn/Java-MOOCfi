import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name,duration));
        }
        
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram t : programs){
            if (t.getDuration()<=maxDuration){
                System.out.println(t.getName()+", "+t.getDuration());
            }
        }

    }
}
