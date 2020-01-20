/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeautogalore;

import java.io.Serializable;

/**
 *
 * @author Brooke Baldwin
 */
public class Sales implements Serializable {
    
    public double discount(double itemPrice){
        double discount = (itemPrice * 0.10);
        double finalPrice = itemPrice - discount;
        return finalPrice;
    }
    
    public double GST(double itemPrice){
        double finalPrice = (itemPrice * 0.06) + (itemPrice);
        return finalPrice;
    }
    
    public int BuyCycle(int itemPrice, int userBalance){
        int sale = userBalance - itemPrice;
        return sale;
    }
}
