/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.EnterpriseAdmin;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.LocalHealthDepartment;
import Business.NationalEnterprise.CDC;
import Business.NationalEnterprise.Distributor;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.CDCOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.ClinicOrganization;
import Business.Organization.medicalOrganization;
import Business.Person.Person;
import Business.Person.Patient;
import Business.Role.Role.RoleType;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pavan
 */

public class CreatePersonJPanel extends javax.swing.JPanel {

   
    private JPanel workContainer;
    private Enterprise enterprise;
    
    public CreatePersonJPanel(JPanel workContainer, Enterprise enterprise) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        cbdepat.removeAllItems();
        populateDepartmentComboBox();
        lbl9.setVisible(false);
            txt6.setVisible(false);
        if(enterprise instanceof HospitalEnterprise)
        {
            lbl9.setVisible(true);
            txt6.setVisible(true);
        }
        
        
    }
    
    public void populateDepartmentComboBox(){
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            cbdepat.addItem(org);
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

        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        lbl6 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        lbl7 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        lbl8 = new javax.swing.JLabel();
        cbdepat = new javax.swing.JComboBox();
        lbl9 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        dcdob = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(51, 255, 102));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Create Person");

        lbl2.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl2.setText("First Name: ");

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        lbl3.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl3.setText("Last Name: ");

        lbl4.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl4.setText("email:");

        lbl5.setText("@");

        lbl6.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl6.setText("Phone:");

        lbl7.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl7.setText("Date of Birth:");

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Add Person");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl8.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl8.setText("Department:");

        cbdepat.setForeground(new java.awt.Color(0, 0, 102));
        cbdepat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbdepat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdepatActionPerformed(evt);
            }
        });

        lbl9.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl9.setText("Clinic Name:");

        txt6.setEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/createperson_800x220.jpg"))); // NOI18N

        btn2.setBackground(new java.awt.Color(51, 102, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(lbl8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl6))))
                            .addComponent(lbl7)
                            .addComponent(lbl9)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl2)
                                    .addComponent(lbl3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt4))
                            .addComponent(txt5)
                            .addComponent(cbdepat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1)
                            .addComponent(txt2)
                            .addComponent(txt6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl7)
                    .addComponent(dcdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl8)
                    .addComponent(cbdepat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl9)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        try{
         long phone = Long.parseLong(txt5.getText());
         
        String firstName = txt1.getText();
        if(firstName.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter first Name!");
            return;
        }
        
        String lastName = txt2.getText();
        if(lastName.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter last Name!");
            return;
        }
        String email = txt3.getText()+"@"+txt4.getText();
       
        Date dob = dcdob.getDate();
        Organization org = (Organization)cbdepat.getSelectedItem();
        Person person = null;
        Patient patient = null;
        if(enterprise instanceof CDC){
            if(org instanceof CDCOrganization){
            person = org.getPersonDirectory().createPerson(firstName, lastName, RoleType.CDCEmployee);
            }
            if(org instanceof medicalOrganization){
            person = org.getPersonDirectory().createPerson(firstName, lastName, RoleType.MedicalOfficer);
            }

            }
         if(enterprise instanceof Manufacturer)
        { person = org.getPersonDirectory().createPerson(firstName, lastName, RoleType.Manufacturer);
        }
         if(enterprise instanceof Distributor)
        { person = org.getPersonDirectory().createPerson(firstName, lastName, RoleType.Distributor);
        }
         if(enterprise instanceof LocalHealthDepartment)
        { person = org.getPersonDirectory().createPerson(firstName, lastName, RoleType.LocalHealthDepartment);
        }
         if(enterprise instanceof HospitalEnterprise)
         {
             if(org instanceof HospitalOrganization)
            { person = org.getPersonDirectory().createPerson(firstName, lastName, RoleType.Provider);
            }
             if(org instanceof PatientOrganization)
            { patient = (Patient)org.getPersonDirectory().createPerson(firstName, lastName, RoleType.Patient);
            }
             if(org instanceof ClinicOrganization)
            { person = org.getPersonDirectory().createPerson(firstName, lastName, RoleType.ClinicProvider);
            }
  
         }
         if(person!=null)
         {person.setDateOfBirth(dob);
         person.setEmail(email);
         person.setPhone(phone);
         }
         if(patient!=null)
         {patient.setDateOfBirth(dob);
         patient.setEmail(email);
         patient.setPhone(phone);
         }
         
         
          JOptionPane.showMessageDialog(null, "Person Added!");
         
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter numeric value for phone");
            return;
        }
  
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void cbdepatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdepatActionPerformed
        // TODO add your handling code here:
        
        Organization org =(Organization)cbdepat.getSelectedItem();
        if(org ==  null)
        {
            return;
        }
        if(org instanceof ClinicOrganization)
        {   ClinicOrganization satOrg = (ClinicOrganization)org;
            txt6.setText(satOrg.getClincName());
        }
        else
            return;
        
        
    }//GEN-LAST:event_cbdepatActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox cbdepat;
    private com.toedter.calendar.JDateChooser dcdob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}
