/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author akhilesh
 */
////Initializing class ProviderRole that extends Role

public class SystemAdminRole extends Role{
    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business, account);
    }
    
  
}
