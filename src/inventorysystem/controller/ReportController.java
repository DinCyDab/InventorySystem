package inventorysystem.controller;

import java.util.ArrayList;
import java.sql.Time;
import java.util.Date;
import inventorysystem.model.Report;

public class ReportController {
    private DatabaseController dc = new DatabaseController();
    private ArrayList<Report> reports;
    
    public void createReport(int a_ID, int p_ID, Date report_date, Time report_time, int consumed, String status){
        String sql = "INSERT INTO "
                + "Report(account_ID, product_ID, report_date, report_time, consumed, status)"
                + "VALUES('"+a_ID+"', '"+p_ID+"', '"+report_date+"', '"+report_time+"', '"+consumed+"', '"+status+"')";
        this.dc.insertQuery(sql);
    }
    
    public void loadReportsStaff(int a_ID){
        String sql = "SELECT * FROM Report"
                + "WHERE account_ID = '"+a_ID+"'";
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
    
    public ArrayList<Report> getReports(){
        return this.reports;
    }
}
