/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.ui;

import javax.swing.JOptionPane;
import real.estate.dao.ListHouse;
import real.estate.dao.impl.SortedList;

/**
 *
 * @author Chathu
 */
public class RealEsateUI extends javax.swing.JFrame {

    private SortedList list = new SortedList();
    ListHouse house;

    /**
     * Creates new form RealEsateUI
     */
    public RealEsateUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // Display information about parameter house on screen 
    private void showHouse(ListHouse house) {
        txtLotNumber.setText(Integer.toString(house.lotNumber()));
        txtFirstName.setText(house.firstName());
        txtLastName.setText(house.lastName());
        txtPrice.setText(Integer.toString(house.price()));
        txtSqFt.setText(Integer.toString(house.squareFeet()));
        txtNumberOfBedrooms.setText(Integer.toString(house.numberOfBedRooms()));
    }

    // Returns current screen information as a ListHouse 
    private ListHouse getHouse() {
        String lastName;
        String firstName;
        int lotNumber;
        int price;
        int squareFeet;
        int bedRooms;
        lotNumber = Integer.parseInt(txtLotNumber.getText());
        firstName = txtFirstName.getText();
        lastName = txtLastName.getText();
        price = Integer.parseInt(txtPrice.getText());
        squareFeet = Integer.parseInt(txtSqFt.getText());
        bedRooms = Integer.parseInt(txtNumberOfBedrooms.getText());
        ListHouse house = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
        return house;
    }

    private void clearHouse() {
        txtLotNumber.setText("");
        txtFirstName.setText("");
        txtFirstName.setText("");
        txtPrice.setText("");
        txtSqFt.setText("");
        txtNumberOfBedrooms.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSqFt = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLotNumber = new javax.swing.JTextField();
        txtNumberOfBedrooms = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Real Estate");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 260, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Number of Bedrooms:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Square Feet:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("First Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Lot Number:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));
        jPanel1.add(txtSqFt, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 220, 190, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 180, 190, -1));
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 140, 190, -1));
        jPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 100, 190, -1));

        txtLotNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotNumberActionPerformed(evt);
            }
        });
        jPanel1.add(txtLotNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 60, 190, -1));
        jPanel1.add(txtNumberOfBedrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 260, 190, -1));

        btnFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFind.setText("Find");
        jPanel1.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 160, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 160, -1));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, -1));

        jButton7.setText("jButton1");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearHouse();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        list.reset();
        if (list.lengthIs() == 0) {
            clearHouse();
        } else {
            house = (ListHouse) list.getNextItem();
            showHouse(house);
        }
        lblStatus.setText("List reset");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (list.lengthIs() == 0) {
            lblStatus.setText("list is empty!");
        } else {
            house = (ListHouse) list.getNextItem();
            showHouse(house);
            lblStatus.setText("Next house displayed");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtLotNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLotNumberActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();                     // Close window 
        //Save Data Before closing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            house = getHouse();
            if (list.isThere(house)) {
                lblStatus.setText("Lot number already in use");
            } else {
                list.insert(house);
                lblStatus.setText("House added to list");
            }
        } catch (NumberFormatException badHouseData) {
            // Text field info incorrectly formated 
            lblStatus.setText("Number? " + badHouseData.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            house = getHouse();
            if (list.isThere(house)) {
                list.delete(house);
                lblStatus.setText("House deleted");
            } else {
                lblStatus.setText("Lot number not on list");
            }
        } catch (NumberFormatException badHouseData) {
            lblStatus.setText("Number? " + badHouseData.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(RealEsateUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealEsateUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealEsateUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealEsateUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealEsateUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLotNumber;
    private javax.swing.JTextField txtNumberOfBedrooms;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSqFt;
    // End of variables declaration//GEN-END:variables
}
