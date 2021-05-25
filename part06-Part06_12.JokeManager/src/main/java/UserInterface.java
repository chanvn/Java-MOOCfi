/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanv
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jm;
    private Scanner s;
    
    public UserInterface(JokeManager jm, Scanner s){
        this.jm = jm;
        this.s = s;
    }
    
    public void start(){
        while (true){
        System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes"
                + "\nX - stop");
        
        String command = s.nextLine();
        
        if(command.equals("X")){
            break;
        }else{
            readCommand(command);
        }
        }
    }
    
    public void readCommand(String command){
        if (command.equals("1")){
            System.out.println("Write a joke to be added:");
            String joke = s.nextLine();
            jm.addJoke(joke);
        }else if (command.equals("2")){
            System.out.println(jm.drawJoke());
        }else if (command.equals("3")){
            jm.printJokes();
        }
    }
}
