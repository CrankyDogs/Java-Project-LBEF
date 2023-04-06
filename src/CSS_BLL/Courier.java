/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_BLL;

/**
 *
 * @author Sujan
 */
public class Courier {
    private String custid;
    private String UniqueID;
    private String COname;
    private String Address;
    private String Contact;
    private String customerstatus;
    private String ItemName;
    private String Date;
    private String CFeedback;
    private String CCharge;
    private String delivereddate;
    private String deliveredby;

    public Courier() {
}
    
    public Courier(String UniqueID, String COname, String Address, String Contact, String customerstatus, String ItemName, String Date, String CFeedback, String CCharge, String deliverydate, String deliveredby) {
        this.UniqueID = UniqueID;
        this.COname = COname;
        this.Address = Address;
        this.Contact = Contact;
        this.customerstatus = customerstatus;
        this.ItemName = ItemName;
        this.Date = Date;
        this.CFeedback = CFeedback;
        this.CCharge = CCharge;
        this.delivereddate = deliverydate;
        this.deliveredby = deliveredby;
    }

    public Courier(String data) {
        String[] dataArr = data.split(",");
            this.UniqueID = dataArr[0];
            this.COname = dataArr[1];
            this.Address = dataArr[2];
            this.Contact = dataArr[3];
            this.customerstatus = dataArr[4];
            this.ItemName = dataArr[5];
            this.Date = dataArr[6];
            this.CFeedback = dataArr[7];
            this.CCharge = dataArr[8];
            this.delivereddate = dataArr[9];
            this.deliveredby = dataArr[10];
        
    }

    
    public String getRid() {
        return custid;
    }
    
    public void setRid(String custid){
        this.custid = custid;
    }
    
    public String getUniqueID() {
        return UniqueID;
    }

    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }
    
    public String getCOname(){
        return COname;
    }
    
    public void setCOname(String COname){
        this.COname = COname;
    }
    
    public String getAddress() {
        return Address;
    }
    
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public String getContact(){
        return Contact;
    }
    
    public void setContact(String Contact){
        this.Contact = Contact;
    }
    
    public String getCustomerStatus(){
        return customerstatus;
    }
    
    public void setCustomerStatus(String customerstatus){
        this.customerstatus = customerstatus;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    public String getCFeedback() {
        return CFeedback;
    }
    
    public void setCFeedback(String CFeedback){
        this.CFeedback = CFeedback;
    }
    
    public String getCCharge(){
        return CCharge;
    }
    
    public void setCCharge(String CCharge){
        this.CCharge = CCharge;
    }
    
    public String getDeliveredDate (){
        return delivereddate;
    }
    
    public void setDeliveredDate (String deliverydate){
        this.delivereddate = deliverydate;
    }
    
    public String getDeliveredBy (){
        return deliveredby;
    }
    
    public void setDeliveredBy (String deliveredby){
        this.deliveredby = deliveredby;
    }

    @Override
    public String toString() {
        return (this.UniqueID + "," + this.COname + "," + this.Address + "," + this.Contact + "," + this.customerstatus + "," + this.ItemName + "," + this.Date + "," + this.CFeedback + "," + this.CCharge + "," + this.delivereddate + "," + this.deliveredby);
        
    }


}
