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

public class Stack {

    private ArrayList<String> stringList = new ArrayList<>();
    
    public boolean isEmpty(){
        if (stringList.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public void add(String value){
        stringList.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stringList;
    }
    
    public String take(){
        String stackedValue = this.stringList.get((this.stringList.size()-1));
        this.stringList.remove((this.stringList.size()-1));
        
        return stackedValue;
    }
    
    public int getSize(){
        return this.stringList.size();
    }
}
