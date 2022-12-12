/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.LocalHealthDepartment;

import Business.EcoSystem;
import Business.Enterprise.LocalHealthDepartment;
import Business.Network.StateNetwork;
import Business.Organization.LHDImmuneOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author samruddhamohire
 */
public class LHDEmployeeWorkAreaJPanel extends javax.swing.JPanel {

   
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private LocalHealthDepartment enterprise;
    private LHDImmuneOrganization lhdOrg;
    private EcoSystem business;
    private StateNetwork state;
    
    public LHDEmployeeWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, LocalHealthDepartment enterprise, LHDImmuneOrganization lhdOrg,EcoSystem business, StateNetwork state  ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.lhdOrg = lhdOrg;
        this.business = business;
        this.state = state;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        btnenterpop = new javax.swing.JButton();
        btnapprove = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        workContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl1.setText("Main Menu");

        btnenterpop.setBackground(new java.awt.Color(0, 0, 102));
        btnenterpop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnenterpop.setForeground(new java.awt.Color(255, 255, 255));
        btnenterpop.setText("Enter State Population");
        btnenterpop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterpopActionPerformed(evt);
            }
        });

        btnapprove.setBackground(new java.awt.Color(0, 0, 102));
        btnapprove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnapprove.setForeground(new java.awt.Color(255, 255, 255));
        btnapprove.setText("Order Approvals");
        btnapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapproveActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl2.setText("Local Health Department");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnenterpop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnapprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2)
                .addGap(62, 62, 62)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnenterpop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnapprove)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        workContainer.setBackground(new java.awt.Color(102, 153, 255));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapproveActionPerformed
        // TODO add your handling code here:
         OrderApprovalsJPanel panel = new OrderApprovalsJPanel(workContainer, userAccount, enterprise,lhdOrg, state, business);
        workContainer.add("OrderApprovalsJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btnapproveActionPerformed

    private void btnenterpopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterpopActionPerformed
        // TODO add your handling code here:
        EnterStatePopulationJPanel panel = new EnterStatePopulationJPanel(workContainer, state);
        workContainer.add("EnterStatePopulationJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
    }//GEN-LAST:event_btnenterpopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapprove;
    private javax.swing.JButton btnenterpop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
