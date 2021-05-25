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

public class Room {
    ArrayList<Person> personList;
    
    public Room(){
        personList = new ArrayList<>();
    }
    
    public void add(Person person){
        personList.add(person);
    }
    
    public boolean isEmpty(){
        if (personList.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return personList;
    }
    
    public Person shortest(){
        if (personList.isEmpty()){
            return null;
        }
        
        Person shortest = personList.get(0);
        
        for (Person p : personList){
            if (p.getHeight() < shortest.getHeight()){
                shortest = p;
            }
        }
        
        return shortest;
    }
    
    public Person take(){
        if (personList.isEmpty()){
            return null;
        }
        
        Person shortest = shortest();
        personList.remove(shortest);
        
        return shortest;
        
    }
}
