/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.LocalHealthDepartment;

import Business.EcoSystem;
import Business.Enterprise.LocalHealthDepartment;
import Business.Network.StateNetwork;
import Business.Order.OrderItem;
import Business.Organization.CDCOrganization;
import Business.Organization.Organization;
import Business.Organization.LHDImmuneOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samruddhamohire
 */
public class ViewDetailsOfOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsOfOrderJPanel
     */
    private JPanel workContainer;
    private UserAccount userAccount;
    private LocalHealthDepartment enterprise;
    private LHDImmuneOrganization lhdOrg;
    private EcoSystem business;
    private StateNetwork state;
    private ProviderVaccineOrderWorkRequest request;
    
    public ViewDetailsOfOrderJPanel(JPanel workContainer, UserAccount userAccount, LocalHealthDepartment enterprise,LHDImmuneOrganization lhdOrg, StateNetwork state,EcoSystem business, ProviderVaccineOrderWorkRequest request) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.lhdOrg = lhdOrg;
        this.business = business;
        this.state = state;
        this.request = request;
        txtornum.setText(String.valueOf(request.getVaccineOrder().getOrderNumber()));
        displayContractDetails();
        populateTable();
        
    }
    
    private void displayContractDetails(){
        
        if(request.ishalfmonthContract())
            tctdetails1.setText("Half Monthly");
        if(request.isfullMonthContract())
            tctdetails1.setText("Monthly");
        if(request.isasReq())
            tctdetails1.setText("Adhoc");
        
    }
    
    private void populateTable(){
        
         int rowCount = tblvaccorder.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvaccorder.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        for(OrderItem oi: request.getVaccineOrder().getItemList())
        {
            Object[] row = new Object[8];
            
                row[0] = oi.getVaccineDetails();
                row[1] = oi;
                row[2] = oi.getVaccineDetails().getVaccineId();
                row[3] = oi.getVaccineDetails().getBatchId();
                row[4] = oi.getVaccineDetails().getVaccinePrice();
                row[5] = oi.getQuantity();
                row[6] = oi.getVaccineDetails().getManufactureDate();
                row[7] = oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity();
                defaulttabelmodel.addRow(row);

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
        jLabel2 = new javax.swing.JLabel();
        txtornum = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblvaccorder = new javax.swing.JTable();
        btnapprove = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tctdetails1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Order Number:");

        txtornum.setEnabled(false);
        txtornum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtornumActionPerformed(evt);
            }
        });

        tblvaccorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Vaccine id", "Lot Number", "Price", "Quantity", "manufacture date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblvaccorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblvaccorder);

        btnapprove.setBackground(new java.awt.Color(0, 0, 102));
        btnapprove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnapprove.setForeground(new java.awt.Color(255, 255, 255));
        btnapprove.setText("Approve Order");
        btnapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapproveActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 0, 102));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Contract Details:");

        tctdetails1.setEnabled(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/cart1_50x50.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/adminapproved.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tctdetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(162, 162, 162)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tctdetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnapprove)
                            .addComponent(btnback))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtornumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtornumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtornumActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapproveActionPerformed
        // TODO add your handling code here:
        //check if its already approved!
        if(request.getStatus().equalsIgnoreCase("LHD Approved") || request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("CDC Approved") )
        {
             JOptionPane.showMessageDialog(null, "Order already approved!");
             return;
        }
        
        //fetch the cdc org and insert the request into its workQueue
        
        CDCOrganization cdcOrg = null;
        for(Organization org: business.getCdc().getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof CDCOrganization)
            {
                org.getWorkQueue().addWorkRequest(request);
            }
        }

        request.setApprovedByLHD(true);
        request.setPhdApprovedBy(userAccount);
        request.setStatus("LHD Approved");
        request.setreqState(state);
        
        JOptionPane.showMessageDialog(null, "Order Sent to CDC!");
        
    }//GEN-LAST:event_btnapproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapprove;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblvaccorder;
    private javax.swing.JTextField tctdetails1;
    private javax.swing.JTextField txtornum;
    // End of variables declaration//GEN-END:variables
}
