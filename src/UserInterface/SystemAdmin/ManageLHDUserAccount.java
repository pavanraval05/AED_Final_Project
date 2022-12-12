/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LocalHealthDepartment;
import Business.NationalEnterprise.Manufacturer;
import Business.Network.CityNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.Person.EnterpriseAdminPerson;
import Business.Role.EnterpriseAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samruddhamohire
 */
public class ManageLHDUserAccount extends javax.swing.JPanel {

    /**
     * Creates new form ManagePublicHealthDepartmentUserAccountJPanel
     */
    private JPanel workContainer;
    private EcoSystem business;
    
    public ManageLHDUserAccount(JPanel workContainer, EcoSystem business) {
        initComponents();
         this.workContainer = workContainer;
        this.business = business;
        populateTable();
        cbdeptlist.removeAllItems();
        populateJComboBox();
        
    }
    
    private void populateTable(){
        int rowCount = tbladmin.getRowCount();
         DefaultTableModel defaulttabelmodel = (DefaultTableModel)tbladmin.getModel();
        
        //delete rows
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        for(StateNetwork state : business.getStateList())
        {
            
            
        for(UserAccount ua : state.getLocalHealthDepartment().getUserAccountDirectory().getUserAccountList()){
            {
            if(ua.getRole() instanceof EnterpriseAdminRole){
                Object[] row = new Object[4];
                row[0]=ua;
                row[1]=ua.getPassword();
                row[2]=String.valueOf(ua.getPerson().getFirstName()+ " "+ ua.getPerson().getLastName());
                row[3]=state;
            
            defaulttabelmodel.addRow(row);
            
                
            }
            
            }
        }
        }
    }
    
    private void populateJComboBox(){
        cbdeptlist.removeAllItems();
        for(StateNetwork state : business.getStateList())
        {
            cbdeptlist.addItem(state);
        }
       
    }
    
    private boolean checkIfUserAccountExists(String username){
        
        boolean flag= false;
        
        flag = business.getUserAccountDirectory().checkIfUserAccountExists(username );
        
        if (flag == false) {
          

            flag = business.getCdc().getUserAccountDirectory().checkIfUserAccountExists(username);
            if(flag == false)
            { for(Organization org: business.getCdc().getOrganizationDirectory().getOrganizationList())
            {
                flag = org.getUserAccountDirectory().checkIfUserAccountExists(username);
                if(flag == true)
                break;
            }
            
            }
            
        }
        if (flag == false) {
            
            for(Manufacturer manufacturer : business.getManufacturerDirectory().getManufacturerDirectory())
            { 
                flag = manufacturer.getUserAccountDirectory().checkIfUserAccountExists(username);
                
                if(flag == false)
                {
                    for(Organization org: manufacturer.getOrganizationDirectory().getOrganizationList())
                {
                    flag = org.getUserAccountDirectory().checkIfUserAccountExists(username);
                    if(flag == true)
                        break;
                }
                }
                if(flag == true)
                { 
                    break;
                }
            }
            
                
            
        }if (flag == false) {
          

            flag = business.getDistributor().getUserAccountDirectory().checkIfUserAccountExists(username);
            if(flag == false)
            { for(Organization org: business.getDistributor().getOrganizationDirectory().getOrganizationList())
            { flag = org.getUserAccountDirectory().checkIfUserAccountExists(username);
                if(flag == true)
                {
                    
                    break;
                }
            }
            }
            

        }if (flag == false) {
              
            for (StateNetwork state : business.getStateList()) {
                if(flag == false)
                { flag = state.getLocalHealthDepartment().getUserAccountDirectory().checkIfUserAccountExists(username);
                if(flag == false)
                {for(Organization org: state.getLocalHealthDepartment().getOrganizationDirectory().getOrganizationList())
                {flag = org.getUserAccountDirectory().checkIfUserAccountExists(username);
                    if(flag == true)
                    {   
                        break;
                    }
                }
                }
                
                if (flag == false) {
                           

                    for (CityNetwork city : state.getCityList()) {
                        for (Enterprise hospital : city.getEnterpriseDirectory().getEnterpriseDirectory()) {
                            flag = hospital.getUserAccountDirectory().checkIfUserAccountExists(username);
                            if (flag == false) {
                                for (Organization o : hospital.getOrganizationDirectory().getOrganizationList()) {
                                    flag = o.getUserAccountDirectory().checkIfUserAccountExists(username);

                                    if (flag == true) {
                                        
                                        break;

                                    }
                                }
                            }
                            else
                            {   
                              
                                
                                break;
                            }
                          
                    if(flag == true)
                    {
                        break;
                    }
                            

                        }
                        if(flag == true)
                {
                    break;
                }
                    }

                } 
                else {
                    
                    break;
                }

            }
        }
        }
    
        
        return flag;
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbladmin = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        btnremove = new javax.swing.JButton();
        btncreate = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbdeptlist = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("First Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Local Health Department Admin");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Last Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("UserName:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("List of Admins:");

        tbladmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Person", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbladmin.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbladmin);
        if (tbladmin.getColumnModel().getColumnCount() > 0) {
            tbladmin.getColumnModel().getColumn(0).setResizable(false);
            tbladmin.getColumnModel().getColumn(1).setResizable(false);
            tbladmin.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Password:");

        btnremove.setBackground(new java.awt.Color(0, 0, 102));
        btnremove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("Remove Admin");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btncreate.setBackground(new java.awt.Color(0, 0, 102));
        btncreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncreate.setForeground(new java.awt.Color(255, 255, 255));
        btncreate.setText("Create Admin");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Local Health Department:");

        cbdeptlist.setForeground(new java.awt.Color(0, 0, 102));
        cbdeptlist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/order1_200x200.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnremove))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnback)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbdeptlist, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnremove)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbdeptlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btncreate)
                        .addGap(11, 11, 11)
                        .addComponent(btnback))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        // TODO add your handling code here:
        int row = tbladmin.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select an Admin from table");
            return;
        }

        UserAccount ua = (UserAccount)tbladmin.getValueAt(row, 0);
        StateNetwork state = (StateNetwork)tbladmin.getValueAt(row, 3);
        state.getLocalHealthDepartment().getUserAccountDirectory().removeUserAccount(ua);
        populateTable();

    }//GEN-LAST:event_btnremoveActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        
        StateNetwork state = (StateNetwork)cbdeptlist.getSelectedItem();
         String firstName = txtfname.getText();
        if(firstName.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter First Name!");
            return;
        }
        String lastName = txtlname.getText();
        if(lastName.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Last Name!");
            return;
        }
        String username = txtuname.getText();
        if(username.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Username!");
            return;
        }
        String password = txtpass.getText();
        if(password.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Password!");
            return;
        }
        
        boolean flag = checkIfUserAccountExists(username);
        if(flag == true)
        {
            JOptionPane.showMessageDialog(null, "Username exists, please choose a different username!");
            return;
            
        }

        EnterpriseAdminPerson admin = (EnterpriseAdminPerson) state.getLocalHealthDepartment().getPersonDirectory().createPerson(firstName, lastName, Role.RoleType.EnterpriseAdmin);

        state.getLocalHealthDepartment().getUserAccountDirectory().createUserAccount(username, password, admin, new EnterpriseAdminRole());

        populateTable();

    }//GEN-LAST:event_btncreateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnremove;
    private javax.swing.JComboBox cbdeptlist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbladmin;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
