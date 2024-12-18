/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorysystem.view;

import inventorysystem.controller.*;
import inventorysystem.model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

public class DashboardView extends javax.swing.JFrame {
    public static Account account;
    public static Company company;
    public ArrayList<Inventory> inventories;
    public ArrayList<Inventory> active_inventories;
    public DashboardView() {
        initComponents();
        updateClock();
        
        
        
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();
    }
    
    private void updateClock() {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedNow = now.format(formatter);
        jLabelHour.setText(formattedNow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNavigation = new javax.swing.JPanel();
        jButtonDashboard = new javax.swing.JButton();
        jButtonInventory = new javax.swing.JButton();
        jButtonProducts = new javax.swing.JButton();
        jButtonAccounts = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jButtonReports = new javax.swing.JButton();
        jPanelContent = new javax.swing.JPanel();
        jPanelDashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelAccountFirstName = new javax.swing.JLabel();
        jPanelClockContainer = new javax.swing.JPanel();
        jLabelHour = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabelSettingsUsername = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabelSettingsAccountID = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabelSettingsAccessLevel = new javax.swing.JLabel();
        jTextFieldSettingsFirstName = new javax.swing.JTextField();
        jTextFieldSettingsEmail = new javax.swing.JTextField();
        jTextFieldSettingsCurrentPassword = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabelSettingsCompanyName = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldSettingsLastName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldSettingsNewPassword = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextFieldSettingsConfirmPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelNavigation.setBackground(new java.awt.Color(0, 102, 102));

        jButtonDashboard.setText("Dashboard");
        jButtonDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDashboardMouseClicked(evt);
            }
        });

        jButtonInventory.setText("Inventory");
        jButtonInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInventoryMouseClicked(evt);
            }
        });

        jButtonProducts.setText("Products");
        jButtonProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProductsMouseClicked(evt);
            }
        });
        jButtonProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductsActionPerformed(evt);
            }
        });

        jButtonAccounts.setText("Accounts");
        jButtonAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAccountsMouseClicked(evt);
            }
        });

        jButtonLogout.setText("Logout");
        jButtonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogoutMouseClicked(evt);
            }
        });

        jButtonSettings.setText("Settings");
        jButtonSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSettingsMouseClicked(evt);
            }
        });

        jButtonReports.setText("Reports");
        jButtonReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReportsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelNavigationLayout = new javax.swing.GroupLayout(jPanelNavigation);
        jPanelNavigation.setLayout(jPanelNavigationLayout);
        jPanelNavigationLayout.setHorizontalGroup(
            jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNavigationLayout.createSequentialGroup()
                        .addGroup(jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelNavigationLayout.setVerticalGroup(
            jPanelNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavigationLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButtonDashboard)
                .addGap(18, 18, 18)
                .addComponent(jButtonInventory)
                .addGap(18, 18, 18)
                .addComponent(jButtonProducts)
                .addGap(18, 18, 18)
                .addComponent(jButtonAccounts)
                .addGap(18, 18, 18)
                .addComponent(jButtonReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jButtonSettings)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogout)
                .addGap(16, 16, 16))
        );

        jPanelContent.setBackground(new java.awt.Color(0, 204, 204));

        jPanelDashboard.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        jLabelAccountFirstName.setText("Welcome Back <name>!");

        jPanelClockContainer.setBackground(new java.awt.Color(0, 102, 102));

        jLabelHour.setFont(new java.awt.Font("Zelda Oracles", 1, 24)); // NOI18N
        jLabelHour.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHour.setText("HH:MM:SS");

        javax.swing.GroupLayout jPanelClockContainerLayout = new javax.swing.GroupLayout(jPanelClockContainer);
        jPanelClockContainer.setLayout(jPanelClockContainerLayout);
        jPanelClockContainerLayout.setHorizontalGroup(
            jPanelClockContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClockContainerLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabelHour)
                .addGap(64, 64, 64))
        );
        jPanelClockContainerLayout.setVerticalGroup(
            jPanelClockContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClockContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHour)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDashboardLayout = new javax.swing.GroupLayout(jPanelDashboard);
        jPanelDashboard.setLayout(jPanelDashboardLayout);
        jPanelDashboardLayout.setHorizontalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelAccountFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jPanelClockContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelDashboardLayout.setVerticalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelClockContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAccountFirstName)))
                .addContainerGap(372, Short.MAX_VALUE))
        );

        jPanelSettings.setBackground(new java.awt.Color(0, 204, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Settings");

        jButton12.setText("Save Changes");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Username:");

        jLabelSettingsUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettingsUsername.setText("N/A");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Account ID:");

        jLabelSettingsAccountID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettingsAccountID.setText("N/A");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Access Level:");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("First Name:");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Email:");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Current Password:");

        jLabelSettingsAccessLevel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettingsAccessLevel.setText("N/A");

        jTextFieldSettingsFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSettingsFirstNameActionPerformed(evt);
            }
        });

        jTextFieldSettingsEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSettingsEmailActionPerformed(evt);
            }
        });

        jTextFieldSettingsCurrentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSettingsCurrentPasswordActionPerformed(evt);
            }
        });

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Company:");

        jLabelSettingsCompanyName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSettingsCompanyName.setText("N/A");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Last Name:");

        jTextFieldSettingsLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSettingsLastNameActionPerformed(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("New Password:");

        jTextFieldSettingsNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSettingsNewPasswordActionPerformed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Confirm Password:");

        jTextFieldSettingsConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSettingsConfirmPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSettingsUsername)
                            .addComponent(jLabelSettingsAccessLevel)
                            .addComponent(jTextFieldSettingsCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSettingsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSettingsFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28)
                            .addComponent(jLabel20)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSettingsCompanyName)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldSettingsNewPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldSettingsLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSettingsAccountID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSettingsConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabelSettingsUsername)
                    .addComponent(jLabel30)
                    .addComponent(jLabelSettingsAccountID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabelSettingsAccessLevel)
                    .addComponent(jLabel28)
                    .addComponent(jLabelSettingsCompanyName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldSettingsFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldSettingsLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldSettingsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldSettingsCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldSettingsNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextFieldSettingsConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSettingsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12))
                    .addGroup(jPanelSettingsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
        jPanelContent.setLayout(jPanelContentLayout);
        jPanelContentLayout.setHorizontalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelContentLayout.setVerticalGroup(
            jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDashboardMouseClicked
        jPanelContent.removeAll();
        jPanelContent.add(jPanelDashboard);
        jPanelContent.repaint();
        jPanelContent.revalidate();
    }//GEN-LAST:event_jButtonDashboardMouseClicked

    private void jButtonInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInventoryMouseClicked
        InventoryView iv = new InventoryView(this.account, this.company);
        jPanelContent.removeAll();
        jPanelContent.add(iv.getInventoryView());
        jPanelContent.repaint();
        jPanelContent.revalidate();
    }//GEN-LAST:event_jButtonInventoryMouseClicked

    private void jButtonProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProductsMouseClicked
        ProductView pv = new ProductView(this.account, this.company);
        jPanelContent.removeAll();
        jPanelContent.add(pv.getProductView());
        jPanelContent.repaint();
        jPanelContent.revalidate();
    }//GEN-LAST:event_jButtonProductsMouseClicked

    private void jButtonAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAccountsMouseClicked
        AccountView av = new AccountView(this.account, this.company);
        jPanelContent.removeAll();
        jPanelContent.add(av.getAccountView());
        jPanelContent.repaint();
        jPanelContent.revalidate();
    }//GEN-LAST:event_jButtonAccountsMouseClicked

    private void jButtonReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReportsMouseClicked
        ReportView rv = new ReportView(this.account, this.company);
        jPanelContent.removeAll();
        jPanelContent.add(rv.getReportView());
        jPanelContent.repaint();
        jPanelContent.revalidate();
    }//GEN-LAST:event_jButtonReportsMouseClicked

    private void jButtonSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSettingsMouseClicked
        SettingsView sv = new SettingsView(this.account, this.company);
        jPanelContent.removeAll();
        jPanelContent.add(sv.getSettingsView());
        jPanelContent.repaint();
        jPanelContent.revalidate();
    }//GEN-LAST:event_jButtonSettingsMouseClicked

    private void jTextFieldSettingsFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSettingsFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSettingsFirstNameActionPerformed

    private void jTextFieldSettingsLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSettingsLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSettingsLastNameActionPerformed

    private void jTextFieldSettingsEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSettingsEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSettingsEmailActionPerformed

    private void jTextFieldSettingsCurrentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSettingsCurrentPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSettingsCurrentPasswordActionPerformed

    private void jTextFieldSettingsNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSettingsNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSettingsNewPasswordActionPerformed

    private void jTextFieldSettingsConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSettingsConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSettingsConfirmPasswordActionPerformed

    private void jButtonProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProductsActionPerformed

    private void jButtonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogoutMouseClicked
        this.dispose();
        LandingPage.isLogin = false;
        LandingPage.account = null;
        LandingPage.dv = null;
        LandingPage.ld.setVisible(true);
    }//GEN-LAST:event_jButtonLogoutMouseClicked

    /**
     * @param account
     * @param company
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
//            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DashboardView db = new DashboardView();
//                db.setVisible(true);
//                db.doThis();
//            }
//        });
//    }
    
    public void doThis(Account account, Company company){
        jPanelContent.removeAll();
        jPanelContent.add(jPanelDashboard);
        jPanelContent.repaint();
        jPanelContent.revalidate();
        
        this.account = account;
        this.company = company;
        
        jLabelAccountFirstName.setText("Welcome Back " + this.account.getFirstName() + "!");
        
        this.loadSettings();
    }
    
    public void loadSettings(){
        jTextFieldSettingsFirstName.setText(this.account.getFirstName());
        jTextFieldSettingsLastName.setText(this.account.getLastName());
        jLabelSettingsUsername.setText(this.account.getUsername());
        jLabelSettingsAccountID.setText(Integer.toString(this.account.getAccountID()));
        jLabelSettingsAccessLevel.setText(this.account.getAccessLevel());
        jLabelSettingsCompanyName.setText(this.company.getCompanyName());
        jTextFieldSettingsEmail.setText(this.account.getEmail());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButtonAccounts;
    private javax.swing.JButton jButtonDashboard;
    private javax.swing.JButton jButtonInventory;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonProducts;
    private javax.swing.JButton jButtonReports;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAccountFirstName;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelSettingsAccessLevel;
    private javax.swing.JLabel jLabelSettingsAccountID;
    private javax.swing.JLabel jLabelSettingsCompanyName;
    private javax.swing.JLabel jLabelSettingsUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelClockContainer;
    private javax.swing.JPanel jPanelContent;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelNavigation;
    private javax.swing.JPanel jPanelSettings;
    private javax.swing.JTextField jTextFieldSettingsConfirmPassword;
    private javax.swing.JTextField jTextFieldSettingsCurrentPassword;
    private javax.swing.JTextField jTextFieldSettingsEmail;
    private javax.swing.JTextField jTextFieldSettingsFirstName;
    private javax.swing.JTextField jTextFieldSettingsLastName;
    private javax.swing.JTextField jTextFieldSettingsNewPassword;
    // End of variables declaration//GEN-END:variables
}
