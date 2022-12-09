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

//Crating class VaccineDirectory
public class VaccineDirectory {
    
    private ArrayList<Vaccine> vaccineCatalog;

    public VaccineDirectory() {
        
        vaccineCatalog = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(ArrayList<Vaccine> vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }
    
    public Vaccine addNewVaccineDefinition(){
        
        Vaccine newVaccine = new Vaccine();
        vaccineCatalog.add(newVaccine);
        return newVaccine;
        
    }
    
    public void removeVaccineDefinition(Vaccine vaccine){
        
        vaccineCatalog.remove(vaccine);
    }
    
    
    
}
