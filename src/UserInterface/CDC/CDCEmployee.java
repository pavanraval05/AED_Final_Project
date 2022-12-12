/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.CDC;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.CDC;
import Business.Organization.CDCOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public class CDCEmployee extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CDC cdc;
    private UserAccount userAccount;
    private CDCOrganization cdcOrg;
    private EcoSystem business;
    public CDCEmployee(JPanel userProcessContainer,UserAccount userAccount, CDC cdc,CDCOrganization cdcOrg,EcoSystem business ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.cdc = cdc;
        this.business = business;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        mainMenu = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        workContainer = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(102, 153, 255));
        jSplitPane1.setDividerLocation(170);

        mainMenu.setBackground(new java.awt.Color(51, 255, 102));

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Create Vaccine Order");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl1.setBackground(new java.awt.Color(0, 0, 0));
        lbl1.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
        lbl1.setText("Main Menu");

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Manage Orders");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/cdc1_50x50.jpg"))); // NOI18N

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbl1))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn2)
                    .addComponent(btn1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbl1)
                .addGap(28, 28, 28)
                .addComponent(btn1)
                .addGap(38, 38, 38)
                .addComponent(btn2)
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        mainMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1, btn2});

        jSplitPane1.setTopComponent(mainMenu);

        workContainer.setBackground(new java.awt.Color(51, 255, 102));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        MngOrder panel = new MngOrder(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        CreateVaccOrder panel = new CreateVaccOrder(workContainer, cdc, business, cdcOrg,userAccount);
        workContainer.add("CreateVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);

    }//GEN-LAST:event_btn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
