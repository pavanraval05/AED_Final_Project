/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
//import UserInterface.UpdateUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author samruddhamohire
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem business, UserAccount userAccount ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mainMenuContainer = new javax.swing.JPanel();
        btnmanstate = new javax.swing.JButton();
        btnmancity = new javax.swing.JButton();
        btnmanmanuf = new javax.swing.JButton();
        btnmanprovi = new javax.swing.JButton();
        btnmanvacc = new javax.swing.JButton();
        btnmandisease = new javax.swing.JButton();
        btnmanacct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(250);

        workContainer.setBackground(new java.awt.Color(102, 153, 255));
        workContainer.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/sysadmin.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        workContainer.add(jPanel1, "card2");

        jSplitPane1.setRightComponent(workContainer);

        mainMenuContainer.setBackground(new java.awt.Color(51, 255, 102));

        btnmanstate.setBackground(new java.awt.Color(0, 0, 102));
        btnmanstate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmanstate.setForeground(new java.awt.Color(255, 255, 255));
        btnmanstate.setText("Manage States ");
        btnmanstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanstateActionPerformed(evt);
            }
        });

        btnmancity.setBackground(new java.awt.Color(0, 0, 102));
        btnmancity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmancity.setForeground(new java.awt.Color(255, 255, 255));
        btnmancity.setText("Manage Cities");
        btnmancity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmancityActionPerformed(evt);
            }
        });

        btnmanmanuf.setBackground(new java.awt.Color(0, 0, 102));
        btnmanmanuf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmanmanuf.setForeground(new java.awt.Color(255, 255, 255));
        btnmanmanuf.setText("Manage Manufacturers");
        btnmanmanuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanmanufActionPerformed(evt);
            }
        });

        btnmanprovi.setBackground(new java.awt.Color(0, 0, 102));
        btnmanprovi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmanprovi.setForeground(new java.awt.Color(255, 255, 255));
        btnmanprovi.setText("Manage Providers");
        btnmanprovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanproviActionPerformed(evt);
            }
        });

        btnmanvacc.setBackground(new java.awt.Color(0, 0, 102));
        btnmanvacc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmanvacc.setForeground(new java.awt.Color(255, 255, 255));
        btnmanvacc.setText("Manage Vaccine Catalog");
        btnmanvacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanvaccActionPerformed(evt);
            }
        });

        btnmandisease.setBackground(new java.awt.Color(0, 0, 102));
        btnmandisease.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmandisease.setForeground(new java.awt.Color(255, 255, 255));
        btnmandisease.setText("Manage Disease Catalog");
        btnmandisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmandiseaseActionPerformed(evt);
            }
        });

        btnmanacct.setBackground(new java.awt.Color(0, 0, 102));
        btnmanacct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnmanacct.setForeground(new java.awt.Color(255, 255, 255));
        btnmanacct.setText("Manage User Accounts");
        btnmanacct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanacctActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("SYSTEM ADMIN");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/sysmiddle_150x150.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout mainMenuContainerLayout = new javax.swing.GroupLayout(mainMenuContainer);
        mainMenuContainer.setLayout(mainMenuContainerLayout);
        mainMenuContainerLayout.setHorizontalGroup(
            mainMenuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuContainerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainMenuContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainMenuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmanvacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanprovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanmanuf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmancity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanstate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmandisease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmanacct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainMenuContainerLayout.setVerticalGroup(
            mainMenuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuContainerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnmanstate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmancity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmanmanuf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmanprovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmanvacc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmandisease)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmanacct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(mainMenuContainer);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanacctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanacctActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel panel = new ManageUserAccountJPanel(workContainer, business);
        workContainer.add("ManageUserAccountJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmanacctActionPerformed

    private void btnmandiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmandiseaseActionPerformed
        // TODO add your handling code here:
        ManageDiseaseCatalogJPanel panel = new ManageDiseaseCatalogJPanel(workContainer, business);
        workContainer.add("ManageDiseaseCatalogJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmandiseaseActionPerformed

    private void btnmanvaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanvaccActionPerformed
        // TODO add your handling code here:
        ManageVaccineCatalogJPanel panel = new ManageVaccineCatalogJPanel(workContainer, business);
        workContainer.add("ManageVaccineCatalogJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmanvaccActionPerformed

    private void btnmanproviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanproviActionPerformed
        // TODO add your handling code here:
        ManageProviderJPanel panel = new ManageProviderJPanel(workContainer, business);
        workContainer.add("ManageProviderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmanproviActionPerformed

    private void btnmanmanufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanmanufActionPerformed
        // TODO add your handling code here:
        ManageManufacturersJPanel panel = new ManageManufacturersJPanel(workContainer, business);
        workContainer.add("ManageManufacturersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmanmanufActionPerformed

    private void btnmancityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmancityActionPerformed
        // TODO add your handling code here:
        ManageCityJPanel panel = new ManageCityJPanel(workContainer, business);
        workContainer.add("ManageCityJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmancityActionPerformed

    private void btnmanstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanstateActionPerformed
        // TODO add your handling code here:
        ManageStateJPanel panel = new ManageStateJPanel(workContainer, business);
        workContainer.add("ManageStateJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnmanstateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmanacct;
    private javax.swing.JButton btnmancity;
    private javax.swing.JButton btnmandisease;
    private javax.swing.JButton btnmanmanuf;
    private javax.swing.JButton btnmanprovi;
    private javax.swing.JButton btnmanstate;
    private javax.swing.JButton btnmanvacc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mainMenuContainer;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
