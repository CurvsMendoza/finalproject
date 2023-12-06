/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Date;

/**
 *
 * @author julian
 */
public class receipt extends javax.swing.JFrame {

    /**
     * Creates new form receipt
     */
    public receipt() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        accountid = new javax.swing.JTextField();
        unitid = new javax.swing.JTextField();
        bills = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("RECEIPT SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(860, 120, 360, 43);

        jLabel2.setText("Full Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 220, 77, 20);

        jLabel3.setText("Contact Number:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 270, 121, 20);

        jLabel4.setText("Account ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 330, 85, 20);

        jLabel5.setText("Unit ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 380, 57, 20);

        jLabel6.setText("Bill to be payed:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 440, 115, 20);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(740, 210, 178, 26);
        getContentPane().add(number);
        number.setBounds(740, 270, 178, 26);
        getContentPane().add(accountid);
        accountid.setBounds(740, 320, 178, 26);
        getContentPane().add(unitid);
        unitid.setBounds(740, 380, 178, 26);
        getContentPane().add(bills);
        bills.setBounds(740, 440, 178, 26);

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(930, 180, 386, 374);

        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 490, 57, 29);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(760, 490, 71, 29);

        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(850, 490, 65, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/backgroundforpayment.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-2150, -40, 4230, 1110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        area.setText("       *********************************\n");
        area.setText(area.getText()+"   *           Payment Receipt            *\n");
        area.setText(area.getText()+"      **********************************\n");
        
        Date obj = new Date();
        
        String Date = obj.toString();
        
        area.setText(area.getText()+"\n"+Date+"\n\n");
        area.setText(area.getText()+"Full Name:"+name.getText()+"\n\n");
        area.setText(area.getText()+"Contact Number"+number.getText()+"\n\n");
        area.setText(area.getText()+"Account ID:"+accountid.getText()+"\n\n");
        area.setText(area.getText()+"Unit ID:"+unitid.getText()+"\n\n");
        area.setText(area.getText()+"Total Amount Payed:"+bills.getText()+"\n\n");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        area.setText("");
        name.setText("");
        number.setText("");
        accountid.setText("");
        unitid.setText("");
        bills.setText("");




    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       try{
           area.print();
          }
       catch (Exception e)
       {
       
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

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
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountid;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField bills;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JTextField unitid;
    // End of variables declaration//GEN-END:variables
}