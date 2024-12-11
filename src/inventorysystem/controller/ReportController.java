package inventorysystem.controller;

import java.util.ArrayList;
import java.sql.Time;
import java.util.Date;
import inventorysystem.model.Report;

public class ReportController {
    private DatabaseController dc = new DatabaseController();
    private ArrayList<Report> reports;
    
    public void createReport(int a_ID, int p_ID, int consumed){
        String sql = "INSERT INTO "
                + "Report(account_ID, product_ID, consumed)"
                + "VALUES('"+a_ID+"', '"+p_ID+"', '"+consumed+"')";
        this.dc.insertQuery(sql);
    }
    
    public void updateReport(int r_ID, String status){
        String sql = "UPDATE Report "
                + "SET status = '"+status+"' "
                + "WHERE report_ID = '"+r_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void updateReport(int r_ID, int quantity){
        String sql = "UPDATE Report "
                + "SET consumed = '"+quantity+"' "
                + "WHERE report_ID = '"+r_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void removeReport(int r_ID){
        String sql = "DELETE FROM report\n" +
                     "WHERE report_ID = '"+r_ID+"'";
        this.dc.insertQuery(sql);
    }
    
    public void loadReportsStaff(int a_ID){
        String sql = "SELECT report.*,\n" +
                    "	product.product_name as 'product_name',\n" +
                    "    account.username as 'username'\n" +
                    "FROM (Report\n" +
                    "INNER JOIN product ON product.product_ID = report.product_ID)\n" +
                    "INNER JOIN account ON account.account_ID = report.account_ID\n" +
                    "WHERE report.account_ID = '"+a_ID+"'";
        this.reports = this.dc.loadReportsQuery(sql);
    }
    
    public void loadReportsStaff(int a_ID, String filter){
        String sql = "SELECT report.*,\n" +
                    "	product.product_name as 'product_name',\n" +
                    "   account.username as 'username'\n" +
                    "FROM (Report\n" +
                    "INNER JOIN product ON product.product_ID = report.product_ID)\n" +
                    "INNER JOIN account ON account.account_ID = report.account_ID\n" +
                    "WHERE report.account_ID = '"+a_ID+"'\n" +
                    "AND\n" +
                    "report.status = '"+filter+"'";
        this.reports = this.dc.loadReportsQuery(sql);
    }
    
    public ArrayList<Report> loadReportsAdmin(int account_ID, int company_ID){
        ArrayList<Report> admin_reports;
        String sql = "SELECT " +
                    "	*, " +
                    "    account.username AS 'username', " +
                    "    product.product_name AS 'product_name' " +
                    "FROM " +
                    "	(report " +
                    "INNER JOIN Account ON account.account_ID = report.account_ID) " +
                    "INNER JOIN Product ON product.product_ID = report.product_ID " +
                    "WHERE Account.company_ID = '"+company_ID+"'";
        admin_reports = this.dc.loadReportsQuery(sql);
        return admin_reports;
    }
    
    public ArrayList<Report> loadReportsAdmin(int account_ID, int company_ID, String filter){
        ArrayList<Report> admin_reports;
        String sql = "SELECT " +
                    "	*, " +
                    "    account.username AS 'username', " +
                    "    product.product_name AS 'product_name' " +
                    "FROM " +
                    "	(report " +
                    "INNER JOIN Account ON account.account_ID = report.account_ID) " +
                    "INNER JOIN Product ON product.product_ID = report.product_ID " +
                    "WHERE Account.company_ID = '"+company_ID+"' " + 
                    "AND report.status = '"+filter+"'";
        admin_reports = this.dc.loadReportsQuery(sql);
        return admin_reports;
    }
    
    public ArrayList<Report> getReports(){
        return this.reports;
    }
}
