/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymenu_swing_app;

/**
 *
 * @author fshaik
 */
public class My_Menu_App extends javax.swing.JFrame {
private double mainIndgredientPrice = 0.0;
private double breadPrice = 0.0; 

public My_Menu_App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        companyName = new javax.swing.JLabel();
        mainIngredients_ComboBox = new javax.swing.JComboBox<>();
        mainIngredient_Label = new javax.swing.JLabel();
        breads_Label = new javax.swing.JLabel();
        breads_ComboBox = new javax.swing.JComboBox<>();
        totalPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        companyName.setBackground(new java.awt.Color(204, 255, 255));
        companyName.setFont(new java.awt.Font("Papyrus", 1, 48)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 153, 153));
        companyName.setText("Priya's Sandwich Shop");
        companyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 5));

        mainIngredients_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicken", "Roast Beef", "Tuna", "Cheese" }));
        mainIngredients_ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mainIngredients_ComboBoxItemStateChanged(evt);
            }
        });

        mainIngredient_Label.setText("Main Ingredients:");

        breads_Label.setText("Breads: ");

        breads_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rye", "White", "Whole-Wheat", "Sour Dough " }));
        breads_ComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                breads_ComboBoxItemStateChanged(evt);
            }
        });

        totalPrice.setFont(new java.awt.Font("Segoe UI Light", 3, 24)); // NOI18N
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(companyName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainIngredient_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(breads_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breads_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainIngredients_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainIngredients_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainIngredient_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breads_Label)
                    .addComponent(breads_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainIngredients_ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mainIngredients_ComboBoxItemStateChanged
        if(evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
                    String mainIngredient = (String)
                            mainIngredients_ComboBox.getSelectedItem();
                    if("Chicken".equals(mainIngredient)){
                                mainIndgredientPrice = 5.0;
                    } else if ("Roast Beef".equals(mainIngredient)){
                                mainIndgredientPrice = 6.5;
                    } else if ("Tuna".equals(mainIngredient)){
                                 mainIndgredientPrice = 4.5;
                    } else if("Cheese".equals(mainIngredient)){
                                 mainIndgredientPrice = 3.0;   
                    }
                    updateTotalPrice();
        }
    }//GEN-LAST:event_mainIngredients_ComboBoxItemStateChanged

    private void breads_ComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_breads_ComboBoxItemStateChanged
             if(evt.getStateChange() == java.awt.event.ItemEvent.SELECTED){
                    String bread = (String)breads_ComboBox.getSelectedItem();
                    if("Rye".equals(bread)){
                                breadPrice = 1.5;
                    } else if ("White".equals(bread)){
                                breadPrice = 1.0;
                    } else if ("Whole-Wheat".equals(bread)){
                                 breadPrice = 1.2;
                    } else if("Sour Dough".equals(bread)){
                                 breadPrice = 3.0;   
                    }
                    updateTotalPrice();
        }
        
        
    }//GEN-LAST:event_breads_ComboBoxItemStateChanged

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPriceActionPerformed
 
    private void updateTotalPrice(){
        double total = mainIndgredientPrice + breadPrice;
        totalPrice.setText("Total Price: R" + total);
    
    }
    
    
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
            java.util.logging.Logger.getLogger(My_Menu_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(My_Menu_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(My_Menu_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(My_Menu_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new My_Menu_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> breads_ComboBox;
    private javax.swing.JLabel breads_Label;
    private javax.swing.JLabel companyName;
    private javax.swing.JLabel mainIngredient_Label;
    private javax.swing.JComboBox<String> mainIngredients_ComboBox;
    private javax.swing.JTextField totalPrice;
    // End of variables declaration//GEN-END:variables
}
