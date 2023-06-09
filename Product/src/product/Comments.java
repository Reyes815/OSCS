/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package product;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class Comments extends javax.swing.JFrame {
    File file = null;
    String filepath = null;
    Connect conn = null;
    /**
     * Creates new form Comments
     */
    public Comments() {
        initComponents();
        deselect_ratebuttons.setVisible(false);
        conn = new Connect();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rate_system = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        addImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Product_Image = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        product_review = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSubmitRev = new javax.swing.JButton();
        btnBrowseImg = new javax.swing.JButton();
        rate_1 = new javax.swing.JRadioButton();
        rate_2 = new javax.swing.JRadioButton();
        rate_3 = new javax.swing.JRadioButton();
        rate_4 = new javax.swing.JRadioButton();
        rate_5 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtfilepath = new javax.swing.JTextField();
        deselect_ratebuttons = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        product_name5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 252, 246));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 66, 60), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(addImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 151));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 66, 60));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Write A Review");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 21, 242, 36));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(57, 66, 60));
        jLabel11.setText("<html><b>Stylish and Comfortable Shirt for Any Occasion</b></html>");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 69, -1, 22));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(57, 66, 60));
        jLabel12.setText("<html>✔ Factory direct quality assurance best price.  <br/>✔ If you have any questions, please feel free to contact us!  <br/>✔ Please read the instructions carefully before placing your order. <br/> ✔ Please see size chart for accurate measurement. <br/>Do not assume that these are measured by the Proper Age Group.</html>");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 97, -1, 81));

        Product_Image.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Product_Image.setForeground(new java.awt.Color(57, 66, 60));
        Product_Image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Pictures\\product.JPG")); // NOI18N
        Product_Image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 66, 60), 2, true));
        jPanel3.add(Product_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 69, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(57, 66, 60));
        jLabel14.setText("Add Photo or Video");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 184, 115, 22));

        product_review.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        product_review.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        product_review.setMargin(new java.awt.Insets(2, 10, 2, 6));
        product_review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_reviewActionPerformed(evt);
            }
        });
        jPanel3.add(product_review, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 212, 262, 102));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(57, 66, 60));
        jLabel15.setText("Write your review");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 184, 115, 22));

        jPanel1.setBackground(new java.awt.Color(172, 172, 156));
        jPanel1.setForeground(new java.awt.Color(172, 172, 156));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubmitRev.setBackground(new java.awt.Color(57, 66, 60));
        btnSubmitRev.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnSubmitRev.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmitRev.setText("Submit Review");
        btnSubmitRev.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 66, 60), 2, true));
        btnSubmitRev.setBorderPainted(false);
        btnSubmitRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitRevActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmitRev, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 120, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 570, -1));

        btnBrowseImg.setBackground(new java.awt.Color(57, 66, 60));
        btnBrowseImg.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnBrowseImg.setForeground(new java.awt.Color(255, 255, 255));
        btnBrowseImg.setText("Browse Images");
        btnBrowseImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 66, 60), 2, true));
        btnBrowseImg.setBorderPainted(false);
        btnBrowseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseImgActionPerformed(evt);
            }
        });
        jPanel3.add(btnBrowseImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 420, 120, 30));

        rate_system.add(rate_1);
        rate_1.setText("1");
        rate_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_1ActionPerformed(evt);
            }
        });
        jPanel3.add(rate_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 348, -1, -1));

        rate_system.add(rate_2);
        rate_2.setText("2");
        jPanel3.add(rate_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 348, -1, -1));

        rate_system.add(rate_3);
        rate_3.setText("3");
        rate_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_3ActionPerformed(evt);
            }
        });
        jPanel3.add(rate_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 348, -1, -1));

        rate_system.add(rate_4);
        rate_4.setText("4");
        rate_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_4ActionPerformed(evt);
            }
        });
        jPanel3.add(rate_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 348, -1, -1));

        rate_system.add(rate_5);
        rate_5.setText("5");
        rate_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_5ActionPerformed(evt);
            }
        });
        jPanel3.add(rate_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 348, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(57, 66, 60));
        jLabel16.setText("Rate the product out of 5");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 320, 151, 22));

        txtfilepath.setEditable(false);
        txtfilepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilepathActionPerformed(evt);
            }
        });
        jPanel3.add(txtfilepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 212, 205, -1));

        rate_system.add(deselect_ratebuttons);
        deselect_ratebuttons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deselect_ratebuttonsActionPerformed(evt);
            }
        });
        jPanel3.add(deselect_ratebuttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 570, 500));

        jPanel4.setBackground(new java.awt.Color(57, 66, 60));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Online Shopping System");

        jButton7.setBackground(new java.awt.Color(57, 66, 60));
        jButton7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("  Product Management");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(57, 66, 60));
        jButton8.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("  Explore");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(57, 66, 60));
        jButton9.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("  Cart");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(57, 66, 60));
        jButton10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("  Wishlist");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(57, 66, 60));
        jButton11.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("  Logout");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        product_name5.setText("Search"); // NOI18N
        product_name5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(57, 66, 60), 1, true));
        product_name5.setMargin(new java.awt.Insets(2, 10, 2, 6));
        product_name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name5ActionPerformed(evt);
            }
        });
        jPanel2.add(product_name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product_reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_reviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_reviewActionPerformed

    private void btnSubmitRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitRevActionPerformed
        // TODO add your handling code here:
        int rating;
        //rating system
        if(rate_1.isSelected()){
            rating = 1;
        }else if(rate_2.isSelected()){
            rating = 2;
        }else if(rate_3.isSelected()){
            rating = 3;
        }else if(rate_4.isSelected()){
            rating = 4;
        }else if(rate_5.isSelected()){
            rating = 5;
        }else rating = 0;
        //images
        conn.saveImage(txtfilepath.getText());
        ImageIcon img = conn.returnImage(txtfilepath.getText());
        //submit everything to db
        user_comment user = new user_comment(conn.getCommentID(), 1,1, product_review.getText(), rating, img);
        conn.addComment(user);
        JOptionPane.showMessageDialog(null, "Comment Added");
        product_review.setText("");
        addImg.setIcon(null);
        deselect_ratebuttons.setSelected(true);
        txtfilepath.setText("");
    }//GEN-LAST:event_btnSubmitRevActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void product_name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_name5ActionPerformed

    private void btnBrowseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseImgActionPerformed
        // TODO add your handling code here:
        //get img from files
        JFileChooser browseImgFile = new JFileChooser();
        //filter img path extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImgFile.addChoosableFileFilter(fnef);
        
        int showOpenDialog = browseImgFile.showOpenDialog(null);
        if(showOpenDialog == JFileChooser.APPROVE_OPTION){
            file = browseImgFile.getSelectedFile();
            
            filepath = file.getAbsolutePath();
            //show filepath
            JOptionPane.showMessageDialog(null, filepath);
            //after getting img we need to display it on jlabel
            ImageIcon productImg = new ImageIcon(filepath);
            Image img = productImg.getImage();
            Image img2 = img.getScaledInstance(150, 200, Image.SCALE_SMOOTH);
            addImg.setIcon(new ImageIcon(img2));
            txtfilepath.setText(filepath);
        }
    }//GEN-LAST:event_btnBrowseImgActionPerformed

    private void rate_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_1ActionPerformed

    private void rate_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_3ActionPerformed

    private void rate_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_4ActionPerformed

    private void rate_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_5ActionPerformed

    private void txtfilepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilepathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfilepathActionPerformed

    private void deselect_ratebuttonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deselect_ratebuttonsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deselect_ratebuttonsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Product_Image;
    private javax.swing.JLabel addImg;
    private javax.swing.JButton btnBrowseImg;
    private javax.swing.JButton btnSubmitRev;
    private javax.swing.JRadioButton deselect_ratebuttons;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField product_name5;
    private javax.swing.JTextField product_review;
    private javax.swing.JRadioButton rate_1;
    private javax.swing.JRadioButton rate_2;
    private javax.swing.JRadioButton rate_3;
    private javax.swing.JRadioButton rate_4;
    private javax.swing.JRadioButton rate_5;
    private javax.swing.ButtonGroup rate_system;
    private javax.swing.JTextField txtfilepath;
    // End of variables declaration//GEN-END:variables
}
