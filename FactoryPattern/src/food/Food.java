/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

/**
 *
 * @author joaov
 */
public abstract class Food {
    private int quantity;
    
    public Food(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public abstract void consumed();
    
}
