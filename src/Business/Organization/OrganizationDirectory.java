/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author akhileshkavitkar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    //here we are creating organzations specified to the project
    public Organization createOrganization(OrganizationType type){
        Organization organization = null;
        if (type.getValue().equals(OrganizationType.EnterpriseAdminOrg.getValue())){
            organization = new EnterpriseAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.CDCOrg.getValue())){
            organization = new CDCOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.DistributorOrg.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.HospitalOrg.getValue())){
            organization = new HospitalOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.ManufactureOrg.getValue())){
            organization = new ManufactureOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.PatientOrganization.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.LocalHealthDepartmentOrg.getValue())){
            organization = new LHDImmuneOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.ClinicOrganization.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.MedicalOrganization.getValue())){
            organization = new MedicalOrganization();
            organizationList.add(organization);}
        
        
        return organization;
    }
}
