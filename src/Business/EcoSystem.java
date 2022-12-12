/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Disease.DiseaseDirectory;
import Business.NationalEnterprise.CDC;
import Business.NationalEnterprise.Distributor;
import Business.NationalEnterprise.ManufacturerDirectory;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;



/**
 *
 * @author samruddhamohire
 */

//Definig Ecosystem Class
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    
    private ArrayList<StateNetwork> stateDirectory;
    private CDC cdc;
    private ManufacturerDirectory manufacturerDirectory;
    private Distributor distributor;
    private VaccineDirectory vaccineDirectory;
    private DiseaseDirectory diseaseDirectory;
    
  
    
    public static EcoSystem getInstance(){
        if (business == null){
            business = new EcoSystem();
        }
        return business;
        
    }

    private EcoSystem() {
        super(null); 
      
      this.stateDirectory = new ArrayList<StateNetwork>();
      cdc = new CDC("CDC");
      manufacturerDirectory = new ManufacturerDirectory();
      distributor = new Distributor("Vaccine Distributor");
      vaccineDirectory = new VaccineDirectory();
      diseaseDirectory = new DiseaseDirectory();
      
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public DiseaseDirectory getDiseaseDirectory() {
        return diseaseDirectory;
    }

    

    public ArrayList<StateNetwork> getStateList() {
        return stateDirectory;
    }

    public CDC getCdc() {
        return cdc;
    }

    public ManufacturerDirectory getManufacturerDirectory() {
        return manufacturerDirectory;
    }

    public Distributor getDistributor() {
        return distributor;
    }
    
    
    public StateNetwork addNewState(String name){
        
        StateNetwork state = new StateNetwork();
        state.setStateName(name);
        stateDirectory.add(state);
        return state;
    }
    
    public void removeState(StateNetwork state){
        
        stateDirectory.remove(state);
    }
 
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roleList = new ArrayList<Role>();
       roleList.add(new SystemAdminRole());
       return roleList;
    }

   
}