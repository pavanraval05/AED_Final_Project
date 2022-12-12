/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.NationalEnterprise;

import java.util.ArrayList;

/**
 *
 * @author akhilesh
 */

//Initializing class ManufacturerDirectory
public class ManufacturerDirectory {
    
    private ArrayList<Manufacturer> manufacturerDirectory;

    public ManufacturerDirectory() {
        
        manufacturerDirectory = new ArrayList<>();
        
    }

    public ArrayList<Manufacturer> getManufacturerDirectory() {
        return manufacturerDirectory;
    }

    public void setManufacturerDirectory(ArrayList<Manufacturer> manufacturerDirectory) {
        this.manufacturerDirectory = manufacturerDirectory;
    }
    
    public Manufacturer addNewManufacturer(String name){
        
        Manufacturer nm = new Manufacturer(name);
        manufacturerDirectory.add(nm);
        return nm;  
    }
    
    public void removeManufacturer(Manufacturer m){
        
        manufacturerDirectory.remove(m);
    }
    
    
}
