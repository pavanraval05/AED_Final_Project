/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.NationalEnterprise.CDC;
import Business.Network.StateNetwork;
import Business.Organization.CDCOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.medicalOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.CDC.MedicalOfficerNewJPanel;
import UserInterface.Patient.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author akhilesh
 */


//Initializing class MedicalOfficer that extends Role
public class MedicalOfficer extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business, StateNetwork state) {
        return new MedicalOfficerNewJPanel(userProcessContainer, account,business, (CDC)enterprise, (medicalOrganization)organization);
    }
    
}
