/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_DAO;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import CSS_BLL.UserAcc;
import CSS_BLL.Customer;

/**
 *
 * @author Sujan
 */
public class MSLogin implements MSUserAccountD {
    
        @Override
    public boolean checkUser(UserAcc u) throws IOException{
        boolean found = false;

        try {
            FileReader fr = new FileReader("User.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[1].equals(u.getUname()) && splt[2].equals(u.getUpassword()) && splt[3].equals(u.getUrole())) {
                    found = true;
                    break;
                }
            }
            br.close();
  
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

    
        @Override
        public boolean checkCustomer(Customer ca) throws IOException{
        boolean found = false;

        try {
            FileReader fr = new FileReader("Customer.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[2].equals(ca.getCustomerName()) && splt[3].equals(ca.getCPword())) {
                    found = true;
                    break;
                }
            }
            br.close();
  
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

    
}