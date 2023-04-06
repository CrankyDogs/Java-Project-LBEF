/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_BLL;

/**
 *
 * @author Sujan
 */
public class Feedback {
    private String feedbackcustomerid;
    private String feedbackcustomername;
    private String feedbackcustomerfeedback;
    private String feedbackcategory;
    private String improveneeded;



public Feedback(){

}

public Feedback(String feedbackcustomerid, String feedbackcustomername, String feedbackcustomerfeedback, String feedbackcategory, String improveneeded){
    this.feedbackcustomerid = feedbackcustomerid;
    this.feedbackcustomername = feedbackcustomername;
    this.feedbackcustomerfeedback = feedbackcustomerfeedback;
    this.feedbackcategory = feedbackcategory;
    this.improveneeded = improveneeded;
}

    public Feedback(String fee) {
        String[] dataArr = fee.split(",");
            this.feedbackcustomerid = dataArr[0];
            this.feedbackcustomername = dataArr[1];
            this.feedbackcustomerfeedback = dataArr[2];
            this.feedbackcategory = dataArr[3];
            this.improveneeded = dataArr[4];
        
    }


    public String getFcustomerid() {
        return feedbackcustomerid;
    }
    
    public void setFcustomerid(String feedbackcustomerid){
        this.feedbackcustomerid = feedbackcustomerid;
    }
    
    public String getFcustomername() {
        return feedbackcustomername;
    }
    
    public void setFcustomername(String feedbackcustomername){
        this.feedbackcustomername = feedbackcustomername;
    }
    
    public String getFfeedback() {
        return feedbackcustomerfeedback;
    }
    
    public void setFfeedback(String feedbackcustomerfeedback){
        this.feedbackcustomerfeedback = feedbackcustomerfeedback;
    }
    
    public String getreport() {
        return feedbackcategory;
    }
    
    public void setreport(String feedbackcategory){
        this.feedbackcategory = feedbackcategory;
    }
    
    public String getImproveNeeded() {
        return improveneeded;
    }
    
    public void setImproveNeeded(String improveneeded){
        this.improveneeded = improveneeded;
    }

    @Override
    public String toString() {
        return (this.feedbackcustomerid + "," + this.feedbackcustomername + "," + this.feedbackcustomerfeedback + "," + this.feedbackcategory + "," + this.improveneeded);
        
    }




}
