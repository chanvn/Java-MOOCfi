import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            bookList.add(new Book(title,pages,year));
        }
        
        System.out.print("What information will be printed?");
        String information = scanner.nextLine();
        for (Book b: bookList){
            if (information.equals("everything")){
                System.out.println(b.toString());
            }
            
            if (information.equals("name")){
                System.out.println(b.getTitle());
            }
        }
    }
}
