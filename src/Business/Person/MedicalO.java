/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author vinithiteshharsora
 */

//Creating class MedicalO that extends Person
public class MedicalO extends Person{
    private int id;
    private static int count = 1;

    public MedicalO() {
        
        id = count;
        count++;
    }
    
    
     public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return this.getFirstName()+" "+this.getLastName();
    
}}
