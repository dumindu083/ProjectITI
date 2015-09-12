/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import BPL.MusicPlayer;
import BPL.SoundRecorder;
import DBL.Lesson;
import DBL.LessonActivity;
import DBL.Student;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

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
     * Creates new form Activity
     */
    public Activity(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        new UIEnhancements().setIcon((JFrame) this.getParent());

        btnStarttBol.setText("Start");
        btnRecord.setEnabled(true);
        
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

        this.bols = lessonActivity.getBolsToPlay();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblActivityNumber = new javax.swing.JLabel();
        lblLesson = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPassingScore = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblActivityTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnStarttBol = new javax.swing.JButton();
        btnConfim = new javax.swing.JButton();
        txtBolToPlay = new javax.swing.JTextField();
        txtUserBol = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnRecord = new javax.swing.JButton();
        lblRecFeedback = new javax.swing.JLabel();
        btnListen = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGoBack = new javax.swing.JButton();
        btnGotoRegPlan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ITI - Activity for Lesson ");
        setName("about"); // NOI18N
        setResizable(false);

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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLesson, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(lblActivityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassingScore)
                            .addComponent(lblActivityTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evaluation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Feedback");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Status");

        btnStarttBol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnStarttBol.setText("Start");
        btnStarttBol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarttBolActionPerformed(evt);
            }
        });

        btnConfim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConfim.setText("Confirm");
        btnConfim.setEnabled(false);
        btnConfim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfimActionPerformed(evt);
            }
        });

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

        jButton1.setText("Done");

        btnRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIL/record.png"))); // NOI18N
        btnRecord.setToolTipText("Start Record");
        btnRecord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecord.setPreferredSize(new java.awt.Dimension(33, 9));
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        lblRecFeedback.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnListen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIL/play.png"))); // NOI18N
        btnListen.setToolTipText("Listen Record");
        btnListen.setEnabled(false);
        btnListen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListen.setPreferredSize(new java.awt.Dimension(33, 9));
        btnListen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListenActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Bol:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStarttBol)
                            .addComponent(jLabel12)
                            .addComponent(btnListen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnConfim, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBolToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRecFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(33, 33, 33)
                            .addComponent(txtStatus))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUserBol, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStarttBol)
                    .addComponent(btnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtBolToPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListen, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUserBol, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
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

        btnGotoRegPlan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGotoRegPlan.setText("Go to Regular Lesson Plan");
        btnGotoRegPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotoRegPlanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGotoRegPlan))
                    .addComponent(btnGoBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGotoRegPlan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIL/tablaIcon150.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void repeatBolsPlay(int currentBolNo) {
        txtBolToPlay.setText(this.bols[currentBolNo]);
        if (!btnRecord.isEnabled()) {
            btnRecord.setEnabled(true);
        }
        if (!txtUserBol.getText().isEmpty()) {
            txtUserBol.setText("");
        }
    }

    private void getBolsPlay(int BolNo) {
        txtBolToPlay.setText(this.bols[BolNo]);
        if (!btnRecord.isEnabled()) {
            btnRecord.setEnabled(true);
        }
        if (!txtUserBol.getText().isEmpty()) {
            txtUserBol.setText("");
        }
    }

    private void btnGotoRegPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotoRegPlanActionPerformed
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

    }//GEN-LAST:event_btnGotoRegPlanActionPerformed

    private void btnStarttBolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarttBolActionPerformed

        int currentBolNo = 0;

        if (currentBolNo == 0) {
            txtBolToPlay.setText(this.bols[currentBolNo]);
            txtUserBol.grabFocus();
            if(!btnRecord.isEnabled()) btnRecord.setEnabled(true);
            lblRecFeedback.setText("");
            btnStarttBol.setText("Redo");
        } else {
            new UIEnhancements().showError(null, "Error in getting the right bol");
        }
    }//GEN-LAST:event_btnStarttBolActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnConfimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfimActionPerformed
        // TODO add your handling code here:
        txtUserBol.setText("Processing...");
    }//GEN-LAST:event_btnConfimActionPerformed

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        // TODO add your handling code here:

        btnRecord.setEnabled(false);
        txtUserBol.setForeground(Color.LIGHT_GRAY);

        lblRecFeedback.setText("Recorded");

        SoundRecorder soundRecorder = new SoundRecorder();

        Thread stopper = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Activity.class.getName()).log(Level.ERROR, null, ex);
                }
                soundRecorder.finish(btnListen, btnConfim);

            }
        });
        stopper.start();

        soundRecorder.start();

    }//GEN-LAST:event_btnRecordActionPerformed

    private void btnListenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListenActionPerformed
        // TODO add your handling code here:
        MusicPlayer musicPlayer = new MusicPlayer();
        
        musicPlayer.playRecord();
    }//GEN-LAST:event_btnListenActionPerformed

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
    private javax.swing.JButton btnConfim;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnGotoRegPlan;
    private javax.swing.JButton btnListen;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnStarttBol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblActivityNumber;
    private javax.swing.JLabel lblActivityTitle;
    private javax.swing.JLabel lblLesson;
    private javax.swing.JLabel lblPassingScore;
    private javax.swing.JLabel lblRecFeedback;
    private javax.swing.JTextField txtBolToPlay;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtUserBol;
    // End of variables declaration//GEN-END:variables
}
