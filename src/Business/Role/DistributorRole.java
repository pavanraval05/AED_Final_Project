/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.Distributor;
import Business.Network.StateNetwork;
import Business.Organization.DistributorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Distributor.DistributorEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author pavan
 */

//Initializing class DistributorRole that extends Role
public class DistributorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new DistributorEmployeeWorkAreaJPanel(userProcessContainer, account, (Distributor)enterprise, (DistributorOrganization)organization, business);
    }
    
}
