/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Order.OrderHistory;

/**
 *
 * @author pavan
 */

//Initializing class Provider extends Person
public class Provider extends Person {
     
    private OrderHistory orderHistory;
     private int id;
    private static int count = 1;

    public Provider() {
        id = count;
        count++;
    }
    
    public int getId() {
        return id;
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }

        @Override
    public String toString(){
        return this.getFirstName()+ " " + this.getLastName();
    }

}
