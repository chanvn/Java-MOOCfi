
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner s = new Scanner(Paths.get(file))){
            while (s.hasNextLine()){
                String nextLine = s.nextLine();
                String[] personalInfo = nextLine.split(",");
                String name = personalInfo[0];
                int age = Integer.valueOf(personalInfo[1]);
                System.out.println(name+", age: "+age+" years");
            }
        } catch (Exception e){
            
        }
    }
}
