/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author pavan
 */

//Initializing ProviderVacineInventory
public class ProviderVaccineInventory {
    private ArrayList<VaccineDetails> vaccineDetailsList;

    public ProviderVaccineInventory() {
        
        vaccineDetailsList = new ArrayList<>();
    }

    public ArrayList<VaccineDetails> getVaccineDetailsList() {
        return vaccineDetailsList;
    }

    public void setVaccineDetailsList(ArrayList<VaccineDetails> vdl) {
        this.vaccineDetailsList = vdl;
    }
    
    public VaccineDetails addNewVaccineDetail(){
        
        VaccineDetails vd = new VaccineDetails();
        vaccineDetailsList.add(vd);
        return vd;
  
    }
    
    public void removeVaccineDetail(VaccineDetails vd){
        
        vaccineDetailsList.remove(vd);
    }
}
