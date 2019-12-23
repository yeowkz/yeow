/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themepark;

/**
 * GROUP 8 - PROJECT (THEME PARK ONLINE BOOKING SYSTEM)
 * NAME : LIEW PEI LING CA17041
 * NAME : LEE PEI YIN CA17045
 * NAME : YEOW KAI ZE CA17070
 * SECTION : 04A
 */
public class Child extends Ticket {

    public Child(int quantity) {
        super(quantity);
    }

    public Child(String nationality) {
        super(nationality);
    }

    public Child() {
        super();
    }

    public float childPrice(String nationality) {
        if (cust.getNationality().equalsIgnoreCase("Malaysian")) {
            return 110.0f;
        } else if (cust.getNationality().equalsIgnoreCase("NonMalaysian")) {
            return 135.0f;
        } else {
            return 0;
        }
    }

    @Override
    public float total_price(String nationality) {
        this.total = childPrice(nationality) * getQuantity();
        return total;
    }
}
