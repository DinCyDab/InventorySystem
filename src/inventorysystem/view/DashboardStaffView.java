/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorysystem.view;

import inventorysystem.controller.AccountController;
import inventorysystem.model.*;

public class DashboardStaffView extends javax.swing.JFrame {
    private ReportStaffView rsv;
    private Account account;
    private Company company;
    
    public DashboardStaffView(Account account, Company company) {
        initComponents();
        this.account = account;
        this.company = company;
        this.rsv = new ReportStaffView(this.account, this.company);
        this.paintDashboard();
        
        this.loadProfileSettings();
    }
    
    private void loadProfileSettings(){
        String company_name = this.company.getCompanyName();
        String first_name = this.account.getFirstName();
        String last_name = this.account.getLastName();
        String username = this.account.getUsername();
        String access_level = this.account.getAccessLevel();
        String email = this.account.getEmail();
        
        jLabelSettingsCompanyName.setText(company_name);
        jLabelSettingsFirstName.setText(first_name);
        jLabelSettingsLastName.setText(last_name);
        jLabelSettingsUsername.setText(username);
        jLabelSettingsAccessLevel.setText(access_level);
        jLabelSettingsEmail.setText(email);
    }
    
    private void paintDashboard(){
        jPanelStaffViewContainer.removeAll();
        jPanelStaffViewContainer.add(jPanelDashboard);
        jPanelStaffViewContainer.repaint();
        jPanelStaffViewContainer.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelStaffViewContainer = new javax.swing.JPanel();
        jPanelDashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelSettingsFirstName = new javax.swing.JLabel();
        jLabelSettingsUsername = new javax.swing.JLabel();
        jLabelSettingsLastName = new javax.swing.JLabel();
        jLabelSettingsEmail = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPasswordSettingsCurrentPassword = new javax.swing.JPasswordField();
        jPasswordSettingsNewPassword = new javax.swing.JPasswordField();
        jPasswordSettingsConfirmPassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabelSettingsAccessLevel = new javax.swing.JLabel();
        jLabelSettingsCompanyName = new javax.swing.JLabel();
        jPanelNavigationContainer = new javax.swing.JPanel();
        jButtonLogout = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelStaffViewContainer.setBackground(new java.awt.Color(0, 204, 204));

        jPanelDashboard.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout jPanelDashboardLayout = new javax.swing.GroupLayout(jPanelDashboard);
        jPanelDashboard.setLayout(jPanelDashboardLayout);
        jPanelDashboardLayout.setHorizontalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanelDashboardLayout.setVerticalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSettings.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Profile Settings");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Company Name:");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("First Name:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Last Name:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username:");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email:");

        jLabelSettingsFirstName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSettingsFirstName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettingsFirstName.setText("N/A");

        jLabelSettingsUsername.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSettingsUsername.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettingsUsername.setText("N/A");

        jLabelSettingsLastName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSettingsLastName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettingsLastName.setText("N/A");

        jLabelSettingsEmail.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSettingsEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettingsEmail.setText("N/A");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Current Password:");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("New Password:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Confirm Password:");

        jButton2.setText("Save Changes");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Access Level:");

        jLabelSettingsAccessLevel.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSettingsAccessLevel.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettingsAccessLevel.setText("N/A");

        jLabelSettingsCompanyName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSettingsCompanyName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettingsCompanyName.setText("N/A");

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanelSettingsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSettingsCompanyName))
                    .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(jPanelSettingsLayout.createSequentialGroup()
                            .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addGap(48, 48, 48)
                            .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelSettingsFirstName)
                                .addComponent(jLabelSettingsUsername)
                                .addComponent(jLabelSettingsAccessLevel))
                            .addGap(160, 160, 160)
                            .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelSettingsEmail)
                                .addComponent(jLabelSettingsLastName))))
                    .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSettingsLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(jPasswordSettingsConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSettingsLayout.createSequentialGroup()
                            .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(22, 22, 22)
                            .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordSettingsCurrentPassword)
                                .addComponent(jPasswordSettingsNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                    .addComponent(jLabel15))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelSettingsCompanyName))
                .addGap(18, 18, 18)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabelSettingsFirstName)
                    .addComponent(jLabelSettingsLastName))
                .addGap(18, 18, 18)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabelSettingsUsername)
                    .addComponent(jLabelSettingsEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabelSettingsAccessLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jPasswordSettingsCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jPasswordSettingsNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jPasswordSettingsConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanelStaffViewContainerLayout = new javax.swing.GroupLayout(jPanelStaffViewContainer);
        jPanelStaffViewContainer.setLayout(jPanelStaffViewContainerLayout);
        jPanelStaffViewContainerLayout.setHorizontalGroup(
            jPanelStaffViewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
            .addGroup(jPanelStaffViewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelStaffViewContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanelStaffViewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelStaffViewContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelStaffViewContainerLayout.setVerticalGroup(
            jPanelStaffViewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(jPanelStaffViewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelStaffViewContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanelStaffViewContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelStaffViewContainerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanelNavigationContainer.setBackground(new java.awt.Color(0, 102, 102));

        jButtonLogout.setText("Logout");
        jButtonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogoutMouseClicked(evt);
            }
        });
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jButtonHome.setText("Home");
        jButtonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHomeMouseClicked(evt);
            }
        });

        jButtonReport.setText("Report");
        jButtonReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReportMouseClicked(evt);
            }
        });

        jButton1.setText("Settings");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNavigationContainerLayout = new javax.swing.GroupLayout(jPanelNavigationContainer);
        jPanelNavigationContainer.setLayout(jPanelNavigationContainerLayout);
        jPanelNavigationContainerLayout.setHorizontalGroup(
            jPanelNavigationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavigationContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNavigationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogout)
                    .addComponent(jButtonHome)
                    .addComponent(jButtonReport)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNavigationContainerLayout.setVerticalGroup(
            jPanelNavigationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNavigationContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHome)
                .addGap(18, 18, 18)
                .addComponent(jButtonReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelNavigationContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStaffViewContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelStaffViewContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelNavigationContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogoutMouseClicked
        this.dispose();
        LandingPage.ld.setVisible(true);
        LandingPage.account = null;
        LandingPage.dsv = null;
        LandingPage.dv = null;
    }//GEN-LAST:event_jButtonLogoutMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReportMouseClicked
        jPanelStaffViewContainer.removeAll();
        jPanelStaffViewContainer.add(this.rsv.getPanelReport());
        jPanelStaffViewContainer.repaint();
        jPanelStaffViewContainer.revalidate();
    }//GEN-LAST:event_jButtonReportMouseClicked

    private void jButtonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHomeMouseClicked
        jPanelStaffViewContainer.removeAll();
        jPanelStaffViewContainer.add(jPanelDashboard);
        jPanelStaffViewContainer.repaint();
        jPanelStaffViewContainer.revalidate();
    }//GEN-LAST:event_jButtonHomeMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jPanelStaffViewContainer.removeAll();
        jPanelStaffViewContainer.add(jPanelSettings);
        jPanelStaffViewContainer.repaint();
        jPanelStaffViewContainer.revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        AccountController ac = new AccountController();
        
        String current_password = jPasswordSettingsCurrentPassword.getText();
        String new_password = jPasswordSettingsNewPassword.getText();
        String confirm_password = jPasswordSettingsConfirmPassword.getText();
        
        String username = this.account.getUsername();
        
        if(current_password.equals("")){
            System.out.println("Empty Current Password");
            return;
        }
        
        boolean is_password_correct = ac.loadAccount(username, current_password);
        if(!is_password_correct){
            System.out.println("Wrong Current Password");
            return;
        }
        
        if(new_password.equals("") || confirm_password.equals("")){
            System.out.println("Password must not be empty");
            return;
        }
        
        if(!new_password.equals(confirm_password)){
            System.out.println("New and Confirm Password didn't match");
            return;
        }
        
        int account_ID = this.account.getAccountID();
        ac.editPassword(account_ID, new_password);
        
        System.out.println("Password Successfully Changed");
        
        jPasswordSettingsCurrentPassword.setText("");
        jPasswordSettingsNewPassword.setText("");
        jPasswordSettingsConfirmPassword.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

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
//            java.util.logging.Logger.getLogger(DashboardStaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DashboardStaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DashboardStaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DashboardStaffView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new DashboardStaffView().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelSettingsAccessLevel;
    private javax.swing.JLabel jLabelSettingsCompanyName;
    private javax.swing.JLabel jLabelSettingsEmail;
    private javax.swing.JLabel jLabelSettingsFirstName;
    private javax.swing.JLabel jLabelSettingsLastName;
    private javax.swing.JLabel jLabelSettingsUsername;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelNavigationContainer;
    private javax.swing.JPanel jPanelSettings;
    private javax.swing.JPanel jPanelStaffViewContainer;
    private javax.swing.JPasswordField jPasswordSettingsConfirmPassword;
    private javax.swing.JPasswordField jPasswordSettingsCurrentPassword;
    private javax.swing.JPasswordField jPasswordSettingsNewPassword;
    // End of variables declaration//GEN-END:variables
}
