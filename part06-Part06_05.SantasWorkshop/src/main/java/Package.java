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

public class Package {
    private ArrayList<Gift> giftList;
    
    public Package(){
        giftList = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        giftList.add(gift);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Gift gift : giftList){
            totalWeight+=gift.getWeight();
        }
        return totalWeight;
    }
}
