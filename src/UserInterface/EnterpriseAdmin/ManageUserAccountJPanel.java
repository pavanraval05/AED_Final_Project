/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.EnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavan
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel workContainer;
    private Enterprise enterprise;
    private EcoSystem business;
    
    public ManageUserAccountJPanel(JPanel workContainer, Enterprise enterprise , EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        this.business = business;
        populateTable();
    }
    
    protected void populateTable(){
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblaccts.getModel();

        defaulttabelmodel.setRowCount(0);
        
            for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[5];
                row[0] = ua.getPerson().getFirstName()+ " "+ua.getPerson().getLastName();
                row[1] = "Enterprise Admin";
                row[2] = ua;
                row[3] = ua.getPassword();
                row[4] = ua.getRole();
                
                ((DefaultTableModel) tblaccts.getModel()).addRow(row);
            }
        
        

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[5];
                row[0] = ua.getPerson().getFirstName()+ " "+ua.getPerson().getLastName();
                if(organization instanceof ClinicOrganization)
            {
                ClinicOrganization satOrg =(ClinicOrganization)organization;
                row[1] = satOrg.getClincName()+"Clinic";
            }
                else row[1] = organization;
                row[2] = ua;
                row[3] = ua.getPassword();
                row[4] = ua.getRole();
                
                ((DefaultTableModel) tblaccts.getModel()).addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblaccts = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(51, 255, 102));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Manage User Accounts");

        tblaccts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Department", "UserName", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblaccts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblaccts);
        if (tblaccts.getColumnModel().getColumnCount() > 0) {
            tblaccts.getColumnModel().getColumn(0).setResizable(false);
            tblaccts.getColumnModel().getColumn(1).setResizable(false);
            tblaccts.getColumnModel().getColumn(2).setResizable(false);
            tblaccts.getColumnModel().getColumn(3).setResizable(false);
            tblaccts.getColumnModel().getColumn(4).setResizable(false);
        }

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Create New User Account >>");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("View / Update User Account");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 102));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Remove User");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn2)
                        .addGap(28, 28, 28)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btn1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
         CreateUserAccountJPanel panel = new CreateUserAccountJPanel(workContainer, enterprise , this, business);
        workContainer.add("CreateUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        int row = tblaccts.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a user account from table");
            return;
        }
        Organization org = null;
        
        UserAccount ua = (UserAccount)tblaccts.getValueAt(row, 2);
        
        
        if(tblaccts.getValueAt(row, 1) instanceof String)
        {
            enterprise.getUserAccountDirectory().removeUserAccount(ua);
        }
        else
        { org = (Organization) tblaccts.getValueAt(row, 1);
        
        org.getUserAccountDirectory().removeUserAccount(ua);
        }
        populateTable();
        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        int row = tblaccts.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a user account from table");
            return;
        }
        Organization org = null;
        UserAccount ua = (UserAccount)tblaccts.getValueAt(row, 2);
        if((tblaccts.getValueAt(row, 1) instanceof String) == false)
        org = (Organization) tblaccts.getValueAt(row, 1);
        ViewUserAccountJPanel panel = new ViewUserAccountJPanel(workContainer, enterprise , this, ua, org, business);
        workContainer.add("ViewUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTable tblaccts;
    // End of variables declaration//GEN-END:variables
}
