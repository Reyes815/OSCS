package product;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author L14Y09W36
 */
public class Connect {
    Connection conn=null;
    PreparedStatement pst;
    ResultSet rs;
    private ImageIcon format = null;
    Statement stmt;
    
    public Connect(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","");
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean addProduct(Product prod){
        String sql;
        try {
            stmt=conn.createStatement();
            sql ="INSERT `product`(`name`, `description`, `price`, `quantity`, `ProductProviderID`) VALUES('"+prod.getName()+"','"+prod.getDescription()+"','"+prod.getPrice()+"','"+prod.getQuantity()+"','"+prod.getProductProviderID()+"')";            
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int getProdID(){
        String sql;
        try {
            stmt=conn.createStatement();
            sql ="SELECT COUNT(*) AS productCount FROM `product`";
            rs = stmt.executeQuery(sql);
            rs.next();
            int count = rs.getInt("productCount");
            rs.close();
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public boolean addComment(user_comment user){
        String sql;
        try {
            stmt=conn.createStatement();
            sql ="INSERT INTO `comment`(`userID`, `productID`, `content`, `rating`, `image`) VALUES('"+user.getUserID()+"','"+user.getProductID()+"','"+user.getContent()+"','"+user.getRating()+"','"+user.getImgReview()+"')";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int getCommentID(){
        String sql;
        try {
            stmt=conn.createStatement();
            sql ="SELECT COUNT(*) AS commentCount FROM `comment`";
            rs = stmt.executeQuery(sql);
            rs.next();
            int count = rs.getInt("commentCount");
            rs.close();
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public boolean saveImage(String filepath){
        File f = new File(filepath);
        
        try{
            InputStream is = new FileInputStream(f);
            
            pst = conn.prepareStatement("INSERT INTO `image`(`imgName`, `imgPath`, `imgFile`) VALUES (?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, filepath);
            pst.setBlob(3, is);
            
            int success = pst.executeUpdate();
            
            if(success > 0){
                return true;
            }
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(Comments.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public ImageIcon returnImage(String filepath){
        String sql;
        try {
            stmt=conn.createStatement();
            sql ="SELECT * FROM `image` WHERE imgPath = '"+filepath+"'";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                Blob blob = rs.getBlob(4);
		long a = blob.length();
		byte barr[] = new byte[(int) a];
		barr = blob.getBytes(1,(int)a);
                format = new ImageIcon(barr);
                Image mm = format.getImage();
                Image img2 = mm.getScaledInstance(150, 200, Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img2);
                return image;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ArrayList<Product> displayProduct(String productname){
        ArrayList<Product> prod = new ArrayList<Product>();
        String sql ="SELECT * FROM `product` where name='"+productname+"'";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
              Product p = new Product(rs.getString(2),rs.getInt(4),rs.getInt(5));
              prod.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prod;
    }
}
