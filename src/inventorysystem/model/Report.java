package inventorysystem.model;

import java.sql.Time;
import java.util.Date;

public class Report {
    private int report_ID;
    private int account_ID;
    private int product_ID;
    private Date report_date;
    private Time report_time;
    private int consumed;
    private String status;
    
    public Report(int r_ID, int a_ID, int p_ID, Date report_date, Time report_time, int consumed, String status){
        this.report_ID = r_ID;
        this.account_ID = a_ID;
        this.product_ID = p_ID;
        this.report_date = report_date;
        this.report_time = report_time;
        this.consumed = consumed;
        this.status = status;
    }
    public int getReportID(){
        return this.report_ID;
    }
    public int account_ID(){
        return this.account_ID;
    }
    public int product_ID(){
        return this.product_ID;
    }
    public Date getReportDate(){
        return this.report_date;
    }
    public Time getReportTime(){
        return this.report_time;
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
