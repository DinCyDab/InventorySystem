/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorysystem.view;

import inventorysystem.model.*;
import inventorysystem.controller.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cy
 */
public class InventoryView extends javax.swing.JFrame {
    private Account account;
    private Company company;
    private ArrayList<Inventory> inventories;
    /**
     * Creates new form InventoryView
     */
    public InventoryView(Account account, Company company) {
        initComponents();
        this.account = account;
        this.company = company;
        this.loadDatabase();
    }
    
    public JPanel getInventoryView(){
        return jPanelInventoryContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelModalAddInventory = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextFieldInventoryName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaInventoryDescription = new javax.swing.JTextArea();
        jPanelModalEditInventory = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jTextFieldEditInventoryName = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaEditInventoryDescription = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabelEditInventoryID = new javax.swing.JLabel();
        jPanelInventoryContainer = new javax.swing.JPanel();
        jPanelInventory = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonRefreshInventory = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInventory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelModalAddInventory.setBackground(new java.awt.Color(0, 102, 102));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add Inventory");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Inventory Name:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Inventory Description:");

        jButton8.setText("Add");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Close");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jTextAreaInventoryDescription.setColumns(20);
        jTextAreaInventoryDescription.setRows(5);
        jScrollPane3.setViewportView(jTextAreaInventoryDescription);

        javax.swing.GroupLayout jPanelModalAddInventoryLayout = new javax.swing.GroupLayout(jPanelModalAddInventory);
        jPanelModalAddInventory.setLayout(jPanelModalAddInventoryLayout);
        jPanelModalAddInventoryLayout.setHorizontalGroup(
            jPanelModalAddInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalAddInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModalAddInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModalAddInventoryLayout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(jPanelModalAddInventoryLayout.createSequentialGroup()
                        .addGroup(jPanelModalAddInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelModalAddInventoryLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(47, 47, 47)
                                .addComponent(jTextFieldInventoryName))
                            .addGroup(jPanelModalAddInventoryLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelModalAddInventoryLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelModalAddInventoryLayout.setVerticalGroup(
            jPanelModalAddInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalAddInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModalAddInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldInventoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalAddInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanelModalAddInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(7, 7, 7))
        );

        jPanelModalEditInventory.setBackground(new java.awt.Color(0, 102, 102));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Edit Inventory");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Inventory Name:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Inventory Description:");

        jButtonSave.setText("Save");
        jButtonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveMouseClicked(evt);
            }
        });

        jButtonClose.setText("Close");
        jButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCloseMouseClicked(evt);
            }
        });

        jTextAreaEditInventoryDescription.setColumns(20);
        jTextAreaEditInventoryDescription.setRows(5);
        jScrollPane4.setViewportView(jTextAreaEditInventoryDescription);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Inventory ID:");

        jLabelEditInventoryID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEditInventoryID.setText("0");

        javax.swing.GroupLayout jPanelModalEditInventoryLayout = new javax.swing.GroupLayout(jPanelModalEditInventory);
        jPanelModalEditInventory.setLayout(jPanelModalEditInventoryLayout);
        jPanelModalEditInventoryLayout.setHorizontalGroup(
            jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalEditInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModalEditInventoryLayout.createSequentialGroup()
                        .addComponent(jButtonClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSave))
                    .addGroup(jPanelModalEditInventoryLayout.createSequentialGroup()
                        .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelModalEditInventoryLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelModalEditInventoryLayout.createSequentialGroup()
                                .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addGap(47, 47, 47)
                                .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditInventoryID)
                                    .addComponent(jTextFieldEditInventoryName))))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelModalEditInventoryLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelModalEditInventoryLayout.setVerticalGroup(
            jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalEditInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(2, 2, 2)
                .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabelEditInventoryID))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldEditInventoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanelModalEditInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonClose))
                .addGap(7, 7, 7))
        );

        jPanelInventoryContainer.setBackground(new java.awt.Color(0, 204, 204));

        jPanelInventory.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inventory");

        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Set as Inactive");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButtonRefreshInventory.setText("Refresh");
        jButtonRefreshInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRefreshInventoryMouseClicked(evt);
            }
        });

        jButton10.setText("Set as Active");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("Edit");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jButtonRefreshInventory)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButtonRefreshInventory)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Description", "Status", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableInventory);

        javax.swing.GroupLayout jPanelInventoryLayout = new javax.swing.GroupLayout(jPanelInventory);
        jPanelInventory.setLayout(jPanelInventoryLayout);
        jPanelInventoryLayout.setHorizontalGroup(
            jPanelInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelInventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelInventoryLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelInventoryLayout.setVerticalGroup(
            jPanelInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInventoryLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelInventoryContainerLayout = new javax.swing.GroupLayout(jPanelInventoryContainer);
        jPanelInventoryContainer.setLayout(jPanelInventoryContainerLayout);
        jPanelInventoryContainerLayout.setHorizontalGroup(
            jPanelInventoryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanelInventoryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInventoryContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelInventoryContainerLayout.setVerticalGroup(
            jPanelInventoryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanelInventoryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInventoryContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jPanelModalAddInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInventoryContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jPanelModalEditInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jPanelModalAddInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInventoryContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jPanelModalEditInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jPanelInventoryContainer.removeAll();
        jPanelInventoryContainer.add(jPanelModalAddInventory);
        jPanelInventoryContainer.repaint();
        jPanelInventoryContainer.revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableInventory.getModel();
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        int rowCount = model.getRowCount();

        for(int i = 0; i < rowCount; i++){
            Boolean isCheck = (Boolean) model.getValueAt(i, 4);
            if(isCheck != null && isCheck){
                int inventory_ID = (int) model.getValueAt(i, 0);
                ic.updateInventory(inventory_ID, "Inactive");
            }
        }
        this.refresh();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButtonRefreshInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRefreshInventoryMouseClicked
        this.refresh();
    }//GEN-LAST:event_jButtonRefreshInventoryMouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableInventory.getModel();
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        int rowCount = model.getRowCount();

        for(int i = 0; i < rowCount; i++){
            Boolean isCheck = (Boolean) model.getValueAt(i, 4);
            if(isCheck != null && isCheck){
                int inventory_ID = (int) model.getValueAt(i, 0);
                ic.updateInventory(inventory_ID, "Active");
            }
        }
        this.refresh();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableInventory.getModel();
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        int rowCount = model.getRowCount();

        for(int i = 0; i < rowCount; i++){
            Boolean isCheck = (Boolean) model.getValueAt(i, 4);
            if(isCheck != null && isCheck){
                int inventory_ID = (int) model.getValueAt(i, 0);
                String inventory_name = (String) model.getValueAt(i, 1);
                String description = (String) model.getValueAt(i, 2);

                jLabelEditInventoryID.setText(String.valueOf(inventory_ID));
                jTextFieldEditInventoryName.setText(inventory_name);
                jTextAreaEditInventoryDescription.setText(description);

                jPanelInventoryContainer.removeAll();
                jPanelInventoryContainer.add(jPanelModalEditInventory);
                jPanelInventoryContainer.repaint();
                jPanelInventoryContainer.revalidate();
            }
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        String name = jTextFieldInventoryName.getText();
        String description = jTextAreaInventoryDescription.getText();
        
        if(name.equals("")){
            System.out.println("Inventory Name must not be empty");
            return;
        }

        ic.createInventory(this.company.getCompanyID(), name, description);

        this.refresh();
        
        jPanelInventoryContainer.removeAll();
        jPanelInventoryContainer.add(jPanelInventory);
        jPanelInventoryContainer.repaint();
        jPanelInventoryContainer.revalidate();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        jPanelInventoryContainer.removeAll();
        jPanelInventoryContainer.add(jPanelInventory);
        jPanelInventoryContainer.repaint();
        jPanelInventoryContainer.revalidate();
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButtonSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveMouseClicked
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        int inventory_ID = Integer.parseInt(jLabelEditInventoryID.getText());
        String name = jTextFieldEditInventoryName.getText();
        String description = jTextAreaEditInventoryDescription.getText();
        
        if(name.equals("")){
            System.out.println("Inventory Name must not be empty");
            return;
        }

        ic.updateInventory(inventory_ID, name, description);
        this.refresh();

        jPanelInventoryContainer.removeAll();
        jPanelInventoryContainer.add(jPanelInventory);
        jPanelInventoryContainer.repaint();
        jPanelInventoryContainer.revalidate();
    }//GEN-LAST:event_jButtonSaveMouseClicked

    private void jButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCloseMouseClicked
        jPanelInventoryContainer.removeAll();
        jPanelInventoryContainer.add(jPanelInventory);
        jPanelInventoryContainer.repaint();
        jPanelInventoryContainer.revalidate();

        this.refresh();
    }//GEN-LAST:event_jButtonCloseMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InventoryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InventoryView().setVisible(true);
//            }
//        });
//    }
    
    private void loadDatabase(){
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        this.inventories = ic.getInventory();
        this.refresh();
    }
    
    private void refresh(){
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        this.inventories = ic.getInventory();
        DefaultTableModel model = (DefaultTableModel) jTableInventory.getModel();
        
        model.setRowCount(0);
        
        for(Inventory inventory : this.inventories){
            int i_ID = inventory.getInventoryID();
            String name = inventory.getInventoryName();
            String description = inventory.getInventoryDescription();
            String status = inventory.getStatus();
            
            Object[] row_data = {i_ID, name, description, status, false};
            
            model.addRow(row_data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonRefreshInventory;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEditInventoryID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInventory;
    private javax.swing.JPanel jPanelInventoryContainer;
    private javax.swing.JPanel jPanelModalAddInventory;
    private javax.swing.JPanel jPanelModalEditInventory;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableInventory;
    private javax.swing.JTextArea jTextAreaEditInventoryDescription;
    private javax.swing.JTextArea jTextAreaInventoryDescription;
    private javax.swing.JTextField jTextFieldEditInventoryName;
    private javax.swing.JTextField jTextFieldInventoryName;
    // End of variables declaration//GEN-END:variables
}
