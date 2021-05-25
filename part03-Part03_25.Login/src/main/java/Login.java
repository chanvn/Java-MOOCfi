
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String un = scanner.nextLine();
        System.out.println("Enter password:");
        String pwd = scanner.nextLine();
        checkPwd(un, pwd);
    }
    
    public static void checkPwd(String un, String pwd){
        String unAlex = "alex";
        String pwdAlex = "sunshine";
        String unEmma = "emma";
        String pwdEmma = "haskell";
        
        if ((un.equals(unAlex) && pwd.equals(pwdAlex)) || (un.equals(unEmma) && pwd.equals(pwdEmma))){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username of password!");
        }
    }
}
