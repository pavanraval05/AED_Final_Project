/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Order;

import Business.Vaccine.VaccineDetails;

/**
 *
 * @author akhilesh
 */

//Initializing CLass orderItem
public class OrderItem {
    
    private VaccineDetails vaccineDetails;
    private int quantity;

    public VaccineDetails getVaccineDetails() {
        return vaccineDetails;
    }

    public void setVaccineDetails(VaccineDetails vaccineDetails) {
        this.vaccineDetails = vaccineDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return vaccineDetails.getVaccineDefinition().getVaccineName();
    }
    
    
    
}
