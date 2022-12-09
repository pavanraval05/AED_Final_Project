/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Vaccine.AdministeredVaccineDetails;
import java.util.ArrayList;

/**
 *
 * @author pavan
 */

//Creating class Patient that extends Person
public class Patient extends Person {
    
     private int id;
    private static int count = 1;
    private ArrayList<AdministeredVaccineDetails> administeredVaccineList ;
    

    public Patient() {
        id = count;
        count++;
        administeredVaccineList = new ArrayList<>();
    }

    public ArrayList<AdministeredVaccineDetails> getAdministeredVaccineList() {
        return administeredVaccineList;
    }
    
    public AdministeredVaccineDetails addNewAdministeredVaccine(){
        AdministeredVaccineDetails avd = new AdministeredVaccineDetails();
        administeredVaccineList.add(avd);
        return avd;
        
    }
    
    public int getId() {
        return id;
    }

    
        @Override
    public String toString(){
        return this.getFirstName()+ " " + this.getLastName();
    }

    
}
