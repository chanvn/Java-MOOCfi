import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        for (int i = 1; i<6; i++){
            s.add(String.valueOf(i));
        }
        
        System.out.println(s.values());
        
        System.out.println(s.take());
        System.out.println(s.getSize());
        System.out.println(s.take());
        System.out.println(s.getSize());
    }
}
