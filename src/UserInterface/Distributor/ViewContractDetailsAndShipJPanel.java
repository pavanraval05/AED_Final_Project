/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Distributor;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.NationalEnterprise.Distributor;
import Business.Network.StateNetwork;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.CDCOrganization;
import Business.Organization.DistributorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.LHDImmuneOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineDetails;
import Business.Warehouse.Warehouse;
//import Business.WorkQueue.PaymentRequestWorkRequest;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import Business.WorkQueue.ShippingOrderWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhileshkavitkar
 */
public class ViewContractDetailsAndShipJPanel extends javax.swing.JPanel {


    private JPanel workContainer;
    
    private Distributor distributorEnterprise;
    
    private UserAccount userAccount;
    private EcoSystem business;
    private ProviderVaccineOrderWorkRequest request;
    private boolean flag;
    
    public ViewContractDetailsAndShipJPanel( JPanel workContainer, UserAccount userAccount,EcoSystem business, ProviderVaccineOrderWorkRequest request, Distributor distributorEnterprise ) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.request = request;
        this.distributorEnterprise = distributorEnterprise;
        txt1.setText(String.valueOf(request.getVaccineOrder().getOrderNumber()));
        displayContractDetails();
        calculateTotalCostOfOrder();
        populateOrderTable();
        flag = false;
 
        
    }
    
    private void displayContractDetails(){
        
        if(request.ishalfmonthContract())
            txt3.setText("Half Monthly");
        if(request.isfullMonthContract())
            txt3.setText("Monthly");
        if(request.isasReq())
            txt3.setText("As Required");
        
    }
    
    
    private void calculateTotalCostOfOrder(){
        
        double total = 0;
        for(OrderItem oi : request.getVaccineOrder().getItemList())
        {
            total = total + (oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity());
        }
        txt2.setText(String.valueOf(total));
    }
    
    
    private void populateOrderTable(){
        
         int rowCount = tblorder.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblorder.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        for(OrderItem oi: request.getVaccineOrder().getItemList())
        {
            Object[] row = new Object[9];
            
                row[0] = oi.getVaccineDetails();
                row[1] = oi;
                row[2] = oi.getVaccineDetails().getManufacturerName();
                row[3] = oi.getVaccineDetails().getVaccineId();
                row[4] = oi.getVaccineDetails().getBatchId();  
                row[5] = oi.getVaccineDetails().getVaccinePrice();
                row[6] = oi.getQuantity();
                row[7] = oi.getVaccineDetails().getManufactureDate();
                row[8] = oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity();

                defaulttabelmodel.addRow(row);
      
            
        }
    }

//    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        lbl3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblinven = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lbl4 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        lbl5 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        lbl6 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        btn3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 102));

        lbl1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("View Contract Details and Ship");

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("Order Number:");

        txt1.setEnabled(false);

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Vaccine id", "Batch ID", "Price", "Quantity", "manufacture date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblorder);

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setText("Order Particulars:");

        tblinven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Warehouse Id", "Warehouse Location", "Vaccine Id", "BatchID", "Vaccines in Inventory", "Available?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblinven.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblinven);

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(0, 0, 0));
        lbl4.setText("Inventory Check:");

        btn1.setBackground(new java.awt.Color(204, 0, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Ship order");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(0, 0, 0));
        lbl5.setText("Total Cost of the Order:");

        txt2.setEnabled(false);

        btn2.setBackground(new java.awt.Color(204, 0, 0));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Check Inventory");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(0, 0, 0));
        lbl6.setText("Contract :");

        txt3.setEnabled(false);

        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btn3.setText("Back");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl3)
                            .addComponent(lbl4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl6)
                                .addGap(18, 18, 18)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl6)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl5)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl2)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btn2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
         int rowCount = tblinven.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblinven.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }

        
        String vaccineCode = null;
        String manufacturer = null;
        String batchId = null;
       // int vaccineId = 0;
        DistributorOrganization distOrg = null;
       
        int count =0;
 
        for(OrderItem oi : request.getVaccineOrder().getItemList())
        {
            vaccineCode = oi.getVaccineDetails().getVaccineDefinition().getVaccineCode();
            manufacturer = oi.getVaccineDetails().getManufacturerName();
            batchId = oi.getVaccineDetails().getBatchId();

            
            for(Organization org: distributorEnterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof DistributorOrganization)
                {
                    distOrg = (DistributorOrganization) org;
                    for(Warehouse warehouse: distOrg.getWarehouseDir().getWarehouseList())
                    {   
                        for(VaccineDetails product: warehouse.getVaccineInventoryList())
                        {
                            if(product.getVaccineDefinition().getVaccineCode().equalsIgnoreCase(vaccineCode) && product.getManufacturerName().equalsIgnoreCase(manufacturer)&& product.getBatchId().equals(batchId))// && product.getVaccineId() == oi.getVaccineDetails().getVaccineId() )
                            {   
                                if(product.getAvailablity()>0)
                                { count++;
                                flag = true;
                                Object[] row = new Object[9];
                                
                                row[0] = product;
                                row[1] = product.getVaccineDefinition().getVaccineName();
                                row[2] = product.getManufacturerName();
                                row[3] = warehouse;
                                row[4] = warehouse.getLocation();
                                row[5] = product.getVaccineId();
                                row[6] = product.getBatchId();
                                row[7] = product.getAvailablity();
                                row[8] = "Yes";
                                
                               
                                defaulttabelmodel.addRow(row);
                                }
                                else
                                {
                                    String msg = new String("Not Enough quantity of "+ product);
                                        JOptionPane.showMessageDialog(null, msg);
                                        return;
                                    
                                }
                            }
                        }
                    }
                    
                    
                }
                
            }
            

        }
        
        if(count==0)
        {
            JOptionPane.showMessageDialog(null, "Vaccine are out of Stock in Inventory!");
            return;
        }
        

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        // TODO add your handling code here:
  
        if(flag== false)
        {
            JOptionPane.showMessageDialog(null, "Vaccine are out of Stock in Inventory!");
            return;
        }
        flag = false;
        //create a shipping order request
        
        ShippingOrderWorkRequest shipRequest = new ShippingOrderWorkRequest();
        shipRequest.setVaccineOrder(request.getVaccineOrder());
        shipRequest.setShippingDate(new Date());
        shipRequest.setSender(userAccount);
        shipRequest.setStatus("Shipped");
        request.setReceiver(userAccount);
        request.setStatus("Shipped");
        request.setResolveDate(new Date());
        request.setRequestDate(new Date());
        request.calculateDeliveryDate(request);
        String vaccineCode = null;
        String manufacturer = null;
        DistributorOrganization distOrg = null;
        int vaccineId = 0;
        String batchID = null;
        boolean warehouseFlag = false;
        boolean productFlag = false;
        
        for(OrderItem oi : request.getVaccineOrder().getItemList())
        {   warehouseFlag= false;
            vaccineCode = oi.getVaccineDetails().getVaccineDefinition().getVaccineCode();
            manufacturer = oi.getVaccineDetails().getManufacturerName();
            batchID = oi.getVaccineDetails().getBatchId();
   
            for(Organization org: distributorEnterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof DistributorOrganization)
                {
                    distOrg = (DistributorOrganization) org;
                    for(Warehouse warehouse: distOrg.getWarehouseDir().getWarehouseList())
                    {   if(warehouseFlag == false)
                    {   
                        
                        
                        for(VaccineDetails product: warehouse.getVaccineInventoryList())
                        {   
                            if(product.getVaccineDefinition().getVaccineCode().equalsIgnoreCase(vaccineCode) && product.getManufacturerName().equalsIgnoreCase(manufacturer) && product.getBatchId().equals(batchID))// && product.getVaccineId() == vaccineId)
                            {   
                                if(product.getAvailablity()>0)
                                { product.setAvailablity(product.getAvailablity()-oi.getQuantity());
                                shipRequest.getShipOrder().addNewOrderItem(oi.getQuantity(), product);
                                warehouseFlag = true;
                                
                                break;
                                }
                                else
                                    {   String msg = new String("Not Enough quantity of "+ product);
                                        JOptionPane.showMessageDialog(null, msg);
                                        return;
                                    }
                            }
                        }
                    }
                    else
                    {
                        break;
                    }
                    }
                    
        
                }
                
            }
            

            
        }
        
        
        
        
        //get the provider and insert it in his work queue
        HospitalOrganization hospOrg = null;
        for(Organization org: request.getEnterprise().getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                hospOrg = (HospitalOrganization)org;
                hospOrg.getWorkQueue().addWorkRequest(shipRequest);
                
            }
            
            
        }
        
        JOptionPane.showMessageDialog(null, "Order Shipped!");

        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JTable tblinven;
    private javax.swing.JTable tblorder;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
