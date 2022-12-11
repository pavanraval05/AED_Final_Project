/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Vaccine;

import Business.Disease.Disease;
import Business.Network.StateNetwork;

/**
 *
 * @author pavan
 */

//Creating CLass Vaccine
public class Vaccine {
    
    private String vaccineCode;
    private String vaccineName;
    private StateNetwork state;
    private Disease disease;
    

    public Vaccine() {
    }

    public StateNetwork getState() {
        return state;
    }

    public void setState(StateNetwork state) {
        this.state = state;
    }


    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }


    public String getVaccineCode() {
        return vaccineCode;
    }

    public void setVaccineCode(String vaccineCode) {
        this.vaccineCode = vaccineCode;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    @Override
    public String toString() {
        return vaccineCode;
    }

}
