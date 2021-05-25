/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanv
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (balance >= 2.6) {
            this.balance -= 2.6;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.6) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        double holderBalance = this.balance;
        double holderAmount = amount;
        if (amount < 0) {
            return;
        }
        if ((holderBalance += holderAmount) >= 150) {
            this.balance = 150;
            return;
        }
        this.balance += amount;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
