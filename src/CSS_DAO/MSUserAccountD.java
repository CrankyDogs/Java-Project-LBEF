/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_DAO;

import java.io.IOException;
import CSS_BLL.UserAcc;
import CSS_BLL.Customer;

/**
 *
 * @author Sujan
 */
public interface MSUserAccountD {
    public boolean checkUser(UserAcc u) throws IOException; 

    public boolean checkCustomer(Customer ca) throws IOException; 
}
