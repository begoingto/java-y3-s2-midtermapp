/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miterapp;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import miterapp.models.Question;
import miterapp.models.Report;
import miterapp.models.User;
import miterapp.repositories.QuestionRepository;
import miterapp.repositories.ReportRepository;
import miterapp.utils.FileManagement;
import miterapp.utils.StringUtils;

/**
 *
 * @author begoingtodev
 */
public class FrmOnlineExam extends javax.swing.JFrame {

    private final QuestionRepository questionRepo;
    Timer timer;
    Integer time;
    Integer indexQ = 0;
    Integer defaultTime = 5;
    Question currentQ;
    Map<Integer, Question> answereds = new HashMap<>();
    private final User auth;
    private final ReportRepository reportRepo;

    /**
     * Creates new form FrmOnlineExam
     *
     * @param user for login user processing online exam
     */
    public FrmOnlineExam(User user) {
        auth = user;
        time = defaultTime;
        initComponents();
        this.setTitle("Form Online Exam");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.questionRepo = new QuestionRepository();
        if (indexQ == 0) {
            btnPrev.setEnabled(false);
        }
        this.reportRepo = new ReportRepository();
        setCurrentQ();
        lblTime.setText("Time: 00:00:" + defaultTime);
        this.lblqSize.setText("Question " + (indexQ + 1) + " of " + questionRepo.items.size());
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //...Perform a task...
                lblTime.setText("Time: 00:00:" + (time--));
                if (indexQ == 0) {
                    btnPrev.setEnabled(false);
                } else {
                    btnPrev.setEnabled(true);
                }
                if (indexQ + 1 == questionRepo.items.size()) {
                    btnNext.setEnabled(false);
                } else {
                    btnNext.setEnabled(true);
                }
                answereds.put(currentQ.getId(), currentQ);
                onNext();
            }
        };
        this.timer = new Timer(1000, taskPerformer);
        this.timer.setRepeats(true);
        this.timer.start();
    }

    public void setCurrentQ() {
        currentQ = questionRepo.items.get(indexQ);
        lblTitle.setText(currentQ.getTitle());
        listAnswer.setListData(currentQ.getAnswers().toArray(new String[0]));
    }

    private void onNext() {
        if (time.equals(0)) {
            indexQ += 1;
            time = defaultTime;
            if (indexQ >= questionRepo.items.size()) {
                btnNext.setEnabled(false);
                timer.stop();
                timer.setRepeats(false);
                this.generateReport();
                int dialog = JOptionPane.showOptionDialog(
                        rootPane,
                        "Congratulations⚜",
                        "Success",
                        0,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new Object[]{
                            "View Result", "Close"
                        }, null);
                if (dialog == 0) {
                    FrmReport report = new FrmReport();
                    report.setAnswered(answereds);
                    report.setVisible(true);
                    this.dispose();
                    return;
                } else {
                    System.exit(0);
                }
            } else {
                lblqSize.setText("Question " + (indexQ + 1) + " of " + questionRepo.items.size());
            }
            setCurrentQ();
            this.answereds.put(currentQ.getId(), currentQ);
        }
    }

    private void generateReport() {
        Report r = new Report();
        r.setUuid(UUID.randomUUID());
        r.setCreatedAt(StringUtils.currentDateTime);
        r.setUser(auth);
        List<Question> arrAnswer = new ArrayList<>(answereds.values());
        r.setQuestions(arrAnswer);
        String filename = StringUtils.getCurrentTime;
        System.out.println("Report: " + r);
        System.out.println("Report:"+ reportRepo.getClazz());
        reportRepo.writeItemsToJson(r, "/reports/"+auth.getUsername(),filename);
    }

    private void onPrev() {
        if (indexQ >= 1) {
            lblqSize.setText("Question " + (indexQ) + " of " + questionRepo.items.size());
            indexQ -= 1;
            time = defaultTime;
            setCurrentQ();
        }
    }

    private void saveReport() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblqSize = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAnswer = new javax.swing.JList<>();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblqSize.setFont(new java.awt.Font("Kantumruy Pro", 0, 14)); // NOI18N
        lblqSize.setText("Question 1 of 20");

        lblTime.setFont(new java.awt.Font("Kantumruy Pro", 0, 14)); // NOI18N
        lblTime.setText("Time: 00:00:17");

        listAnswer.setFont(listAnswer.getFont().deriveFont((float)14));
        listAnswer.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "a) To gain knowledge and skills", "b) To earn a degree for career advancement", "c) To meet new people and expand my social network", "d) Other (please specify)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listAnswer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listAnswer.setToolTipText("");
        listAnswer.setAlignmentY(10.0F);
        listAnswer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listAnswer.setMaximumSize(new java.awt.Dimension(373, 100));
        listAnswer.setMinimumSize(new java.awt.Dimension(373, 100));
        listAnswer.setPreferredSize(new java.awt.Dimension(373, 100));
        listAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listAnswerMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listAnswer);

        btnPrev.setBackground(new java.awt.Color(255, 255, 204));
        btnPrev.setFont(new java.awt.Font("Kantumruy Pro", 0, 14)); // NOI18N
        btnPrev.setText("<< Prev");
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrev.setFocusable(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(9, 200, 207));
        btnNext.setFont(new java.awt.Font("Kantumruy Pro", 0, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next >>");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.setFocusable(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Kantumruy Pro", 0, 14)); // NOI18N
        lblTitle.setText("1.What is your primary motivation for pursuing higher education?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblqSize, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblqSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        time = 0;
        onNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void listAnswerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAnswerMousePressed
        // TODO add your handling code here:
        System.out.println("SelectedAnswered: " + listAnswer.getSelectedIndex());
        currentQ.setAnswered(listAnswer.getSelectedIndex() + 1);
        this.answereds.put(currentQ.getId(), currentQ);
    }//GEN-LAST:event_listAnswerMousePressed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        time = 0;
        onPrev();
    }//GEN-LAST:event_btnPrevActionPerformed

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
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmOnlineExam().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblqSize;
    private javax.swing.JList<String> listAnswer;
    // End of variables declaration//GEN-END:variables
}
