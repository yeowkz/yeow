/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themepark;

/**
 * GROUP 8 - PROJECT (THEME PARK TICKETING SYSTEM)
 * NAME : YEOW
 */
public class Senior extends Ticket {

    public Senior(int quantity) {
        super(quantity);
    }

    public Senior(String nationality) {
        super(nationality);
    }

    public Senior() {
        super();
    }

    public float seniorPrice(String nationality) {
        if (cust.getNationality().equalsIgnoreCase("Malaysian")) {
            return 100.0f;
        } else if (cust.getNationality().equalsIgnoreCase("NonMalaysian")) {
            return 125.0f;
        } else {
            return 0;
        }
    }

    @Override
    public float total_price(String nationality) {
        this.total = seniorPrice(nationality) * getQuantity();
        return total;
    }
}
