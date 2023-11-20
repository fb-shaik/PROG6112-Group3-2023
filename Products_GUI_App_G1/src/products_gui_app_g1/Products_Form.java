/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products_gui_app_g1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author fshaik
 */
public class Products_Form extends javax.swing.JFrame {

    /**
     * Creates new form Products_Form
     */
    public Products_Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productID_Label = new javax.swing.JLabel();
        productName_Label = new javax.swing.JLabel();
        productPrice_Label = new javax.swing.JLabel();
        productID_TextField = new javax.swing.JTextField();
        productName_TextField = new javax.swing.JTextField();
        productPrice_TextField = new javax.swing.JTextField();
        productsOnFile_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        products_TextArea = new javax.swing.JTextArea();
        save_Button = new javax.swing.JButton();
        search_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Products Form");

        productID_Label.setText("Product ID:");

        productName_Label.setText("Product Name:");

        productPrice_Label.setText("Product Price:");

        productsOnFile_Label.setText("Products on File:");

        products_TextArea.setEditable(false);
        products_TextArea.setColumns(20);
        products_TextArea.setRows(5);
        jScrollPane1.setViewportView(products_TextArea);

        save_Button.setText("Save to text file");
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });

        search_Button.setText("Search the text file");
        search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName_Label)
                    .addComponent(productID_Label)
                    .addComponent(productPrice_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productPrice_TextField)
                    .addComponent(productName_TextField)
                    .addComponent(productID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productsOnFile_Label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(save_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search_Button)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(productsOnFile_Label)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productID_Label)
                            .addComponent(productID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productName_Label)
                            .addComponent(productName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productPrice_Label)
                            .addComponent(productPrice_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(save_Button)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(search_Button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        //holds user input thats captured in the 3 text fields
        String productID = productID_TextField.getText().trim();
        String productName = productName_TextField.getText().trim();
        String productPrice = productPrice_TextField.getText().trim(); 
        
        
        if(!productID.isEmpty() && !productName.isEmpty() && !productPrice.isEmpty()){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter("Products.txt",true))){
                            bw.write(productID + " , " + productName + " ,  R "+ productPrice);
                            bw.newLine();
                            bw.flush();
                            JOptionPane.showMessageDialog(null, "Product details saved to file");
            } catch (IOException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error saving product details to file");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Please enter details for all the fields");
        }
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_ButtonActionPerformed
        String inputProductID = JOptionPane.showInputDialog("Enter a Product ID: ");
        if(inputProductID !=null && !inputProductID.trim().isEmpty()){
                try(BufferedReader br = new BufferedReader(new FileReader("Products.txt"))){
                    String line;     
                    boolean found = false;
                          
                         
                         while((line = br.readLine()) !=null){
                                String [] product = line.split(",");
                                if(product[0].trim().equals(inputProductID.trim())){
                                        //Append the product to the text area 
                                        products_TextArea.append("\nProduct ID: " + product[0] + 
                                                                                              "\nProduct Name: " + product[1] + 
                                                                                                "\nProduct Price: " + product[2] + "\n");
                                        found = true;
                                        break;
                                }
                         }
                         if(!found){
                         products_TextArea.append("\nProduct not found in text file");
                         }
                         
                } catch (IOException ex) {
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error reading product details for text file");
            }
        } else{
                JOptionPane.showMessageDialog(null, "Please enter a Product ID: ");
        }
    }//GEN-LAST:event_search_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Products_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productID_Label;
    private javax.swing.JTextField productID_TextField;
    private javax.swing.JLabel productName_Label;
    private javax.swing.JTextField productName_TextField;
    private javax.swing.JLabel productPrice_Label;
    private javax.swing.JTextField productPrice_TextField;
    private javax.swing.JLabel productsOnFile_Label;
    private javax.swing.JTextArea products_TextArea;
    private javax.swing.JButton save_Button;
    private javax.swing.JButton search_Button;
    // End of variables declaration//GEN-END:variables
}
