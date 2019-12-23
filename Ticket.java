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
abstract public class Ticket {

    protected int quantity;
    protected float price;
    protected float total;
    protected Customer cust;

    public Ticket(int quantity) {
        this.quantity = quantity;
    }

    public Ticket(String nationality) {
        cust = new Customer(nationality);
    }

    public Customer getCustomer() {
        return cust;
    }

    public Ticket() {
    }

    abstract public float total_price(String nationality);

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 

}
