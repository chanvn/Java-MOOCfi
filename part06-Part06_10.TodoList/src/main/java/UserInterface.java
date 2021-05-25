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
    private Scanner s;
    private TodoList tdList;
    
    public UserInterface(TodoList tdList, Scanner s){
        this.tdList = tdList;
        this.s = s;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = s.nextLine();
            
            if (command.equals("stop")){
                break;
            }
            readCommand(command);
        }
    }
    
    public void readCommand(String command){
        if (command.equals("add")){
            add();
        }else if (command.equals("list")){
            list();
        }else if (command.equals("remove")){
            remove();
        }
    }
    
    public void add(){
        System.out.println("To add: ");
        String task = s.nextLine();
        
        this.tdList.add(task);
    }
    
    public void list(){
        tdList.print();
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        int index = Integer.valueOf(s.nextLine());
        
        this.tdList.remove(index);
    }
}
