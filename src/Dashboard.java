/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_agency;

import Sheroq.feedbackgui;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author reyam alshini
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    
    Connection con =null;
    
    public Dashboard() {
        initComponents();
        con=DB.con();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Welcome to our Travel Agency");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 565, -1));

        add2.setBackground(new java.awt.Color(153, 0, 51));
        add2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add2.setForeground(new java.awt.Color(255, 255, 255));
        add2.setText("Exit");
        add2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add2MouseEntered(evt);
            }
        });
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        getContentPane().add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 204, 89));

        add3.setBackground(new java.awt.Color(153, 0, 51));
        add3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add3.setForeground(new java.awt.Color(255, 255, 255));
        add3.setText("Explore Our Agency");
        add3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add3MouseEntered(evt);
            }
        });
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        getContentPane().add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 301, 89));

        jTextArea2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("The agency provides multiple booking options to search through such as booking a flight,\nBooking a hotel room, booking for a tour, or renting a car which is done through filtration. \nThe customer can choose all types of bookings at once or he can choose his own preferred booking options.\nThe system also offers customized traveling bundles and discounts for the customer.");
        jTextArea2.setCaretColor(new java.awt.Color(240, 240, 240));
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 859, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Give Feedback");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 240, 90));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel_agency/Agency.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add2MouseEntered

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed

            JOptionPane.showMessageDialog(this, "Goodbye :)");
        System.exit(0);
    }//GEN-LAST:event_add2ActionPerformed

    private void add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add3MouseEntered

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        Home_Page ob1=new Home_Page();
            ob1.setVisible(true);
            dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_add3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        feedbackgui f1 = new feedbackgui();
        f1.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
