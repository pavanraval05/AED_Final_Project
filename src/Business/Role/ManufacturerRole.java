/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.Manufacturer;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Manufacture.ManufactureEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author akhileshkavitkar
 */

//Initializing class ManufacturerRole that extends Role
public class ManufacturerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new ManufactureEmployeeWorkAreaJPanel(userProcessContainer, account, (Manufacturer)enterprise, business);
    }
    
}
