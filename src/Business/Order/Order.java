/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.Vaccine.VaccineDetails;
import java.util.ArrayList;

/**
 *
 * @author akhileshkavitkar
 */
public class Order {
    
    private ArrayList<OrderItem> itemList;
    private static int counter = 0;
    private int orderNumber;

    public Order() {
        counter++;
        orderNumber = counter;
        itemList = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }
           
   
    
    public ArrayList<OrderItem> getItemList() {
        return itemList;
    }
    
    
    public OrderItem addNewOrderItem(int quantity, VaccineDetails vaccineDetails){
        
        OrderItem oi = new OrderItem();
        oi.setVaccineDetails(vaccineDetails);
        oi.setQuantity(quantity);
        itemList.add(oi);
        
        return oi;
    }
    
    public void removeOrderItem(OrderItem oi){
        
        itemList.remove(oi);
    }
    
}
