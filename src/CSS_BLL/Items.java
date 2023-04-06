/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS_BLL;

/**
 *
 * @author Sujan
 */
public class Items {
    private String secretcode;
    private String itemname;
    private String price;
    
    
public Items(){
    
}
    
    public Items(String secretcode, String itemname, String price) {
        this.secretcode = secretcode;
        this.itemname = itemname;
        this.price = price;
        }

    public Items(String data) {
        String[] dataArr = data.split(",");
        this.secretcode = dataArr[0];
        this.itemname = dataArr[1];
        this.price = dataArr[2];
        }

        

    public String getProductID() {
        return secretcode;
    }

    public void setProductID(String secretcode) {
        this.secretcode = secretcode;
    }
    
    public String getProductName() {
        return itemname;
    }

    public void setProductName(String itemname) {
        this.itemname = itemname;
    }
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    
    @Override
    public String toString() {
        return (this.secretcode + "," + this.itemname + "," + this.price);
        
    }



}