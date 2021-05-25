
import java.nio.file.Paths;
import java.util.Scanner;
//import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

       // ArrayList<String> nameList = new ArrayList<>();
        boolean isFound = false;
        try ( Scanner s = new Scanner(Paths.get(file))) {
            while (s.hasNextLine()) {
                String nextName = s.nextLine();
                if (searchedFor.equals(nextName)){
                    System.out.println("Found!");
                    isFound = true;
                    break;
                }
                //nameList.add(nextName);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        if (isFound==false){
            System.out.println("Not found.");
        }
        
        
    }
}
