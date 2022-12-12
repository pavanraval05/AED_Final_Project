/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Warehouse;

import java.util.ArrayList;

/**
 *
 * @author pavan
 */

//Creating class WarehouseDirectory
public class WarehouseDirectory {
    
    private ArrayList<Warehouse> warehouseList;

    public WarehouseDirectory() {
        warehouseList = new ArrayList<>();
    }

    public ArrayList<Warehouse> getWarehouseList() {
        return warehouseList;
    }
    
    public Warehouse addNewWareHouse(){
        
        Warehouse wh = new Warehouse();
        warehouseList.add(wh);
        return wh;
    }
    
    
    public void removeWarehouse(Warehouse wh){
        
        warehouseList.remove(wh);
    }
}
