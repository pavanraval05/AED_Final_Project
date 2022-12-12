/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author akash
 */

//Creating CLass VaccineProductCatalog
public class VaccineProductCatalog {
    
    private ArrayList<VaccineDetails> vaccineDetailList;

    public VaccineProductCatalog() {
        
        vaccineDetailList = new ArrayList<>();
    }

    public ArrayList<VaccineDetails> getVaccineProductList() {
        return vaccineDetailList;
    }

    public void setVaccineProductList(ArrayList<VaccineDetails> vdl) {
        this.vaccineDetailList = vdl;
    }
    
    public VaccineDetails addNewVaccineProduct(){
        
        VaccineDetails vd = new VaccineDetails();
        vaccineDetailList.add(vd);
        return vd;

    }
    
    public void removeVaccineProduct(VaccineDetails vaccineProduct){  
        vaccineDetailList.remove(vaccineProduct);
    }

    
}
