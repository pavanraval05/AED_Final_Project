/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Network.StateNetwork;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samruddhamohire
 */
public class ManageStateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStateJPanel
     */
    private JPanel workContainer;
    private EcoSystem business;
    
    public ManageStateJPanel(JPanel workContainer, EcoSystem business ) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        populateTable();
        cbaddedstatelist.removeAllItems();
        populateStateComboBox();
        
    }
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblstatelist.getModel();
        model.setRowCount(0);
        
        for(StateNetwork network : business.getStateList())
        {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
        }
        
    }
    
    private void populateStateComboBox(){
        

        cbaddedstatelist.addItem("California");
        cbaddedstatelist.addItem("Colorado");
        cbaddedstatelist.addItem("Illinois");
        cbaddedstatelist.addItem("Maine");
        cbaddedstatelist.addItem("Maryland"); 
        cbaddedstatelist.addItem("Massachusetts");
        cbaddedstatelist.addItem("New Jersey");        
        cbaddedstatelist.addItem("New York");     
        cbaddedstatelist.addItem("Texas");
      
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
        tblstatelist = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbaddedstatelist = new javax.swing.JComboBox();
        btnadd = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage States");

        tblstatelist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblstatelist.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblstatelist);
        if (tblstatelist.getColumnModel().getColumnCount() > 0) {
            tblstatelist.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("State Name:");

        cbaddedstatelist.setForeground(new java.awt.Color(0, 0, 102));
        cbaddedstatelist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnadd.setBackground(new java.awt.Color(0, 0, 102));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add State");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnremove.setBackground(new java.awt.Color(0, 0, 102));
        btnremove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/state2.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbaddedstatelist, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnadd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnremove)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbaddedstatelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnback))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        
        //check if the state exists
        for(StateNetwork s: business.getStateList())
        {
            if(s.getStateName().equalsIgnoreCase(String.valueOf(cbaddedstatelist.getSelectedItem())))
            {
                JOptionPane.showMessageDialog(null, "State exists!");
            return;
            }
        }
        
        StateNetwork state = business.addNewState(String.valueOf(cbaddedstatelist.getSelectedItem()));
       
        state.getLocalHealthDepartment().setName(state.getStateName());
        state.setStatePopulation(0);
        state.setVaccinesLeftForState(state.getStatePopulation());
        populateTable();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        // TODO add your handling code here:
        int row = tblstatelist.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a State from table");
            return;
        }
        
        StateNetwork state = (StateNetwork)tblstatelist.getValueAt(row, 0);
        business.removeState(state);
        populateTable();
    }//GEN-LAST:event_btnremoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnremove;
    private javax.swing.JComboBox cbaddedstatelist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblstatelist;
    // End of variables declaration//GEN-END:variables
}
