/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package miterapp.internal;

import java.util.UUID;
import javax.swing.JOptionPane;
import miterapp.models.User;
import miterapp.repositories.UserRepoitory;

/**
 *
 * @author begoingtodev
 */
public class AddUser extends javax.swing.JInternalFrame {

    private UserRepoitory userRepo;
    private ListUser listUser;
    User user = new User();
    private Integer userIndex;
    private boolean showPwd = false;    
    private boolean showConfirm = false;


    /**
     * Creates new form AddUser
     */
    public AddUser() {
        initComponents();
        UUID uuid = UUID.randomUUID();
        this.txtUuid.setText(uuid.toString());
        txtPassword.setRequestFocusEnabled(true);
        txtConfirmPassword.setRequestFocusEnabled(true);
    }

    public void setUserRepo(UserRepoitory repo) {
        this.userRepo = repo;
    }

    public void setListUser(ListUser listData) {
        this.listUser = listData;
    }

    public void setUserIndex(Integer ind) {
        this.userIndex = ind;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUuid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        lblshowPwd = new javax.swing.JLabel();
        lblshowConfirm = new javax.swing.JLabel();

        jLabel2.setText("UUID");

        txtUuid.setEditable(false);

        jLabel3.setText("Username");

        jLabel4.setText("Full Name");

        jLabel5.setText("Gender");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel6.setText("Password");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Role");
        jLabel7.setToolTipText("");
        jLabel7.setPreferredSize(new java.awt.Dimension(24, 30));

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "STUDENT" }));

        btnAdd.setBackground(new java.awt.Color(9, 200, 207));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtPassword.setRequestFocusEnabled(false);

        jLabel8.setText("Confirm Password");

        txtConfirmPassword.setRequestFocusEnabled(false);

        btnClear.setBackground(new java.awt.Color(255, 153, 153));
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblshowPwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblshowPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miterapp/icons/eye-slash-regular.png"))); // NOI18N
        lblshowPwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshowPwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshowPwdMouseClicked(evt);
            }
        });

        lblshowConfirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblshowConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miterapp/icons/eye-slash-regular.png"))); // NOI18N
        lblshowConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblshowConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblshowConfirmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear))
                    .addComponent(cbRole, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConfirmPassword)
                    .addComponent(cbGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUuid, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addComponent(txtFullName)
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblshowPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblshowConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUuid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblshowPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblshowConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        user.setUsername(this.txtUsername.getText());
        user.setFullName(this.txtFullName.getText());
        user.setGender(this.cbGender.getSelectedItem().toString());
        user.setPassword(this.txtPassword.getText());
        user.setRole(this.cbRole.getSelectedItem().toString());
        if (this.user.getUuid() == null) {
            user.setUuid(UUID.fromString(this.txtUuid.getText()));
            this.userRepo.addUser(user);
            this.listUser.addItem(user);
            JOptionPane.showMessageDialog(rootPane, "You have been add successfully");
        } else {
            user.setUuid(UUID.fromString(this.txtUuid.getText()));
            this.userRepo.updateUser(this.userIndex, user);
            this.listUser.setUpdateItem(this.userIndex, user);
            JOptionPane.showMessageDialog(rootPane, "You have been update successfully");
            this.dispose();
        }
        this.clearForm();
        //        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling codes here:
        if (this.user.getUuid() == null) {
            this.clearForm();
        } else {
            this.userRepo.deleteUser(user);
            this.listUser.removeItem(this.userIndex);
            JOptionPane.showMessageDialog(rootPane, "You have been Delete successfully:");
            this.dispose();
        }
    }//GEN-LAST:event_btnClearActionPerformed

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

    private void lblshowConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblshowConfirmMouseClicked
        // TODO add your handling code here:
        this.showConfirm = !this.showConfirm;
        if (this.showConfirm) {
            this.lblshowConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miterapp/icons/eye-regular.png")));
            this.txtConfirmPassword.setEchoChar((char) 0);
        } else {
            this.lblshowConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miterapp/icons/eye-slash-regular.png")));
            this.txtConfirmPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_lblshowConfirmMouseClicked

    public void setUserToField(User user) {
        this.user = user;
        this.btnAdd.setText("Update");
        this.btnClear.setText("Delete");
        this.txtUuid.setText(user.getUuid().toString());
        this.txtUsername.setText(user.getUsername());
        this.txtFullName.setText(user.getFullName());
        this.txtPassword.setText(user.getPassword());
        if (user.getGender().equalsIgnoreCase("male")) {
            this.cbGender.setSelectedIndex(0);
        } else {
            this.cbGender.setSelectedIndex(1);
        }
        if (user.getRole().equalsIgnoreCase("Admin")) {
            this.cbRole.setSelectedIndex(0);
        } else {
            this.cbRole.setSelectedIndex(1);
        }
    }

    private void clearForm() {
        this.txtUuid.setText(UUID.randomUUID().toString());
        this.txtUsername.setText("");
        this.txtFullName.setText("");
        this.txtPassword.setText("");
        this.txtConfirmPassword.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblshowConfirm;
    private javax.swing.JLabel lblshowPwd;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUuid;
    // End of variables declaration//GEN-END:variables
}
