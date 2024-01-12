/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miterapp;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import miterapp.internal.AddQuestion;
import miterapp.internal.ListQuestion;
import miterapp.internal.ListUser;
import miterapp.internal.AddUser;
import miterapp.repositories.QuestionRepository;
import miterapp.repositories.UserRepoitory;

/**
 *
 * @author begoingtodev
 */
public class MainDashboard extends javax.swing.JFrame {

    java.util.List<String> frmOpening = new ArrayList<>();
    private final UserRepoitory userRepo;
    private final QuestionRepository questionRepo;
    private final ListUser listUser = new ListUser();
    private final ListQuestion listQuestion = new ListQuestion();
    /**
     * Creates new form MainDashboard
     */
    public MainDashboard() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.userRepo = new UserRepoitory();
        this.questionRepo = new QuestionRepository();
        listUser.setItems(this.userRepo.items);
        listUser.setMainDashboard(this);
        listUser.setUserRepo(this.userRepo);
        listQuestion.setItems(this.questionRepo.items);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mListUser = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jDesktopPane1ComponentRemoved(evt);
            }
        });
        jDesktopPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jDesktopPane1ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, 0));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Question");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("List Question");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setText("Add Question");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("User");

        mListUser.setText("List User");
        mListUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListUserActionPerformed(evt);
            }
        });
        jMenu3.add(mListUser);

        jMenuItem4.setText("Add User");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reports");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (!frmOpening.contains(listQuestion.getName())) {
            listQuestion.setName("listQuestion");
            listQuestion.loadDataTable();
            this.showChild(listQuestion);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        var frm = new AddQuestion();
        frm.setListItem(listQuestion);
        frm.setItemRepo(questionRepo);
        frm.setName("addQuestion");
        this.showChild(frm);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jDesktopPane1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentRemoved
        // TODO add your handling code here:
        this.frmOpening.remove(evt.getChild().getName());
        var resetItems = new ArrayList<>();
        resetItems.add("listUser");
        resetItems.add("listQuestion");
        if (resetItems.contains(evt.getChild().getName())) {
            listUser.setItems(new ArrayList<>());
            listQuestion.setItems(new ArrayList<>());
        }
    }//GEN-LAST:event_jDesktopPane1ComponentRemoved

    
    private void mListUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListUserActionPerformed
        // TODO add your handling code here:
        if (!frmOpening.contains(listUser.getName())) {
            listUser.setName("listUser");
            listUser.loadDataTable();
            this.showChild(listUser);
        }
    }//GEN-LAST:event_mListUserActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        var frm = new AddUser();
        frm.setName("addUser");
        frm.setUserRepo(this.userRepo);
        frm.setListUser(listUser);
        this.showChild(frm);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jDesktopPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPane1ComponentShown
        // TODO add your handling code here:
        System.out.println("ComponentShown: Event...");
    }//GEN-LAST:event_jDesktopPane1ComponentShown

    public void showChild(JInternalFrame frm) {
        if (frmOpening.contains(frm.getName())) {
            JOptionPane.showMessageDialog(rootPane, "Your " + frm.getName() + " form is opening...");
            return;
        }
        var noFull = new ArrayList<>();
        noFull.add("addUser");
        noFull.add("updateUser");
        noFull.add("addQuestion");
        try {
            if (noFull.contains(frm.getName())) {

            } else {
                frm.setMaximum(true);
            }
            frm.setClosable(true);
            frm.setMaximizable(true);
            frm.setIconifiable(true);
            frm.setResizable(true);
            this.jDesktopPane1.add(frm).setVisible(true);
            this.frmOpening.add(frm.getName());
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem mListUser;
    // End of variables declaration//GEN-END:variables
}
