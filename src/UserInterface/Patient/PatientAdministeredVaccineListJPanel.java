/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Patient;

import Business.Enterprise.HospitalEnterprise;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.Vaccine.AdministeredVaccineDetails;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhileshkavitkar
 */
public class PatientAdministeredVaccineListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdministeredVaccineListJPanel
     */
    private JPanel workContainer;
    private HospitalEnterprise enterprise;
    private UserAccount userAccount;
    
    
    public PatientAdministeredVaccineListJPanel(JPanel workContainer,HospitalEnterprise enterprise, UserAccount userAccount ) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        populateTable();
    }
    
    private void populateTable()
    {
        
         int rowCount = tblvaccl.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvaccl.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        Patient patient =(Patient)userAccount.getPerson();
        
        
             for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospOrg = (HospitalOrganization)org;
                for(AdministeredVaccineDetails vaccine: hospOrg.getClinic().getAdministeredVaccineList())
                {     
                    if(!(vaccine.getVaccineProduct()== null) && !(vaccine.getPatient()==null) && vaccine.getPatient().equals(patient))
                    {Object[] row = new Object[9];
                    row[0]=vaccine.getVaccineProduct();
                    row[1]=vaccine;
                    row[2]=vaccine.getVaccineProduct().getManufacturerName();
                    row[3]=vaccine.getVaccineProduct().getBatchId();
                    row[4]=vaccine.getVaccineProduct().getVaccineId();
                    row[5]=vaccine.getDate();
                    row[6]=vaccine.getSiteRoute();
                    row[7]=vaccine.getDoseNumber();
                    row[8]=vaccine.getshotstatus();
                    defaulttabelmodel.addRow(row);
                    
                    }
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvaccl = new javax.swing.JTable();
        btnref = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administered Vaccine List");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 996, -1));

        tblvaccl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Batch Number", "Vaccine Id", "Date", "SiteRoute", "Dose Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblvaccl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblvaccl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 950, 154));

        btnref.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnref.setText("Refresh");
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });
        add(btnref, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/vacclist_900x500.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnrefActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnref;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblvaccl;
    // End of variables declaration//GEN-END:variables
}
