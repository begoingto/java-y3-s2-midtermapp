/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miterapp;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Image;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import miterapp.models.User;
import miterapp.repositories.UserRepoitory;

/**
 *
 * @author begoingtodev
 */
public class FrmLogin extends javax.swing.JFrame {

    public String path = Paths.get("").toAbsolutePath().toString().concat("/data/imgs");
    private boolean showPwd = false;
    private final UserRepoitory userRepo;

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        userRepo = new UserRepoitory();
//        this.setTitle("Login Form");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
//        System.out.println("Folder"+ files[0]);
        ImageIcon ic = new ImageIcon(this.path + "/login.png");
        Image img = ic.getImage();
        Image newImg = img.getScaledInstance(this.lblRight.getWidth(), lblRight.getHeight(), this.lblRight.getWidth());
        ic = new ImageIcon(newImg);
        this.lblRight.setIcon(ic);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblshowPwd = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lblRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.X_AXIS));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 150));

        jPanel3.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 200, 207));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Exam Online");
        jLabel2.setPreferredSize(new java.awt.Dimension(231, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel1.add(jPanel3);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 138));
        jPanel2.setRequestFocusEnabled(false);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setLayout(new java.awt.BorderLayout());

        txtName.setToolTipText("Username");
        txtName.setPreferredSize(new java.awt.Dimension(64, 40));
        jPanel4.add(txtName, java.awt.BorderLayout.PAGE_END);

        jLabel1.setText("Username");
        jPanel4.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel6.add(jPanel4);

        jPanel7.setPreferredSize(new java.awt.Dimension(231, 15));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("Password");
        jPanel5.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        txtPassword.setPreferredSize(new java.awt.Dimension(64, 40));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel5.add(txtPassword, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel5);

        lblshowPwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblshowPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miterapp/icons/eye-slash-regular.png"))); // NOI18N
        lblshowPwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshowPwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshowPwdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblshowPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblshowPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);

        jPanel8.setPreferredSize(new java.awt.Dimension(400, 45));
        jPanel8.setRequestFocusEnabled(false);

        btnLogin.setBackground(new java.awt.Color(9, 200, 207));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setPreferredSize(new java.awt.Dimension(231, 40));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel8.add(btnLogin);

        jPanel1.add(jPanel8);

        jPanel10.setPreferredSize(new java.awt.Dimension(392, 150));
        jPanel10.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10);

        getContentPane().add(jPanel1);

        jPanel9.setForeground(new java.awt.Color(255, 153, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(400, 417));
        jPanel9.setLayout(new java.awt.BorderLayout());

        lblRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRight.setMaximumSize(new java.awt.Dimension(400, 417));
        lblRight.setMinimumSize(new java.awt.Dimension(400, 417));
        lblRight.setPreferredSize(new java.awt.Dimension(400, 417));
        jPanel9.add(lblRight, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        this.onLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void onLogin() {
        if (txtName.getText().trim().isBlank() || txtPassword.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Username and Password is required.", "Validation", JOptionPane.ERROR_MESSAGE);
            return;
        }
        List<User> users = userRepo.items.stream().filter(u -> u.getUsername().equalsIgnoreCase(txtName.getText().trim())).toList();
        if (users.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Your account does't exist.Please contact Administrator.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        User u = users.get(0);
        if (!u.getPassword().equals(txtPassword.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Password is not correct try again!!!.", "Validation", JOptionPane.ERROR_MESSAGE);
            return;
        }
        switch (u.getRole()) {
            case "ADMIN" ->
                new MainDashboard().setVisible(true);
            default -> {
                var o = new FrmOnlineExam(u);
                o.setVisible(true);
            }
        }
        this.dispose();
    }

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (!txtPassword.getText().isBlank() && evt.getKeyCode() == 10) {
            this.onLogin();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void lblshowPwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblshowPwdMouseClicked
        // TODO add your handling code here:
        this.showPwd = !this.showPwd;
        if (this.showPwd) {
            this.lblshowPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miterapp/icons/eye-regular.png")));
            this.txtPassword.setEchoChar((char) 0);
        } else {
            this.lblshowPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miterapp/icons/eye-slash-regular.png")));
            this.txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_lblshowPwdMouseClicked

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
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put("Button.arc", 8);
            UIManager.put("Component.arc", 8);
            UIManager.put("ProgressBar.arc", 8);
            UIManager.put("TextComponent.arc", 8);
        } catch (UnsupportedLookAndFeelException e) {
//            throw new IllegalAccessError(e.getMessage());
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblRight;
    private javax.swing.JLabel lblshowPwd;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
