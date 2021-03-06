/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignUp;

import Dao.UserDao;
import LoginForm.LogIn;
import LoginForm.User;
import javax.swing.JOptionPane;

/**
 *
 * @author aDMIN
 */
public class ForgotPassword extends javax.swing.JFrame {
    private String dbAnswer = null;
    private String email = null;
    public String emailPattern = "^[a-zA-z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
        txtSecQuestion.setEditable(false);
    }

    public void clear() {
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
        txtEmail.setEditable(true);
        txtEmail.setText("");
        txtSecQuestion.setText("");
        txtAnswer.setText("");
        txtNewPass.setText("");
    }
    
    public void validateEmail() {
        email = txtEmail.getText();
        if (email.matches(emailPattern)) {
            btnSearch.setEnabled(true);
        } else {
            btnSearch.setEnabled(false);
        }
    }
    
    public void validateFields() {
        String password = txtNewPass.getText();
        String answer = txtAnswer.getText();
        String securityQuestion = txtSecQuestion.getText();
        if(!password.equals("") && !answer.equals("") && !securityQuestion.equals("")) 
            btnUpdate.setEnabled(true);
         else 
            btnUpdate.setEnabled(false);
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSecQuestion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAnswer = new javax.swing.JTextField();
        txtNewPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel4.setText("Security Question");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel5.setText("Your Answer");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel6.setText("Enter New Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtSecQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecQuestionKeyReleased(evt);
            }
        });
        jPanel1.add(txtSecQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, -1));

        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        jPanel1.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, -1));

        txtNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPassKeyReleased(evt);
            }
        });
        jPanel1.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-30.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 120, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 132, 585, 220));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 69, -1, -1));

        btnSignUp.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 18, -1, -1));

        btnLogin.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 18, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 18, -1, -1));

        btnClear.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 18, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 377, 590, 130));

        jPanel3.setBackground(new java.awt.Color(192, 192, 192));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 24)); // NOI18N
        jLabel1.setText("FORGOT PASWORD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 678, 70));

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 680, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSecQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecQuestionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtSecQuestionKeyReleased

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void txtNewPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPassKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNewPassKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
         int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String answer = txtAnswer.getText();
        String newPassword = txtNewPass.getText();
        if (answer.equals(dbAnswer)) {
            UserDao.update(email, newPassword);
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=D\"color:red\">Incorrect Answer</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed
  }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         email = txtEmail.getText();
        User user = null;
        UserDao.getSecurityQuestion(email);
        if(user == null)   
        {
        JOptionPane.showMessageDialog (null,"<html><b style=\"color:red\">Incorrect Email</b></html>","Message", JOptionPane.ERROR_MESSAGE);
        }
        else{
            btnSearch.setEnabled(false);
            txtEmail.setEditable(false);
            dbAnswer = user.getAnswer();
            txtSecQuestion.setText(user.getSecurityQuestion());
            validateFields();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
         // TODO add your handling code here:
        setVisible(false);
        new Signup().setVisible(true);

    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        new LogIn().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JTextField txtSecQuestion;
    // End of variables declaration//GEN-END:variables
}
