/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

/**
 *
 * @author akash
 */
//Creating class ClinicProvider that extends Person
public class ClinicProvider extends Person{
    
     private int id;
    private static int count = 1;
    //private HospitalEnterprise affliatedHospital;

    public ClinicProvider() {
        id = count;
        count++;
    }
    
    
    
    public int getId() {
        return id;
    }
    
        @Override
    public String toString(){
        return this.getFirstName()+ " " + this.getLastName();
    }
    
}
