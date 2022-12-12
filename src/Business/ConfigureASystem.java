/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author akhileshkavitkar
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        //Creating Ecosystem
        EcoSystem business = EcoSystem.getInstance();
        Person person = null;
        //Creating sysadmin user account
        UserAccount sysAdmin = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());       
        return business;
    }
    
}
