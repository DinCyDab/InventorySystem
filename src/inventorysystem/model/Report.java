package inventorysystem.model;

import java.sql.Time;
import java.util.Date;

public class Report {
    private int report_ID;
    private String username;
    private String product_name;
    private Date report_date;
    private Time report_time;
    private int quantity;
    private String status;
    
    public Report(int r_ID, String username, String product_name, Date report_date, Time report_time, int quantity, String status){
        this.report_ID = r_ID;
        this.username = username;
        this.product_name = product_name;
        this.report_date = report_date;
        this.report_time = report_time;
        this.quantity = quantity;
        this.status = status;
    }
    public int getReportID(){
        return this.report_ID;
    }
    public String getUsername(){
        return this.username;
    }
    public String getProductName(){
        return this.product_name;
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
    public int getQuantity(){
        return this.quantity;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
