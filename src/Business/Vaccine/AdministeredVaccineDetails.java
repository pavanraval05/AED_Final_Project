/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Vaccine;

import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author samruddhamohire
 */

//Initialing class AdministeredVaccineDetails
public class AdministeredVaccineDetails {
    
    private VaccineDetails vaccineProduct;
    private int doseNumber;
    private String loc;
    private String shotstatus;
    private UserAccount provider; 
    private Date date;
    private Patient patient;
    private String reasonForFailure;

    
    //getters and setters
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getfailedReason() {
        return reasonForFailure;
    }

    public void setfailedReason(String reasonForFailure) {
        this.reasonForFailure = reasonForFailure;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public VaccineDetails getVaccineProduct() {
        return vaccineProduct;
    }

    public void setVaccineProduct(VaccineDetails vaccineProduct) {
        this.vaccineProduct = vaccineProduct;
    }

    public int getDoseNumber() {
        return doseNumber;
    }

    public void setDoseNumber(int doseNumber) {
        this.doseNumber = doseNumber;
    }

    public String getSiteRoute() {
        return loc;
    }

    public void setSiteRoute(String loc) {
        this.loc = loc;
    }

    public String getshotstatus() {
        return shotstatus;
    }

    public void setshotstatus(String shotstatus) {
        this.shotstatus = shotstatus;
    }

    public UserAccount getProvider() {
        return provider;
    }

    public void setProvider(UserAccount provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return vaccineProduct.getVaccineDefinition().getVaccineName();
    }

}
