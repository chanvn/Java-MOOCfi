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

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        int currentWeight = totalWeight();
        currentWeight+= item.getWeight();
        if ((currentWeight<=this.maxWeight))
        suitcase.add(item);
    }
    
    public int totalWeight(){
        int currentWeight = 0;
        for (Item i : this.suitcase){
            currentWeight+=i.getWeight();
        }
        return currentWeight;
    }
    
    public String toString(){
        String itemSpecs = "";
        if (this.suitcase.isEmpty()){
            itemSpecs = "no items";
        }else if (this.suitcase.size() == 1){
            itemSpecs = "1 item";
        }else{
            itemSpecs = String.valueOf(this.suitcase.size()) + " items";
        }
        return itemSpecs+" ("+String.valueOf(totalWeight())+" kg)";
    }
    
    public void printItems(){
        for (Item i : this.suitcase){
            System.out.println(i);
        }
    }
    
    public Item heaviestItem(){
        if (suitcase.isEmpty()){
            return null;
        }
        
        Item heaviest = this.suitcase.get(0);
        
        for (Item  i : this.suitcase){
            if (i.getWeight()>heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }
}
