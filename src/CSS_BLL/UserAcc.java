/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_BLL;

/**
 *
 * @author Sujan
 */
public class UserAcc {
    private String userid;
    private String username;
    private String userpassword;
    private String userrole;
    private String email;

    
public UserAcc(){
    
}
    
    public UserAcc(String userid, String username, String userpassword, String userrole, String email) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.userrole = userrole;
        this.email = email;
    }

    public UserAcc(String data) {
        String[] dataArr = data.split(",");
        this.userid = dataArr[0];
        this.username = dataArr[1];
        this.userpassword = dataArr[2];
        this.userrole = dataArr[3];
        this.email = dataArr[4];
    }

    
    public String getUid() {
        return userid;
    }

    public void setUid(String userid) {
        this.userid = userid;
    }

    public String getUname() {
        return username;
    }

    public void setUname(String username) {
        this.username = username;
    }

    public String getUpassword() {
        return userpassword;
    }

    public void setUpassword(String userpassword) {
        this.userpassword = userpassword;
    }
    
    public String getUrole() {
        return userrole;
    }

    public void setUrole(String userrole) {
        this.userrole = userrole;
    }
    
    public String getUemail() {
        return email;
    }

    public void setUemail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return (this.userid + "," + this.username + "," + this.userpassword + "," + this.userrole + "," + this.email);
        }
}
