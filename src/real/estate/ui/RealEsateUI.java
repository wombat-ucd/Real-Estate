/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.estate.ui;

import com.alee.extended.panel.GroupPanel;
import com.alee.extended.time.ClockType;
import com.alee.extended.time.WebClock;
import com.alee.laf.WebLookAndFeel;
import com.alee.managers.notification.NotificationIcon;
import com.alee.managers.notification.NotificationManager;
import com.alee.managers.notification.WebNotificationPopup;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JLabel;
import real.estate.dao.ListHouse;
import real.estate.dao.impl.SortedList;
import real.estate.io.HouseFile;
/**
 *
 * @author Chathu
 */
public class RealEsateUI extends javax.swing.JFrame {

    private SortedList propertyList = new SortedList();
    ListHouse house;
    private final static int NOTIFICATION_TIME = 3000;

    /**
     * Creates new form RealEsateUI
     */
    public RealEsateUI() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(this.getClass().getResource("/real/estate/res/logo.png")).getImage());
        try {
            //HouseFile.writeJSONToFile(propertyList);
            propertyList = HouseFile.readJSONFileToList();
        } catch (IOException ex) {
            Logger.getLogger(RealEsateUI.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        ListHouse newHouse = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
        return newHouse;
    }

    private void clearHouse() {
        txtLotNumber.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPrice.setText("");
        txtSqFt.setText("");
        txtNumberOfBedrooms.setText("");
        
    }

    private void showNotification(String message, Icon icon) {

        WebNotificationPopup notificationPopup = new WebNotificationPopup();
        notificationPopup.setIcon(NotificationIcon.clock);
        notificationPopup.setDisplayTime(NOTIFICATION_TIME);
        WebClock clock = new WebClock();
        clock.setClockType(ClockType.timer);
        clock.setTimeLeft(NOTIFICATION_TIME - 1000);
        notificationPopup.setIcon(icon);
        JLabel label = new JLabel(message);
        notificationPopup.setContent(new GroupPanel(1, label));

        NotificationManager.setLocation(NotificationManager.NORTH_EAST);
        NotificationManager.showNotification(notificationPopup);
        clock.start();

    }

    private void showInformationNotification(String message) {
        showNotification(message, NotificationIcon.information.getIcon());
        
    }

    private void showSuccessNotification(String message) {
        showNotification(message, NotificationIcon.plus.getIcon());
       
    }

    private void showErrorNotification(String message) {
        showNotification(message, NotificationIcon.error.getIcon());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblNumberOfBedrooms = new javax.swing.JLabel();
        lblSqFt = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLotNumber = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtLotNumber = new javax.swing.JFormattedTextField();
        txtFirstName = new javax.swing.JFormattedTextField();
        txtLastName = new javax.swing.JFormattedTextField();
        txtPrice = new javax.swing.JFormattedTextField();
        txtSqFt = new javax.swing.JFormattedTextField();
        txtNumberOfBedrooms = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Real Estate");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(127, 140, 141));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumberOfBedrooms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumberOfBedrooms.setText("Number of Bedrooms:");
        panel.add(lblNumberOfBedrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        lblSqFt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSqFt.setText("Square Feet:");
        panel.add(lblSqFt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrice.setText("Price:");
        panel.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLastName.setText("Last Name:");
        panel.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFirstName.setText("First Name:");
        panel.add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblLotNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLotNumber.setText("Lot Number:");
        panel.add(lblLotNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        btnFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/res/find.png"))); // NOI18N
        btnFind.setText("Find");
        btnFind.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFind.setIconTextGap(10);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        panel.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 160, 30));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/res/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.setIconTextGap(10);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 30));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/res/next.png"))); // NOI18N
        btnNext.setText("Next");
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNext.setIconTextGap(10);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panel.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 160, 30));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/res/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd.setIconTextGap(10);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panel.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 160, 30));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/res/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClear.setIconTextGap(10);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panel.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 160, 30));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/res/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReset.setIconTextGap(10);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panel.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 160, 30));

        txtLotNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLotNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLotNumberActionPerformed(evt);
            }
        });
        panel.add(txtLotNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, -1));

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        panel.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, -1));

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        panel.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        panel.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        txtSqFt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSqFt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSqFtActionPerformed(evt);
            }
        });
        panel.add(txtSqFt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 190, -1));

        txtNumberOfBedrooms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel.add(txtNumberOfBedrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 190, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearHouse();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        propertyList.reset();
        if (propertyList.lengthIs() == 0) {
            clearHouse();
        } else {
            house = (ListHouse) propertyList.getNextItem();
            showHouse(house);
        }
        showInformationNotification("List reset!");
        

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (propertyList.lengthIs() == 0) {
           
            showInformationNotification("List is empty!");
        } else {
            house = (ListHouse) propertyList.getNextItem();
            showHouse(house);
           
            showSuccessNotification("Next house displayed!");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();                     // Close window 
        try {
            //Save Data Before closing
            HouseFile.writeJSONToFile(propertyList);
        } catch (IOException ex) {
            Logger.getLogger(RealEsateUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.exit(0);
        }

    }//GEN-LAST:event_formWindowClosing

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            house = getHouse();
            if (propertyList.isThere(house)) {
                
                showErrorNotification("Lot number already in use!");
            } else {
                propertyList.insert(house);
               
                showSuccessNotification("House added to list!");
            }
        } catch (NumberFormatException badHouseData) {
            // Text field info incorrectly formated 
            
            showErrorNotification("Number? " + badHouseData.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            house = getHouse();
            if (propertyList.isThere(house)) {
                propertyList.delete(house);

                
                showSuccessNotification("House deleted!");
            } else {
                showInformationNotification("Lot number not on list!");
               
            }
        } catch (NumberFormatException badHouseData) {
            
            showErrorNotification("Number? " + badHouseData.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        int lotNumber;
        try {
            lotNumber = Integer.parseInt(txtLotNumber.getText());
            house = new ListHouse("", "", lotNumber, 0, 0, 0);
            if (propertyList.isThere(house)) {
                house = (ListHouse) propertyList.retrieve(house);
                showHouse(house);
                
                showSuccessNotification("House found!");
            } else {
                showInformationNotification("House not found!");
                
            }
        } catch (NumberFormatException badHouseData) {
            // Text field info incorrectly formated 
            
            showErrorNotification("Number? " + badHouseData.getMessage());
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        txtSqFt.requestFocus();
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtLotNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLotNumberActionPerformed
        txtFirstName.requestFocus();
    }//GEN-LAST:event_txtLotNumberActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        txtLastName.requestFocus();
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        txtPrice.requestFocus();
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtSqFtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSqFtActionPerformed
        txtNumberOfBedrooms.requestFocus();
    }//GEN-LAST:event_txtSqFtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Web look and feel */
        //<editor-fold defaultstate="collapsed" desc="Web Look and feel setting code ">

        WebLookAndFeel.install();
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
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLotNumber;
    private javax.swing.JLabel lblNumberOfBedrooms;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSqFt;
    private javax.swing.JPanel panel;
    private javax.swing.JFormattedTextField txtFirstName;
    private javax.swing.JFormattedTextField txtLastName;
    private javax.swing.JFormattedTextField txtLotNumber;
    private javax.swing.JFormattedTextField txtNumberOfBedrooms;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtSqFt;
    // End of variables declaration//GEN-END:variables
}
