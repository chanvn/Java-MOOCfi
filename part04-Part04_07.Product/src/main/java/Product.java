/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanv
 */
public class Product {
    private double price;
    private int quantity;
    private String name;
    
    public Product (String initialName, double initialPrice, int initialQuantity){
        name=initialName;
        quantity=initialQuantity;
        price=initialPrice;
    }
    
    public void printProduct(){
        System.out.println(name+", "+price+", "+quantity);
    }
    
}
