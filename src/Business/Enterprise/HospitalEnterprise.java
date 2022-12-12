/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Order.OrderHistory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author samruddha
 */

//Initializing  class  HospitalEnterprise extends Organization
public class HospitalEnterprise extends Enterprise {
    
    private OrderHistory orderHistory;
    
    public HospitalEnterprise(String name) {
        
        super(name, EnterpriseType.Hospital);
        this.orderHistory = new OrderHistory();
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
