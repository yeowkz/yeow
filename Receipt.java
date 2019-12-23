/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themepark;

/**
 *
 * GROUP 8 - PROJECT (THEME PARK TICEKTING SYSTEM)
 * NAME : YEOW
 * @this class will show payment's details
 */
public class Receipt {

    private float grandtotal;

    public Receipt(float total1, float total2, float total3) {
        this.grandtotal = total1 + total2 + total3;
    }
    
    public float getGrandtotal(){
        return grandtotal;
    }
}
