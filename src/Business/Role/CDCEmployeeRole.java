/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.CDC;
import Business.Network.StateNetwork;
import Business.Organization.CDCOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CDC.CDCEmployee;
import javax.swing.JPanel;

/**
 *
 * @author samruddhamohire
 */

//Initializing class CDCEmployeeRole that extends Role

public class CDCEmployeeRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new CDCEmployee(userProcessContainer, account, (CDC)enterprise, (CDCOrganization)organization, business);
    }
    
}
