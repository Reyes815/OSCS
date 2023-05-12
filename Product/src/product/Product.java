/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product;

/**
 *
 * @author Administrator
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    String name;
    String description;
    int price;
    int quantity;
    int productProviderID;
    int productID;

    public Product(String name, String description, 
            int price, int quantity, int productID, int productProviderID) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.productProviderID = productProviderID;
        this.productID = productID;
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductProviderID() {
        return productProviderID;
    }

    public void setProductProviderID(int productProviderID) {
        this.productProviderID = productProviderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    
}
