/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import DBL.Lesson;
import DBL.LessonActivity;
import DBL.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

/**
 *
 * @author hp
 */
public class Activity extends javax.swing.JDialog {

    private Lesson lesson;
    private RegularLesson RegualarLesson;
    private Student student;
    private JFrame welcomeFrame;
    private LessonActivity lessonActivity;
    private String[] bols;

    /**
     * Creates new form About
     */
    public Activity(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        new UIEnhancements().setIcon("tablaIcon.png", (JFrame) this.getParent());

        btnNextBol.setText("Start");

    }

    /**
     *
     * @param parent
     * @param modal
     * @param lesson Lesson object needed to be passed to update activity info
     * @param student Student object needed to be passed to get the info about a
     * student for the activity
     * @param lessonActivity
     */
    public Activity(java.awt.Frame parent, boolean modal, Lesson lesson, Student student, LessonActivity lessonActivity, JFrame welcomeFrame) {
        this(parent, modal);
        this.lesson = lesson;
        this.student = student;
        this.welcomeFrame = welcomeFrame;
        this.lessonActivity = lessonActivity;

        //insert code for a lesson object to be used
        lblLesson.setText(lesson.getTitle());
        
        //taken from the lessonActivity object
        lblActivityNumber.setText(lessonActivity.getActivityID());
        
        lblActivityTitle.setText(lessonActivity.getActivityTitle());
        lblPassingScore.setText(lessonActivity.getPassingScore());
        String[] bols = lessonActivity.getBolsToPlay();

        this.bols = bols;
        this.setTitle(this.getTitle() + lesson.getLessonNo());
        
    }

    public Activity(java.awt.Frame parent, boolean modal, Lesson lesson, LessonActivity lessonActivity, JDialog RegularLesson) {
        this(parent, modal);

        this.lesson = lesson;
        this.lessonActivity = lessonActivity;

        //taken from the lesson object
        lblLesson.setText(lesson.getTitle());

        //taken from the lessonActivity object
        lblActivityNumber.setText(lessonActivity.getActivityID());
        lblActivityTitle.setText(lessonActivity.getActivityTitle());
        lblPassingScore.setText(lessonActivity.getPassingScore());
        String[] bols = lessonActivity.getBolsToPlay();

        this.bols = bols;

        this.setTitle(this.getTitle() + lesson.getLessonNo());
        this.RegualarLesson = (RegularLesson) RegularLesson;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblBolNo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnNextBol = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtBolNo = new javax.swing.JTextField();
        txtBolToPlay = new javax.swing.JTextField();
        txtUserBol = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblActivityNumber = new javax.swing.JLabel();
        lblLesson = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPassingScore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblActivityTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnGoBack = new javax.swing.JButton();
        btnGotoLessonRegPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ITI - Activity for Lesson ");
        setName("about"); // NOI18N
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblBolNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBolNo.setText("Bol No: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Bol to Play:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Your Turn: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Status");

        btnNextBol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNextBol.setText(" Next Bol");
        btnNextBol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextBolActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtBolNo.setEditable(false);
        txtBolNo.setBackground(new java.awt.Color(255, 255, 255));
        txtBolNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBolNo.setText("0 of 10");

        txtBolToPlay.setEditable(false);
        txtBolToPlay.setBackground(new java.awt.Color(255, 255, 255));
        txtBolToPlay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtUserBol.setEditable(false);
        txtUserBol.setBackground(new java.awt.Color(255, 255, 255));
        txtUserBol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserBol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNextBol, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(lblBolNo)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtBolToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUserBol, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtBolNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBolNo)
                    .addComponent(txtBolNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBolToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUserBol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNextBol)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Activity No:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Lesson regarded:");

        lblActivityNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblActivityNumber.setText("...");

        lblLesson.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLesson.setText("Lesson Here");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Passing Score:");

        lblPassingScore.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPassingScore.setText("Passing Score Here");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Activity Title:");

        lblActivityTitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblActivityTitle.setText("Title Here");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblActivityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLesson, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(lblPassingScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblActivityTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblActivityNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLesson)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblActivityTitle)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblPassingScore, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnGoBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        btnGotoLessonRegPlan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGotoLessonRegPlan.setText("Go to Regular Lesson Plan");
        btnGotoLessonRegPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoLessonRegPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGotoLessonRegPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGotoLessonRegPlan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGotoLessonRegPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoLessonRegPlanActionPerformed
        // TODO add your handling code here:
        if (this.student != null) {
            WelcomeITI witi = (WelcomeITI) this.welcomeFrame;
            
            RegularLessonPlan regularLessonPlan = new RegularLessonPlan(student, witi);
            new UIEnhancements().showWindow(regularLessonPlan);
            regularLessonPlan.setAlwaysOnTop(true);
            this.dispose();
        } else {
            new UIEnhancements().goBackTwice(this, RegualarLesson);
        }

    }//GEN-LAST:event_btnGotoLessonRegPlanActionPerformed

    private void btnNextBolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextBolActionPerformed

        int currentBolNo = Integer.parseInt(String.valueOf(txtBolNo.getText().charAt(0)));

        switch (currentBolNo) {
            case 0:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                txtUserBol.grabFocus();
                btnNextBol.setText("Next");
                break;
            case 1:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 2:
                txtBolToPlay.setText(this.bols[currentBolNo]);

                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 3:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 4:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 5:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 6:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 7:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 8:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                break;
            case 9:
                txtBolToPlay.setText(this.bols[currentBolNo]);
                txtBolNo.setText(String.valueOf(++currentBolNo + " of 10"));
                btnNextBol.setText("Finish");
                btnNextBol.setEnabled(false);
                break;

            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_btnNextBolActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Activity dialog = new Activity(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    @Override
    protected JRootPane createRootPane() {
        ActionListener actionListener = (ActionEvent e) -> {
            dispose();
        };
        JRootPane rootPane = new JRootPane();
        KeyStroke stroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        rootPane.registerKeyboardAction(actionListener, stroke, JComponent.WHEN_IN_FOCUSED_WINDOW);
        return rootPane;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnGotoLessonRegPlan;
    private javax.swing.JButton btnNextBol;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblActivityNumber;
    private javax.swing.JLabel lblActivityTitle;
    private javax.swing.JLabel lblBolNo;
    private javax.swing.JLabel lblLesson;
    private javax.swing.JLabel lblPassingScore;
    private javax.swing.JTextField txtBolNo;
    private javax.swing.JTextField txtBolToPlay;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtUserBol;
    // End of variables declaration//GEN-END:variables
}
