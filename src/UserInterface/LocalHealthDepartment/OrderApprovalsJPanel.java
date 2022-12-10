/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.LocalHealthDepartment;

import Business.EcoSystem;
import Business.Enterprise.LocalHealthDepartment;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Organization.LHDImmuneOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhileshkavitkar
 */
public class OrderApprovalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderApprovalsJPanel
     */
    private JPanel workContainer;
    private UserAccount userAccount;
    private LocalHealthDepartment enterprise;
    private LHDImmuneOrganization phdOrg;
    private EcoSystem business;
    private StateNetwork state;
    
    public OrderApprovalsJPanel(JPanel workContainer, UserAccount userAccount, LocalHealthDepartment enterprise,LHDImmuneOrganization phdOrg, StateNetwork state,EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.phdOrg = phdOrg;
        this.business = business;
        this.state = state;
        populateTable();
    }
    
    
    private void populateTable(){
        
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblorder.getModel();
        defaulttabelmodel.setRowCount(0);
        
         LHDImmuneOrganization pOrg = null;
         
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof LHDImmuneOrganization)
        {   pOrg = (LHDImmuneOrganization)org;
            for(WorkRequest workRequest : pOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof ProviderVaccineOrderWorkRequest)
            {ProviderVaccineOrderWorkRequest vaccineOrderWR = (ProviderVaccineOrderWorkRequest)workRequest;
                
                Object[] row = new Object[5];
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getEnterprise();
                row[2] = vaccineOrderWR.getSender();
                row[3] = vaccineOrderWR.getStatus();
                row[4] = vaccineOrderWR.getPhdApprovedBy();
                
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
        tblorder = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btnref = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Approve Orders from Providers");

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Provider", "Sender", "Status", "Approved By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblorder);

        btnview.setBackground(new java.awt.Color(255, 0, 0));
        btnview.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View Details and Approve >>");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnref.setBackground(new java.awt.Color(102, 102, 102));
        btnref.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnref.setForeground(new java.awt.Color(255, 255, 255));
        btnref.setText("Refresh");
        btnref.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnref, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnview, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnref, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnview)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblorder.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        
         ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)tblorder.getValueAt(selectedRow, 0);
        
        
        
         ViewDetailsOfOrderJPanel panel = new ViewDetailsOfOrderJPanel(workContainer, userAccount, enterprise,phdOrg, state, business, request);
        workContainer.add("OrderApprovalsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnrefActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnref;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblorder;
    // End of variables declaration//GEN-END:variables
}
