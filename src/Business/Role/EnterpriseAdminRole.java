/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.EnterpriseAdmin.EnterpriseAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author pavan
 */
//Initializing class EnterpriseAdminRole that extends Role
public class EnterpriseAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new EnterpriseAdminWorkAreaJPanel(userProcessContainer, enterprise, account, business);
    }

    
    
}
