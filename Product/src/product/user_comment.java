/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import javax.swing.ImageIcon;

/**
 *
 * @author Administrator
 */
public class user_comment {
    int commentID;
    int userID;
    int productID;
    String content;
    int rating;
    ImageIcon imgReview;

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ImageIcon getImgReview() {
        return imgReview;
    }

    public void setImgReview(ImageIcon imgReview) {
        this.imgReview = imgReview;
    }

    public user_comment(int commentID, int userID, int productID, String content, int rating, ImageIcon imgReview) {
        this.commentID = commentID;
        this.userID = userID;
        this.productID = productID;
        this.content = content;
        this.rating = rating;
        this.imgReview = imgReview;
    }

    public user_comment(int commentID, int userID, int productID, String content, int rating) {
        this.commentID = commentID;
        this.userID = userID;
        this.productID = productID;
        this.content = content;
        this.rating = rating;
    }
}
