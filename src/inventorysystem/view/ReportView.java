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
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Cy
 */
public class ReportView extends javax.swing.JFrame {
    private ArrayList<Report> reports = new ArrayList<>();
    private ArrayList<String> report_filter = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Inventory> inventories = new ArrayList<>();
    private ArrayList<String> report_status = new ArrayList<>();
    private Account account;
    private Company company;
    public ReportView(Account account, Company company) {
        initComponents();
        this.account = account;
        this.company = company;
        
        this.loadReportFilter();
        this.loadReportStatus();
        this.loadDatabase();
        this.fillComboBox();
        this.fillReportTable();
        this.loadProductsDatabase();
    }
    
    public JPanel getReportView(){
        return jPanelReportContainer;
    }
    
    public void loadReportFilter(){
        jComboBoxReportFilter.removeAllItems();
        
        this.report_filter.add("All");
        this.report_filter.add("Approved");
        this.report_filter.add("Pending");
        this.report_filter.add("Denied");
        
        int i = 0;
        for(String report : this.report_filter){
            jComboBoxReportFilter.insertItemAt(report, i);
            i++;
        }
        
        jComboBoxReportFilter.setSelectedIndex(0);
    }
    
    public void loadReportStatus(){
        jComboBoxEditReportStatus.removeAllItems();
        
        this.report_status.add("Approved");
        this.report_status.add("Pending");
        this.report_status.add("Denied");
        
        int i = 0;
        for(String report_stats : this.report_status){
            jComboBoxEditReportStatus.insertItemAt(report_stats, i);
            i++;
        }
        
        jComboBoxEditReportStatus.setSelectedIndex(0);
    }
    
    public void loadDatabase(){
        ReportController rc = new ReportController();
        InventoryController ic = new InventoryController();
        
        this.reports = rc.loadReportsAdmin(this.account.getAccountID(), this.company.getCompanyID());
        this.inventories = ic.getActiveInventories(this.company.getCompanyID());
    }
    
    public void loadProductsDatabase(){
        jComboBoxAddReportProducts.removeAllItems();
        int selected_index = jComboBoxAddReportInventory.getSelectedIndex();
        
        if(selected_index != -1){
            Inventory inventory = this.inventories.get(selected_index);
        
            ProductController pc = new ProductController();
            this.products = pc.loadActiveProducts(inventory.getInventoryID());
            
            if(this.products.size() <= 0){
                return;
            }

            int i = 0;
            for(Product product : this.products){
                jComboBoxAddReportProducts.insertItemAt(product.getProductName(), i);
                i++;
            }

            jComboBoxAddReportProducts.setSelectedIndex(0);
        }
        
    }
    
    public void fillComboBox(){
        jComboBoxAddReportInventory.removeAllItems();
      
        int i = 0;
        
        int inventory_size = this.inventories.size();
        if(inventory_size <= 0){
            return;
        }
        
        for(Inventory inventory : this.inventories){
            jComboBoxAddReportInventory.insertItemAt(inventory.getInventoryName(), i);
            i++;
        }
        
        jComboBoxAddReportInventory.setSelectedIndex(0);
    }
    
    public void fillReportTable(){
        DefaultTableModel model = (DefaultTableModel) jTableReport.getModel();
        model.setRowCount(0);
        
        for(Report report : this.reports){
            int report_ID = report.getReportID();
            String username = report.getUsername();
            String product_name = report.getProductName();
            Date report_date = report.getReportDate();
            int quantity = report.getQuantity();
            String status = report.getStatus();
            
            Object[] row_data = {report_ID, username, product_name, report_date, quantity, status, false};
            
            model.addRow(row_data);
        }
    }
    
    private void refresh(){
        this.loadDatabase();
        this.fillReportTable();
        this.loadProductsDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelReportContainer = new javax.swing.JPanel();
        jPanelReport = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAddReport = new javax.swing.JButton();
        jButtonApproveReport = new javax.swing.JButton();
        jButtonDenyReport = new javax.swing.JButton();
        jButtonEditReport = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReport = new javax.swing.JTable();
        jComboBoxReportFilter = new javax.swing.JComboBox<>();
        jButtonFilter = new javax.swing.JButton();
        jPanelModalAddReport = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxAddReportProducts = new javax.swing.JComboBox<>();
        jTextFieldAddReportQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxAddReportInventory = new javax.swing.JComboBox<>();
        jPanelModalEditReport = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelEditReportProductName = new javax.swing.JLabel();
        jLabelEditReportID = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBoxEditReportStatus = new javax.swing.JComboBox<>();
        jTextFieldEditQuantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelReportContainer.setBackground(new java.awt.Color(0, 204, 204));

        jPanelReport.setBackground(new java.awt.Color(0, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Reports");

        jButtonAddReport.setText("Add");
        jButtonAddReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddReportMouseClicked(evt);
            }
        });

        jButtonApproveReport.setText("Approve");
        jButtonApproveReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonApproveReportMouseClicked(evt);
            }
        });

        jButtonDenyReport.setText("Deny");
        jButtonDenyReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDenyReportMouseClicked(evt);
            }
        });

        jButtonEditReport.setText("Edit");
        jButtonEditReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditReportMouseClicked(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddReport)
                .addGap(18, 18, 18)
                .addComponent(jButtonApproveReport)
                .addGap(18, 18, 18)
                .addComponent(jButtonDenyReport)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefresh)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddReport)
                    .addComponent(jButtonApproveReport)
                    .addComponent(jButtonDenyReport)
                    .addComponent(jButtonEditReport)
                    .addComponent(jButtonRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Report ID", "Account", "Product", "Report Date", "Quantity", "Status", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableReport);
        if (jTableReport.getColumnModel().getColumnCount() > 0) {
            jTableReport.getColumnModel().getColumn(6).setMaxWidth(15);
        }

        jComboBoxReportFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonFilter.setText("Filter");
        jButtonFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFilterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelReportLayout = new javax.swing.GroupLayout(jPanelReport);
        jPanelReport.setLayout(jPanelReportLayout);
        jPanelReportLayout.setHorizontalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelReportLayout.createSequentialGroup()
                        .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanelReportLayout.createSequentialGroup()
                                .addComponent(jComboBoxReportFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonFilter)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelReportLayout.setVerticalGroup(
            jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxReportFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFilter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelReportContainerLayout = new javax.swing.GroupLayout(jPanelReportContainer);
        jPanelReportContainer.setLayout(jPanelReportContainerLayout);
        jPanelReportContainerLayout.setHorizontalGroup(
            jPanelReportContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanelReportContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelReportContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelReportContainerLayout.setVerticalGroup(
            jPanelReportContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(jPanelReportContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelReportContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanelModalAddReport.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Add Report");

        jLabel2.setText("Product Name:");

        jLabel3.setText("Q:uantity:");

        jComboBoxAddReportProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Close");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel4.setText("Inventory Name:");

        jComboBoxAddReportInventory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAddReportInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAddReportInventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelModalAddReportLayout = new javax.swing.GroupLayout(jPanelModalAddReport);
        jPanelModalAddReport.setLayout(jPanelModalAddReportLayout);
        jPanelModalAddReportLayout.setHorizontalGroup(
            jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalAddReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModalAddReportLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanelModalAddReportLayout.createSequentialGroup()
                        .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModalAddReportLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel1))
                            .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelModalAddReportLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxAddReportInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelModalAddReportLayout.createSequentialGroup()
                                    .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxAddReportProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldAddReportQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelModalAddReportLayout.setVerticalGroup(
            jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalAddReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxAddReportInventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAddReportProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAddReportQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanelModalAddReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanelModalEditReport.setBackground(new java.awt.Color(0, 204, 204));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Edit Report");

        jLabel7.setText("Report ID:");

        jLabel9.setText("Product Name:");

        jLabel10.setText("Quantity:");

        jLabel8.setText("Status:");

        jLabelEditReportProductName.setText("N/A");

        jLabelEditReportID.setText("N/A");

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

        jComboBoxEditReportStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelModalEditReportLayout = new javax.swing.GroupLayout(jPanelModalEditReport);
        jPanelModalEditReport.setLayout(jPanelModalEditReportLayout);
        jPanelModalEditReportLayout.setHorizontalGroup(
            jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalEditReportLayout.createSequentialGroup()
                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModalEditReportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanelModalEditReportLayout.createSequentialGroup()
                        .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModalEditReportLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel6))
                            .addGroup(jPanelModalEditReportLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelEditReportID)
                                    .addComponent(jLabelEditReportProductName)
                                    .addComponent(jComboBoxEditReportStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEditQuantity))))
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelModalEditReportLayout.setVerticalGroup(
            jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModalEditReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelEditReportID))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelEditReportProductName))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldEditQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxEditReportStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanelModalEditReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelModalAddReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jPanelModalEditReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(84, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelReportContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelModalAddReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jPanelModalEditReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddReportMouseClicked
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelModalAddReport);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButtonAddReportMouseClicked

    private void jComboBoxAddReportInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAddReportInventoryActionPerformed
        this.loadProductsDatabase();
    }//GEN-LAST:event_jComboBoxAddReportInventoryActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        ReportController rc = new ReportController();
        int a_ID = this.account.getAccountID();
        try{
            int selected_index = jComboBoxAddReportProducts.getSelectedIndex();
            int p_ID = this.products.get(selected_index).getProductID();

            String consumed_string = jTextFieldAddReportQuantity.getText();
            if(consumed_string.equals("")){
                System.out.println("Please enter a value greater than 0");
                return;
            }

            int consumed = Integer.parseInt(consumed_string);

            if(consumed < 0){
                System.out.println("Please enter a value greater than 0");
                return;
            }

            rc.createReport(a_ID, p_ID, consumed);
            this.refresh();

            jPanelReportContainer.removeAll();
            jPanelReportContainer.add(jPanelReport);
            jPanelReportContainer.repaint();
            jPanelReportContainer.revalidate();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Invalid Product");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButtonFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFilterMouseClicked
        ReportController rc = new ReportController();
        int selected_index = jComboBoxReportFilter.getSelectedIndex();
        String filter = this.report_filter.get(selected_index);
        
        if(filter.equals("All")){
            this.refresh();
            return;
        }
        this.reports = rc.loadReportsAdmin(this.account.getAccountID(), this.company.getCompanyID(), filter);
        
        this.fillReportTable();
    }//GEN-LAST:event_jButtonFilterMouseClicked

    private void jButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRefreshMouseClicked
        this.refresh();
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButtonRefreshMouseClicked

    private void jButtonApproveReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonApproveReportMouseClicked
        ReportController rc = new ReportController();
        DefaultTableModel model = (DefaultTableModel) jTableReport.getModel();
        int table_size = model.getRowCount();
        for(int i = 0; i < table_size; i++){
            Boolean is_checked = (Boolean) model.getValueAt(i, 6);
            String status = (String) model.getValueAt(i, 5);
            if(is_checked != null && is_checked && status.equals("Pending")){
                int report_ID = (int) model.getValueAt(i, 0);
                rc.updateReport(report_ID, "Approved");
            }
        }

        this.refresh();
    }//GEN-LAST:event_jButtonApproveReportMouseClicked

    private void jButtonDenyReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDenyReportMouseClicked
        ReportController rc = new ReportController();
        DefaultTableModel model = (DefaultTableModel) jTableReport.getModel();
        int table_size = model.getRowCount();
        for(int i = 0; i < table_size; i++){
            Boolean is_checked = (Boolean) model.getValueAt(i, 6);
            String status = (String) model.getValueAt(i, 5);
            if(is_checked != null && is_checked && status.equals("Pending")){
                int report_ID = (int) model.getValueAt(i, 0);
                rc.updateReport(report_ID, "Denied");
            }
        }

        this.refresh();
    }//GEN-LAST:event_jButtonDenyReportMouseClicked

    private void jButtonEditReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditReportMouseClicked
        ReportController rc = new ReportController();
        DefaultTableModel model = (DefaultTableModel) jTableReport.getModel();
        int table_size = model.getRowCount();
        for(int i = 0; i < table_size; i++){
            Boolean is_checked = (Boolean) model.getValueAt(i, 6);
            if(is_checked != null && is_checked){
                int report_ID = (int) model.getValueAt(i, 0);
                String product_name = (String) model.getValueAt(i, 2);
                int quantity = (int) model.getValueAt(i, 4);
                String status = (String) model.getValueAt(i, 5);
                
                jComboBoxEditReportStatus.setSelectedItem(status);
                jLabelEditReportID.setText(Integer.toString(report_ID));
                jLabelEditReportProductName.setText(product_name);
                jTextFieldEditQuantity.setText(Integer.toString(quantity));
                
                jPanelReportContainer.removeAll();
                jPanelReportContainer.add(jPanelModalEditReport);
                jPanelReportContainer.repaint();
                jPanelReportContainer.revalidate();
            }
        }
    }//GEN-LAST:event_jButtonEditReportMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.refresh();
        
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        ReportController rc = new ReportController();
        String status = (String) jComboBoxEditReportStatus.getSelectedItem();
        
        String quantity_string = jTextFieldEditQuantity.getText();
        
        if(quantity_string.equals("")){
            System.out.println("Quantity must be greater than 0");
            return;
        }
        
        int quantity = Integer.parseInt(quantity_string);
        
        if(quantity <= 0){
            System.out.println("Quantity must be greater than 0");
            return;
        }
        
        int report_ID = Integer.parseInt(jLabelEditReportID.getText());
        
        rc.updateReport(report_ID, status, quantity);
        
        this.refresh();
        
        jPanelReportContainer.removeAll();
        jPanelReportContainer.add(jPanelReport);
        jPanelReportContainer.repaint();
        jPanelReportContainer.revalidate();
    }//GEN-LAST:event_jButton4MouseClicked

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
//            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReportView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReportView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAddReport;
    private javax.swing.JButton jButtonApproveReport;
    private javax.swing.JButton jButtonDenyReport;
    private javax.swing.JButton jButtonEditReport;
    private javax.swing.JButton jButtonFilter;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JComboBox<String> jComboBoxAddReportInventory;
    private javax.swing.JComboBox<String> jComboBoxAddReportProducts;
    private javax.swing.JComboBox<String> jComboBoxEditReportStatus;
    private javax.swing.JComboBox<String> jComboBoxReportFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEditReportID;
    private javax.swing.JLabel jLabelEditReportProductName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelModalAddReport;
    private javax.swing.JPanel jPanelModalEditReport;
    private javax.swing.JPanel jPanelReport;
    private javax.swing.JPanel jPanelReportContainer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReport;
    private javax.swing.JTextField jTextFieldAddReportQuantity;
    private javax.swing.JTextField jTextFieldEditQuantity;
    // End of variables declaration//GEN-END:variables
}
