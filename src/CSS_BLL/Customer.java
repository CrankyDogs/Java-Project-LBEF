/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_BLL;

/**
 *
 * @author Sujan
 */
public class Customer {
    private String UNID;
    private String fullname;
    private String CUname;
    private String CPword;
    private String email;


    
    
public Customer(){
    
}
    
    public Customer(String UNID, String fullname, String CUname, String customeruserpassword, String email) {
        this.UNID = UNID;
        this.fullname = fullname;
        this.CUname = CUname;
        this.CPword = customeruserpassword;
        this.email = email;
        }

    public Customer(String data) {
        String[] dataArr = data.split(",");
        this.UNID = dataArr[0];
        this.fullname = dataArr[1];
        this.CUname = dataArr[2];
        this.CPword = dataArr[3];
        this.email = dataArr[4];
    }

        

    public String getUNID() {
        return UNID;
    }

    public void setUNID(String UNID) {
        this.UNID = UNID;
    }
    
    public String getfullname() {
        return fullname;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getCustomerName() {
        return CUname;
    }

    public void setCustomerName(String CUname) {
        this.CUname = CUname;
    }

    public String getCPword() {
        return CPword;
    }

    public void setCPword(String CPword) {
        this.CPword = CPword;
    }
    
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    
    @Override
    public String toString() {
        return (this.UNID + "," + this.fullname + "," + this.CUname + "," + this.CPword + "," + this.email);
        
    }



}
