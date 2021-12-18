/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataBase.TableOwner;
import javax.swing.JOptionPane;

/**
 *
 * @author mouloud
 */
public class LogInOwner extends javax.swing.JFrame {

    /**
     * Creates new form LogInOwner
     */
    public LogInOwner() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Owner = new javax.swing.JPanel();
        OwnerFirstNameLabel = new javax.swing.JLabel();
        OwnerFirstNameField = new javax.swing.JTextField();
        OwnerLastNameLabel = new javax.swing.JLabel();
        OwnerLastNameField = new javax.swing.JTextField();
        OwnerPasswordLabel = new javax.swing.JLabel();
        OwnerLogInButton = new javax.swing.JButton();
        OwnerPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Owner.setBackground(new java.awt.Color(255, 255, 255));

        OwnerFirstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OwnerFirstNameLabel.setText("First Name");

        OwnerLastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OwnerLastNameLabel.setText("Last Name");

        OwnerPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OwnerPasswordLabel.setText("Password");

        OwnerLogInButton.setText("Log In");
        OwnerLogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwnerLogInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OwnerLayout = new javax.swing.GroupLayout(Owner);
        Owner.setLayout(OwnerLayout);
        OwnerLayout.setHorizontalGroup(
            OwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OwnerLayout.createSequentialGroup()
                .addGroup(OwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OwnerLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(OwnerLogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OwnerLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(OwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OwnerFirstNameField)
                            .addComponent(OwnerLastNameField)
                            .addComponent(OwnerFirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(OwnerLastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OwnerPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OwnerPasswordField))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        OwnerLayout.setVerticalGroup(
            OwnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OwnerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OwnerFirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OwnerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OwnerLastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OwnerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OwnerPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OwnerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OwnerLogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Owner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Owner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OwnerLogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwnerLogInButtonActionPerformed
        // TODO add your handling code here:
        TableOwner temp = new TableOwner();
        boolean var = temp.ChercherData(OwnerFirstNameField.getText(), OwnerLastNameField.getText(), OwnerPasswordField.getText());
        if (var == true){
            JOptionPane.showMessageDialog(null,"conneted");
            new AddAdmin();
        }

        else
        JOptionPane.showMessageDialog(null,"Erreur");
    }//GEN-LAST:event_OwnerLogInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogInOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInOwner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Owner;
    private javax.swing.JTextField OwnerFirstNameField;
    private javax.swing.JLabel OwnerFirstNameLabel;
    private javax.swing.JTextField OwnerLastNameField;
    private javax.swing.JLabel OwnerLastNameLabel;
    private javax.swing.JButton OwnerLogInButton;
    private javax.swing.JPasswordField OwnerPasswordField;
    private javax.swing.JLabel OwnerPasswordLabel;
    // End of variables declaration//GEN-END:variables
}