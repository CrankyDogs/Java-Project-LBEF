/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_DAO;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;
import CSS_BLL.UserAcc;
import CSS_BLL.Courier;
import CSS_BLL.Feedback;
import javax.swing.JOptionPane;
import CSS_BLL.Customer;
import CSS_BLL.Items;

/**
 *
 * @author Sujan
 */
public class UserAccount implements UserAccountDAO{
        @Override
    public void SaveUser(UserAcc ua) throws IOException {

        if (ua.getUemail().isEmpty() || ua.getUid().isEmpty() || ua.getUname().isEmpty() || ua.getUpassword().isEmpty() || ua.getUrole().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
            
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("User.txt", true))){
            bw.write(ua.getUid() + "," + ua.getUname() + "," + ua.getUpassword() + "," + ua.getUrole() + "," + ua.getUemail());
            bw.flush();
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
        }
    }
    
    @Override
    public void SaveOrder(Courier ua) throws IOException {
        if (ua.getUniqueID().isEmpty() || ua.getCOname().isEmpty() || ua.getAddress().isEmpty() || ua.getContact().isEmpty() || ua.getCustomerStatus().isEmpty() || ua.getItemName().isEmpty() || ua.getDate().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderData.txt", true))){
            bw.write(ua.getUniqueID() + "," + ua.getCOname() + "," + ua.getAddress() + "," + ua.getContact() + "," + ua.getCustomerStatus() + "," + ua.getItemName() + "," + ua.getDate() + "," + ua.getCFeedback() + "," + ua.getCCharge() + "," +  ua.getDeliveredDate() + "," + ua.getDeliveredBy());
            bw.flush();
            bw.newLine();
            bw.close();
        }
        JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
    }
    
        @Override
    public void saveitem(Courier ua) throws IOException {
        if (ua.getUniqueID().isEmpty() || ua.getCOname().isEmpty() || ua.getAddress().isEmpty() || ua.getContact().isEmpty() || ua.getItemName().isEmpty() || ua.getDate().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderData.txt", true))){
            bw.write(ua.getUniqueID() + "," + ua.getCOname() + "," + ua.getAddress() + "," + ua.getContact() + "," + "Pending" + "," + ua.getItemName() + "," + ua.getDate() + "," + ua.getCFeedback() + "," + ua.getCCharge() + "," +  ua.getDeliveredDate() + "," + ua.getDeliveredBy());
            bw.flush();
            bw.newLine();
            bw.close();
        }
        JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
    }

    
    
    @Override
    public void SaveFeedback(Feedback ua) throws IOException {
        if (ua.getFcustomerid().isEmpty() || ua.getFcustomername().isEmpty() || ua.getFfeedback().isEmpty() || ua.getreport().isEmpty() || ua.getImproveNeeded().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderData.txt", true))){
            bw.write(ua.getFcustomerid() + "," + ua.getFcustomername() + "," + ua.getFfeedback() + "," + ua.getreport() + "," + ua.getImproveNeeded());
            bw.flush();
            bw.newLine();
            bw.close();
        }
        JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
        
        
        
        
    }

    
        @Override
    public void SaveCustomer(Customer caa) throws IOException {

        if (caa.getUNID().isEmpty() || caa.getfullname().isEmpty() || caa.getCustomerName().isEmpty() || caa.getCPword().isEmpty() || caa.getemail().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
            
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Customer.txt", true))){
            bw.write(caa.getUNID() + "," + caa.getfullname() + "," + caa.getCustomerName() + "," + caa.getCPword() + "," + caa.getemail());
            bw.flush();
            bw.newLine();
            bw.close();
        }
            JOptionPane.showMessageDialog(null, "Account Registered Successfully!");
        }
    }
    
    
       @Override
    public void SaveOrderItem(Items ia) throws IOException {

        if (ia.getProductID().isEmpty() || ia.getProductName().isEmpty() || ia.getPrice().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
            
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderItem.txt", true))){
            bw.write(ia.getProductName() + "," + ia.getProductName() + "," + ia.getPrice());
            bw.flush();
            bw.newLine();
            bw.close();
        }
            JOptionPane.showMessageDialog(null, "Items Saved Successfully!");
        }
    }



    @Override
    public void UpdateUser(UserAcc sa) throws IOException {
        
    }


    @Override
    public void DeleteUser(UserAcc ua) throws IOException {

    }
    


    @Override
    public void ListUser(int userid) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void UpdateOrder(Courier ua) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void DeleteOrder(int UniqueID) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ListOrder(int UniqueID) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void UpdateFeedback(Feedback ua) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void DeleteFeedback(int UniqueID) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ListFeedback(int UniqueID) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void UpdateOrderItem(Items ia) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void DeleteOrderItem(int secretcode) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ListOrderItem(int secretcode) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public ArrayList<String> getAllUsers() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("User.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }

    @Override
    public ArrayList<String> getAllOrders() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("OrderData.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }
    
    @Override
    public ArrayList<String> getAllFeedback() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("FeedbackData.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }

    
        @Override
    public ArrayList<String> getAllOrderItem() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("OrderItem.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }

}