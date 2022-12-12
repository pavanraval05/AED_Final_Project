/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Manufacture;

import Business.EcoSystem;
import Business.NationalEnterprise.Manufacturer;
import Business.Order.OrderItem;
import Business.Organization.DistributorOrganization;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.Vaccine.VaccineDetails;
import Business.WorkQueue.VaccineOrderWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhileshkavitkar
 */
public class ProcessOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessOrdersJPanel
     */
    private JPanel workContainer;
    private VaccineOrderWorkRequest vaccineWorkRequest;
    private Manufacturer manufacturer;
    private EcoSystem business;

    public ProcessOrdersJPanel(JPanel workContainer, VaccineOrderWorkRequest vaccineWorkRequest, Manufacturer manufacturer, EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.vaccineWorkRequest = vaccineWorkRequest;
        this.manufacturer = manufacturer;
        this.business = business;
        txtornum.setText(String.valueOf(vaccineWorkRequest.getVaccineOrder().getOrderNumber()));
        populateTable();
        calculateTotalAmount();

    }

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tbldetails.getModel();

        model.setRowCount(0);

        for (OrderItem orderItem : vaccineWorkRequest.getVaccineOrder().getItemList()) {
            Object[] row = new Object[4];
            row[0] = orderItem.getVaccineDetails().getVaccineDefinition().getVaccineCode();
            row[1] = orderItem.getVaccineDetails().getVaccineDefinition().getVaccineName();
            row[2] = orderItem.getQuantity();
            row[3] = orderItem.getVaccineDetails().getVaccinePrice() * orderItem.getQuantity();

            model.addRow(row);
        }
    }

    private void calculateTotalAmount() {

        double totalAmount = 0;
        for (OrderItem orderItem : vaccineWorkRequest.getVaccineOrder().getItemList()) {
            totalAmount = totalAmount + (orderItem.getVaccineDetails().getVaccinePrice() * orderItem.getQuantity());
        }

        txtamt.setText(String.valueOf(totalAmount));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetails = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtornum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtamt = new javax.swing.JTextField();
        btnship = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Process Orders");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Details:");

        tbldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbldetails);
        if (tbldetails.getColumnModel().getColumnCount() > 0) {
            tbldetails.getColumnModel().getColumn(2).setResizable(false);
            tbldetails.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Order Number:");

        txtornum.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Total Amount of Order: ");

        txtamt.setEnabled(false);

        btnship.setBackground(new java.awt.Color(0, 0, 102));
        btnship.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnship.setForeground(new java.awt.Color(255, 255, 255));
        btnship.setText("Ship Order");
        btnship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshipActionPerformed(evt);
            }
        });

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/process.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnship, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnback))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnship)
                .addGap(18, 18, 18)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshipActionPerformed
        // TODO add your handling code here:
        if(vaccineWorkRequest.getStatus().equalsIgnoreCase("Shipped") || vaccineWorkRequest.getStatus().equalsIgnoreCase("Stored"))
         {
             JOptionPane.showMessageDialog(null, "Order already shipped!");
             return;
         }
        
        vaccineWorkRequest.setStatus("Shipped");
        vaccineWorkRequest.setShipdate(new Date());

        DistributorOrganization distributorOrg = null;
            for (Organization org : business.getDistributor().getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof DistributorOrganization){
                    distributorOrg = (DistributorOrganization) org;
                    distributorOrg.getWorkQueue().addWorkRequest(vaccineWorkRequest);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Order Sent to Distributor");

    }//GEN-LAST:event_btnshipActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnship;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldetails;
    private javax.swing.JTextField txtamt;
    private javax.swing.JTextField txtornum;
    // End of variables declaration//GEN-END:variables
}
