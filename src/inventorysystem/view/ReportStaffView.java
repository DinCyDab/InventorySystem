/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorysystem.view;

import inventorysystem.controller.*;
import inventorysystem.model.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ReportStaffView extends javax.swing.JFrame {
    private ArrayList<Report> reports = new ArrayList<>();
    private ArrayList<String> report_filter = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Inventory> inventories = new ArrayList<>();
    private ArrayList<String> report_status = new ArrayList<>();
    private Account account;
    private Company company;
    
    public ReportStaffView(Account account, Company company) {
        initComponents();
        
        this.account = account;
        this.company = company;
        
        this.loadReportFilter();
        this.loadInventory();
        this.loadProducts();
        this.loadReports();
    }
    
    public JPanel getPanelReport(){
        return jPanelReportContainer;
    }
    
    private void loadInventory(){
        jComboBoxInventoryName.removeAllItems();
        
        this.fetchInventory();
        
        for(Inventory inventory : this.inventories){
            jComboBoxInventoryName.addItem(inventory.getInventoryName());
        }
        
//        jComboBoxInventoryName.setSelectedIndex(0);
    }
    
    private void loadProducts(){
        jComboBoxProductName.removeAllItems();
        this.fetchProducts();
        
        for(Product p : this.products){
            jComboBoxProductName.addItem(p.getProductName());
        }
        
//        jComboBoxProductName.setSelectedIndex(0);
    }
    
    private void loadReports(){
        DefaultTableModel model = (DefaultTableModel) jTableReport.getModel();
        model.setRowCount(0);
        
        int selected_index = jComboBoxReportFilter.getSelectedIndex();
        
        if(selected_index > 0){
            String filter_name = this.report_filter.get(selected_index);
            this.fetchReports(filter_name);
        }
        else{
            this.fetchReports();
        }
        
        for(Report r : this.reports){
            int report_ID = r.getReportID();
            String product_name = r.getProductName();
            Date report_date = r.getReportDate();
            int quantity = r.getQuantity();
            String status = r.getStatus();
            
            Object[] obj = {report_ID, product_name, report_date, quantity, status, false};
            
            model.addRow(obj);
        }
    }
    
    private void fetchReports(){
        ReportController rc = new ReportController();
        int account_ID = this.account.getAccountID();
        rc.loadReportsStaff(account_ID);
        this.reports = rc.getReports();
    }
    
    private void fetchReports(String filter_report){
        ReportController rc = new ReportController();
        int account_ID = this.account.getAccountID();
        rc.loadReportsStaff(account_ID, filter_report);
        this.reports = rc.getReports();
    }
    
    private void fetchInventory(){
        InventoryController ic = new InventoryController(this.company.getCompanyID());
        this.inventories = ic.getInventory();
    }
    
    private void fetchProducts(){
        int inventory_ID = -1;
        if(jComboBoxInventoryName.getSelectedIndex() >= 0){
            inventory_ID = this.inventories.get(jComboBoxInventoryName.getSelectedIndex()).getInventoryID();
        }
        ProductController pc = new ProductController(inventory_ID);
        this.products = pc.getProducts();
    }
    
    private void loadReportFilter(){
        jComboBoxReportFilter.removeAllItems();
        
        this.report_filter.add("All");
        this.report_filter.add("Approved");
        this.report_filter.add("Pending");
        this.report_filter.add("Denied");
        
        for(String report_fil : this.report_filter){
            jComboBoxReportFilter.addItem(report_fil);
        }
        
        jComboBoxReportFilter.setSelectedIndex(0);
    }
    
    private void refresh(){
        this.loadInventory();
        this.loadProducts();
        this.loadReports();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelReportContainer = new javax.swing.JPanel();
        jPanelReport = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxReportFilter = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReport = new javax.swing.JTable();
        jPanelHeader = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jPanelAddReport = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxInventoryName = new javax.swing.JComboBox<>();
        jComboBoxProductName = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAddQuantity = new javax.swing.JTextField();
        jPanelEditReport = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldQuantityEdit = new javax.swing.JTextField();
        jLabelProductNameEdit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelReportID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelReportContainer.setBackground(new java.awt.Color(0, 204, 204));

        jPanelReport.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Reports");

        jComboBoxReportFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxReportFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxReportFilterActionPerformed(evt);
            }
        });

        jTableReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Report ID", "Product", "Report Date", "Quantity", "Status", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableReport);

        javax.swing.GroupLayout jPanelReportLayout = new javax.swing.GroupLayout(jPanelReport);
        jPanelReport.setLayout(jPanelReportLayout);
        jPanelReportLayout.setHorizontalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(jPanelReportLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxReportFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelReportLayout.setVerticalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportLayout.createSequentialGroup()
                .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxReportFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelHeader.setBackground(new java.awt.Color(0, 102, 102));

        jButtonAdd.setText("Add");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditMouseClicked(evt);
            }
        });

        jButtonRemove.setText("Remove");
        jButtonRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRemoveMouseClicked(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdd)
                .addGap(18, 18, 18)
                .addComponent(jButtonEdit)
                .addGap(18, 18, 18)
                .addComponent(jButtonRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefresh)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonRemove)
                    .addComponent(jButtonRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelReportContainerLayout = new javax.swing.GroupLayout(jPanelReportContainer);
        jPanelReportContainer.setLayout(jPanelReportContainerLayout);
        jPanelReportContainerLayout.setHorizontalGroup(
            jPanelReportContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelReportContainerLayout.setVerticalGroup(
            jPanelReportContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAddReport.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Report");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventory Name:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name:");

        jComboBoxInventoryName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxInventoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInventoryNameActionPerformed(evt);
            }
        });

        jComboBoxProductName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Close");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");

        javax.swing.GroupLayout jPanelAddReportLayout = new javax.swing.GroupLayout(jPanelAddReport);
        jPanelAddReport.setLayout(jPanelAddReportLayout);
        jPanelAddReportLayout.setHorizontalGroup(
            jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddReportLayout.createSequentialGroup()
                .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddReportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanelAddReportLayout.createSequentialGroup()
                        .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddReportLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1))
                            .addGroup(jPanelAddReportLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxProductName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxInventoryName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAddQuantity))))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelAddReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAddReportLayout.setVerticalGroup(
            jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxInventoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAddQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanelAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanelEditReport.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edit Report");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Name:");

        jButton3.setText("Close");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Edit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity:");

        jLabelProductNameEdit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductNameEdit.setText("N/A");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Report ID:");

        jLabelReportID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReportID.setText("N/A");

        javax.swing.GroupLayout jPanelEditReportLayout = new javax.swing.GroupLayout(jPanelEditReport);
        jPanelEditReport.setLayout(jPanelEditReportLayout);
        jPanelEditReportLayout.setHorizontalGroup(
            jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditReportLayout.createSequentialGroup()
                .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditReportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanelEditReportLayout.createSequentialGroup()
                        .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditReportLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel6))
                            .addGroup(jPanelEditReportLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanelEditReportLayout.createSequentialGroup()
                                        .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelReportID)
                                            .addComponent(jTextFieldQuantityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelProductNameEdit))))))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEditReportLayout.setVerticalGroup(
            jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelReportID))
                .addGap(14, 14, 14)
                .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelProductNameEdit))
                .addGap(18, 18, 18)
                .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldQuantityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanelEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelReportContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelAddReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanelEditReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelReportContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelAddReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanelEditReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelAddReport);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jComboBoxInventoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInventoryNameActionPerformed
        this.loadProducts();
    }//GEN-LAST:event_jComboBoxInventoryNameActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.add(jPanelHeader);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        ReportController rc = new ReportController();
        int product_ID;
        int account_ID = this.account.getAccountID();
        
        if(jComboBoxProductName.getSelectedIndex() >= 0){
            product_ID = this.products.get(jComboBoxProductName.getSelectedIndex()).getProductID();
        }
        else{
            return;
        }
        
        int consumed = Integer.parseInt(jTextFieldAddQuantity.getText());
        rc.createReport(account_ID, product_ID, consumed);
        
        this.refresh();
        
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.add(jPanelHeader);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRefreshMouseClicked
        this.refresh();
    }//GEN-LAST:event_jButtonRefreshMouseClicked

    private void jComboBoxReportFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxReportFilterActionPerformed
        this.loadReports();
    }//GEN-LAST:event_jComboBoxReportFilterActionPerformed

    private void jButtonRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRemoveMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableReport.getModel();
        ReportController rc = new ReportController();
        
        int table_size = model.getRowCount();
        
        for(int i = 0; i < table_size; i++){
            Boolean is_check = (Boolean) model.getValueAt(i, 5);
            String status = (String) model.getValueAt(i, 4);
            if(is_check != null && is_check){
                if(status.equals("Pending")){
                    int report_ID = (int) model.getValueAt(i, 0);
                    rc.removeReport(report_ID);
                }
            }
        }
        
        this.refresh();
    }//GEN-LAST:event_jButtonRemoveMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.add(jPanelHeader);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        ReportController rc = new ReportController();
        int report_ID = Integer.parseInt(jLabelReportID.getText());
        int quantity = Integer.parseInt(jTextFieldQuantityEdit.getText());
        
        rc.updateReport(report_ID, quantity);
        
        this.refresh();
        
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.add(jPanelHeader);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditMouseClicked
        DefaultTableModel model = (DefaultTableModel) jTableReport.getModel();
        int table_size = model.getRowCount();
        
        for(int i = 0; i < table_size; i++){
            Boolean is_check = (Boolean) model.getValueAt(i, 5);
            if(is_check != null && is_check){
                String status = (String) model.getValueAt(i, 4);
                if(!status.equals("Pending")){
                    continue;
                }
                
                String product_name = (String) model.getValueAt(i, 1);
                int quantity = (int) model.getValueAt(i, 3);
                int report_ID = (int) model.getValueAt(i, 0);
                
                jLabelProductNameEdit.setText(product_name);
                jTextFieldQuantityEdit.setText(Integer.toString(quantity));
                jLabelReportID.setText(Integer.toString(report_ID));
                
                jPanelReportContainer.removeAll();
                jPanelReportContainer.add(jPanelEditReport);
                jPanelReportContainer.repaint();
                jPanelReportContainer.revalidate();
            }
        }
    }//GEN-LAST:event_jButtonEditMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new ReportStaffView().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JComboBox<String> jComboBoxInventoryName;
    private javax.swing.JComboBox<String> jComboBoxProductName;
    private javax.swing.JComboBox<String> jComboBoxReportFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelProductNameEdit;
    private javax.swing.JLabel jLabelReportID;
    private javax.swing.JPanel jPanelAddReport;
    private javax.swing.JPanel jPanelEditReport;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelReport;
    private javax.swing.JPanel jPanelReportContainer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReport;
    private javax.swing.JTextField jTextFieldAddQuantity;
    private javax.swing.JTextField jTextFieldQuantityEdit;
    // End of variables declaration//GEN-END:variables
}
