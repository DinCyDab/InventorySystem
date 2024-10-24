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
    
    public void loadReportsAdmin(int account_ID, int company_ID){
        String sql = "SELECT * FROM (Report"
                + "INNER JOIN Account ON Report.account_ID = Account.account_ID) "
                + "INNER JOIN Company ON Account.company_ID = Company.company_ID "
                + "WHERE Account.company_ID = '"+company_ID+"' ";
        this.reports = this.dc.loadReportsQuery(sql);
    }
    
    public ArrayList<Report> getReports(){
        return this.reports;
    }
}
