/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Clinic;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.NationalEnterprise.Manufacturer;
import Business.Network.StateNetwork;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.HospitalOrganization;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.VaccineDetails;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class PlaceVaccineOrderClinicJPanel extends javax.swing.JPanel {

    private JPanel workContainer;

    private HospitalEnterprise hospital;
    private UserAccount userAccount;
    private ClinicOrganization clinicOrg;
    private EcoSystem business;
    private Order tempOrder;
    private ArrayList<OrderItem> cartOrder;
    private boolean isCheckout;
    private StateNetwork state;

    public PlaceVaccineOrderClinicJPanel(JPanel workContainer, HospitalEnterprise hospital,ClinicOrganization clinicOrg,UserAccount userAccount , EcoSystem business, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.state = state;
        populateManufacturerComboBox();
        this.isCheckout = false;
        
         cartOrder = new ArrayList<OrderItem>();
         
         if(isCheckout == false){
             tempOrder = new Order();
         }
   
    }

    private void populateManufacturerComboBox() {
        cbmanu.removeAllItems();
        for (Manufacturer manufacturer : business.getManufacturerDirectory().getManufacturerDirectory()) {
            cbmanu.addItem(manufacturer);

        }
    }
    
    private void displayManufacturerVaccines(){
        
        int rowCount = tblvacc.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvacc.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        
        //get Manufacturer from combo box
        Manufacturer manufacturer = (Manufacturer)cbmanu.getSelectedItem();
        if(manufacturer == null){
            return;
        }
        
        //populate the table
        ManufactureOrganization manufacureOrg = null;
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccine : manufacureOrg.getVaccineProductCatalog().getVaccineProductList())
            {Object[] row = new Object[6];
            row[0] = vaccine;
            row[1] = vaccine.getVaccineDefinition().getVaccineName();
            row[2] = vaccine.getVaccineId();
            row[3] = vaccine.getBatchId();
            row[4] = vaccine.getVaccinePrice();
            row[5] = vaccine.getManufactureDate();
            defaulttabelmodel.addRow(row);
            }
        }
        }
   
    }
    
    
    private void searchVaccineProducts(String vaccineCode){
        
        int rowCount = tblvacc.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvacc.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        
        for(Manufacturer manufacturer: business.getManufacturerDirectory().getManufacturerDirectory())
        {
             ManufactureOrganization manufacureOrg = null;
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(VaccineDetails vaccine : manufacureOrg.getVaccineProductCatalog().getVaccineProductList())
            {
                if(vaccineCode.equalsIgnoreCase(vaccine.getVaccineDefinition().getVaccineCode()))
                {
                Object[] row = new Object[6];
            
                row[0] = vaccine;
                row[1] = vaccine.getVaccineDefinition().getVaccineName();
                row[2] = vaccine.getVaccineId();
                row[3] = vaccine.getBatchId();
                row[4] = vaccine.getVaccinePrice();
                row[5] = vaccine.getManufactureDate();
                
                defaulttabelmodel.addRow(row);
                }
            }
        }
            
        }
            
            
        }
        
   
    }
    
    
    private void refreshCartTable(){
        
          int rowCount = tblcart.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblcart.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        
        for(OrderItem oi: tempOrder.getItemList())
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        cbmanu = new javax.swing.JComboBox();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvacc = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lbl6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcart = new javax.swing.JTable();
        lbl7 = new javax.swing.JLabel();
        spvacccount = new javax.swing.JSpinner();
        btn2 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        btn3 = new javax.swing.JButton();
        lbl8 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        lbl9 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        lbl10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbordertype = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(102, 153, 255));

        lbl1.setFont(new java.awt.Font("Bitstream Charter", 1, 24)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Create Vaccine Order");

        lbl2.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        lbl2.setText("Manufacturer:");

        cbmanu.setForeground(new java.awt.Color(0, 0, 102));
        cbmanu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbmanu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmanuActionPerformed(evt);
            }
        });

        lbl3.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        lbl3.setText("Manufacturer Vaccine Catalog:");

        lbl4.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        lbl4.setText("Search Vaccine:");

        lbl5.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        lbl5.setText("Vaccine Code:");

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Search");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        tblvacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Vaccine id", "Lot Number", "Price", "manufacture date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblvacc.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblvacc);

        lbl6.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl6.setText("Cart:");

        tblcart.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblcart);

        lbl7.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl7.setText("Quantity:");

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Add to Cart");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 102));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Modify");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        lbl8.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl8.setText("Quantity:");

        btn4.setBackground(new java.awt.Color(0, 0, 102));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("Remove");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 102));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("Check Out");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        lbl9.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl9.setText("Total Amount of Order:");

        txt3.setEnabled(false);

        lbl10.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        lbl10.setText("Set Contract: ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/cart1_50x50.png"))); // NOI18N

        cbordertype.setBackground(new java.awt.Color(0, 0, 102));
        cbordertype.setForeground(new java.awt.Color(255, 255, 255));
        cbordertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AsRequired", "Monthly", "Bi-Monthly" }));
        cbordertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbordertypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spvacccount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl6)
                        .addGap(32, 32, 32)
                        .addComponent(lbl8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl9)
                        .addGap(18, 18, 18)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbmanu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(btn1)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl10)
                                .addGap(18, 18, 18)))
                        .addComponent(cbordertype, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2)
                            .addComponent(cbmanu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl3))
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl5)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7)
                    .addComponent(spvacccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3)
                    .addComponent(lbl8)
                    .addComponent(lbl9)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(btn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbordertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        int quantity = (Integer) spvacccount.getValue();

        int selectRow = tblvacc.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly select a Vaccine First!");
            return;
        }
        VaccineDetails product = (VaccineDetails) tblvacc.getValueAt(selectRow, 0);
        
        
        //condition for -ve 
        if (quantity <= 0 ) {
            JOptionPane.showMessageDialog(null, "Incorrect Quantity, Please enter it again !");
            return;
        }
  
        boolean flag = true;
        ArrayList<OrderItem> orders = tempOrder.getItemList();
        for (OrderItem oi : orders) {
            if (oi.getVaccineDetails().equals(product)) {
                int oldQuantity = oi.getQuantity();
                int newQuantity = oldQuantity + quantity;
                oi.setQuantity(newQuantity);
                flag = false;
            }
        }
     
        if(flag){
        OrderItem orderItem = tempOrder.addNewOrderItem(quantity, product);
        }
         
        isCheckout = false;
        String msg = Integer.toString(quantity) + " " + product.getVaccineDefinition().getVaccineName() + " has added to cart!";
        JOptionPane.showMessageDialog(null, msg);
  
       displayManufacturerVaccines();
        refreshCartTable();
        calulateTotalAmountOfOrder();

    }//GEN-LAST:event_btn2ActionPerformed
    
    private void calulateTotalAmountOfOrder(){
        
        if(tempOrder == null){
            return;
        }
        double totalAmount = 0;
        
        for(OrderItem oi: tempOrder.getItemList())
        {
            totalAmount = totalAmount + oi.getQuantity()*oi.getVaccineDetails().getVaccinePrice();
            
        }
        
        txt3.setText(String.valueOf(totalAmount));
        
        
    }
    
    
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        //
        int selectRow = tblcart.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly select a vaccine first from cart!");
            return;
        }

        OrderItem orderItem = (OrderItem) tblcart.getValueAt(selectRow, 1);
        int oldQuantity = orderItem.getQuantity();
        int newQuantity = Integer.parseInt(txt2.getText());
        
        
        orderItem.setQuantity(newQuantity);
        String msg = "The quantity of " + orderItem.getVaccineDetails().getVaccineDefinition().getVaccineName() + " has changed from " + oldQuantity + " to " + newQuantity;
        JOptionPane.showMessageDialog(null, msg);
        
        displayManufacturerVaccines();
        refreshCartTable();

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        int selectRow = tblcart.getSelectedRow();
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Kindly select a Vaccine First!");
            return;
        }
        OrderItem oi = (OrderItem) tblcart.getValueAt(selectRow, 1);
       
        
        tempOrder.removeOrderItem(oi);
        

        displayManufacturerVaccines();
        refreshCartTable();

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:

        if (!tempOrder.getItemList().isEmpty()) 
            {   boolean adhoc = false;
                boolean bimonth = false;
                boolean monthly = false;
                String s = (String) cbordertype.getSelectedItem();
            
            if(s.equals("AsRequired"))
            {
                adhoc = true;
                bimonth = false;
                monthly = false;
            }
            if(s.equals("Monthly"))
            {
                adhoc = false;
                bimonth = false;
                monthly = true;
            }
            if(s.equals("Bi-Monthly"))
            {
                adhoc = false;
                bimonth = true;
                monthly = false;
            }
    
              
                Order o = hospital.getOrderCatalog().addNewOrder();
                o=tempOrder;
                
                ProviderVaccineOrderWorkRequest workRequest = new ProviderVaccineOrderWorkRequest();
                workRequest.setasReq(adhoc);
                workRequest.setHalfmonthContract(bimonth);
                workRequest.setfullMonthContract(monthly);
                workRequest.setVaccineOrder(tempOrder);
                workRequest.setSender(userAccount);
                workRequest.setStatus("New Order");
                workRequest.calculateDeliveryDate(workRequest);
                workRequest.setEnterprise(hospital);
                workRequest.setClinicOrganization(clinicOrg);
                workRequest.setClinicOrder(true);
                
                for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
                {
                    if(org instanceof HospitalOrganization)
                    {
                        HospitalOrganization hosOrg = (HospitalOrganization)org;
                        hosOrg.getWorkQueue().addWorkRequest(workRequest);
                    }
                }
  
                JOptionPane.showMessageDialog(null, "Order has been successfuly added!");
            
        }
        else
        {JOptionPane.showMessageDialog(null, "Cannot checkout due to error !");
        }
        
        isCheckout = true;
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to add another order ?", "Warning", dialogButton);

        //if yes
        if (dialogResult == JOptionPane.YES_OPTION) {
            tempOrder = new Order(); 

        }
       
        displayManufacturerVaccines();
        refreshCartTable();
        
        PlaceVaccineOrderClinicJPanel panel = new PlaceVaccineOrderClinicJPanel(workContainer, hospital,clinicOrg , userAccount, business, state);
        workContainer.add("PlaceVaccineOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);        
        
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void cbmanuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmanuActionPerformed
        // TODO add your handling code here:

        displayManufacturerVaccines();
    }//GEN-LAST:event_cbmanuActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        
        String vaccineCode = txt1.getText();
        searchVaccineProducts(vaccineCode);
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void cbordertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbordertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbordertypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbmanu;
    private javax.swing.JComboBox cbordertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JSpinner spvacccount;
    private javax.swing.JTable tblcart;
    private javax.swing.JTable tblvacc;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
