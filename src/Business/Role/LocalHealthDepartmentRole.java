/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LocalHealthDepartment;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.LHDImmuneOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.LocalHealthDepartment.LHDEmployeeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author akhilesh
 */

//Initializing class LocalHealthDepartmentRole that extends Role
public class LocalHealthDepartmentRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new LHDEmployeeWorkAreaJPanel(userProcessContainer, account, (LocalHealthDepartment)enterprise, (LHDImmuneOrganization)organization, business, state);
    }
    
}
