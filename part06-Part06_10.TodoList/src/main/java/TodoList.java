/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanv
 */
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todoList;
    
    public TodoList(){
        todoList = new ArrayList<>();
    }
    
    public void add(String task){
        todoList.add(task);
    }
    
    public void print(){
        int index = 1;
        for(String task : todoList){
            System.out.println(index+": "+task);
            index++;
        }
    }
    
    public void remove(int number){
        int index = number - 1;
        todoList.remove(index);
    }
    
    
}
