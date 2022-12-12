/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author pavan
 */

//Calling DiseaseDirectory Class
public class DiseaseDirectory {
    
    private ArrayList<Disease> diseaseDirectory;

    public DiseaseDirectory() {
        
        diseaseDirectory = new ArrayList<>();
    }

    public ArrayList<Disease> getdiseaseDirectory() {
        return diseaseDirectory;
    }

    public void setdiseaseDirectory(ArrayList<Disease> diseaseDirectory) {
        this.diseaseDirectory = diseaseDirectory;
    }
    
    
    public Disease addNewDisease(){
        
        Disease newD = new Disease();
        diseaseDirectory.add(newD);
        return newD;        
        
    }
    
    
    public void removeDisease(Disease disease){
        
        diseaseDirectory.remove(disease);
    }
    
    
}
