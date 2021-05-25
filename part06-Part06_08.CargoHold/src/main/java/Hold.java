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

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> hold;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentHoldWeight = 0;
        for (Suitcase s : hold) {
            currentHoldWeight += s.totalWeight();
        }

        currentHoldWeight += suitcase.totalWeight();

        if (currentHoldWeight <= maxWeight) {
            hold.add(suitcase);
        }
    }

    public int totalHoldWeight() {
        int currentHoldWeight = 0;
        for (Suitcase s : hold) {
            currentHoldWeight += s.totalWeight();
        }

        return currentHoldWeight;
    }

    public String toString() {
        return String.valueOf(this.hold.size()) + " suitcases(" + String.valueOf(totalHoldWeight()) + " kg)";
    }

    public void printItems() {
        for (Suitcase s : hold) {
            s.printItems();
        }
    }
}
