/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_DAO;

import CSS_BLL.UserAcc;
import CSS_BLL.Courier;
import CSS_BLL.Feedback;
import java.io.IOException;
import java.util.ArrayList;
import CSS_BLL.Customer;
import CSS_BLL.Items;
/**
 *
 * @author Sujan
 */
public interface UserAccountDAO {
   
    void SaveUser(UserAcc ua)throws IOException;
    void UpdateUser(UserAcc ua)throws IOException;
    void DeleteUser(UserAcc ua)throws IOException;
    void ListUser(int userid )throws IOException;
    ArrayList<String>getAllUsers()throws IOException;
    
    void SaveOrder(Courier ua)throws IOException;
    void UpdateOrder(Courier ua)throws IOException;
    void DeleteOrder(int customerid)throws IOException;
    void ListOrder(int customerid )throws IOException;
    ArrayList<String>getAllOrders()throws IOException;   
    
    void SaveFeedback(Feedback ua)throws IOException;
    void UpdateFeedback(Feedback ua)throws IOException;
    void DeleteFeedback(int feedbackcustomerid)throws IOException;
    void ListFeedback(int feedbackcustomerid )throws IOException;
    ArrayList<String>getAllFeedback()throws IOException;   
    
    
    void SaveOrderItem(Items ia)throws IOException;
    void UpdateOrderItem(Items ia)throws IOException;
    void DeleteOrderItem(int secretcode)throws IOException;
    void ListOrderItem(int secretcode )throws IOException;
    ArrayList<String>getAllOrderItem()throws IOException;   
    
    void SaveCustomer(Customer caa)throws IOException;
    
    void saveitem(Courier ua)throws IOException;

}
