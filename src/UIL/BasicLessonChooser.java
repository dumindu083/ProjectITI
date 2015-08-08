/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import DBL.Admin;
import DBL.BLesson;
import DBL.Student;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author hp
 */
public class BasicLessonChooser extends javax.swing.JFrame {

    private Student student;

    private JFrame welcomFrame;
    private Admin admin;

    /**
     * Creates new form WelcomeScreen
     */
    public BasicLessonChooser() {
        initComponents();
        new UIEnhancements().setIcon("tablaIconFull.png", this);
        btnAllDone.setEnabled(false);
    }

    public BasicLessonChooser(Student student, JFrame welcomeITI) {
        this();
        this.student = student;
        this.welcomFrame = welcomeITI;
        btnAllDone.setEnabled(true);

    }

    public BasicLessonChooser(Admin admin, JFrame welcomeITI) {
        this();
        this.admin = admin;
        this.welcomFrame = welcomeITI;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPosture = new javax.swing.JButton();
        btnWhatBols = new javax.swing.JButton();
        btnBolsBoth = new javax.swing.JButton();
        btnBolsDayan = new javax.swing.JButton();
        btnParts = new javax.swing.JButton();
        btnPlaceHands = new javax.swing.JButton();
        btnBolsBayan = new javax.swing.JButton();
        btnTuning = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnAllDone = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        itemWelcome = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemRegular = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemLogout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Basic Lessons");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Click on any lesson you wish to go through");

        btnPosture.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPosture.setText("Posture");
        btnPosture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostureActionPerformed(evt);
            }
        });

        btnWhatBols.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnWhatBols.setText("What are Bols?");
        btnWhatBols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhatBolsActionPerformed(evt);
            }
        });

        btnBolsBoth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBolsBoth.setText("Bols from the Both");
        btnBolsBoth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolsBothActionPerformed(evt);
            }
        });

        btnBolsDayan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBolsDayan.setText("Bols from Dayan");
        btnBolsDayan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolsDayanActionPerformed(evt);
            }
        });

        btnParts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnParts.setText("Parts of a Tabla");
        btnParts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartsActionPerformed(evt);
            }
        });

        btnPlaceHands.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPlaceHands.setText("Place Hands on Tabla");
        btnPlaceHands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceHandsActionPerformed(evt);
            }
        });

        btnBolsBayan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBolsBayan.setText("Bols from Bayan");
        btnBolsBayan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolsBayanActionPerformed(evt);
            }
        });

        btnTuning.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTuning.setText("Tuning your Tabla");
        btnTuning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWhatBols, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPosture, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBolsDayan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBolsBayan, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBolsBoth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnParts, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlaceHands, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTuning, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBolsBayan, btnBolsBoth, btnBolsDayan, btnPosture, btnWhatBols});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPosture, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParts, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceHands, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTuning, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBolsDayan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBolsBoth, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBolsBayan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWhatBols, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("You can go through these basic level lessons anytime...");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Important", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnAllDone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAllDone.setText("All Done!");
        btnAllDone.setToolTipText("Click me if you are done with basics");
        btnAllDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllDoneActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("We recommend you to click on this button, if you have completed all the basic lessons. Clicking this will enable");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("button. (if you are not done with basics)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("you to enter to the regular lessons. Also, we strongly advise you not to go for regular lessons just by clicking this ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAllDone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAllDone)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("ITI");

        jMenu3.setText("Go to");

        itemWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIL/welcome.png"))); // NOI18N
        itemWelcome.setText("Welcome");
        itemWelcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemWelcomeActionPerformed(evt);
            }
        });
        jMenu3.add(itemWelcome);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIL/lesson.png"))); // NOI18N
        jMenu4.setText("Lessons");

        itemRegular.setText("Regular");
        itemRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegularActionPerformed(evt);
            }
        });
        jMenu4.add(itemRegular);

        jMenu3.add(jMenu4);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator1);

        itemLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIL/logout.png"))); // NOI18N
        itemLogout.setText("Log out");
        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(itemLogout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        itemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UIL/info.png"))); // NOI18N
        itemAbout.setText("About ITI");
        itemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAboutActionPerformed(evt);
            }
        });
        jMenu2.add(itemAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogoutActionPerformed
        // TODO add your handling code here:
        if (this.student != null) {
            new DBL.Admin().logoutITI(this, this.welcomFrame, new LoginScreen());
        } else {
            new DBL.Admin().logoutITI(this, this.welcomFrame, new LoginScreenAdmin());
        }
    }//GEN-LAST:event_itemLogoutActionPerformed

    private void itemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAboutActionPerformed
        // TODO add your handling code here:
        new UIEnhancements().showAboutUs(this);

    }//GEN-LAST:event_itemAboutActionPerformed

    private void itemRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegularActionPerformed
        // TODO add your handling code here:
        if (this.student != null) {
            new UIEnhancements().showWindow(this, new RegularLessonPlan(student, welcomFrame));
        } else {
            new UIEnhancements().showWindow(this, new RegularLessonPlan(admin, welcomFrame));
        }
    }//GEN-LAST:event_itemRegularActionPerformed

    private void itemWelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemWelcomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_itemWelcomeActionPerformed

    private void btnPlaceHandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceHandsActionPerformed
        // TODO add your handling code here:

        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("3");
        bLesson.setTitle(btnPlaceHands.getText()); // Remove this once the everything is right
        bLesson.getLessonData(bLesson, "3");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));
    }//GEN-LAST:event_btnPlaceHandsActionPerformed

    private void btnBolsBothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolsBothActionPerformed
        // TODO add your handling code here:
        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("8");
        bLesson.setTitle(btnBolsBoth.getText()); // Remove this once the everything is right
        bLesson.getLessonData(bLesson, "8");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));
    }//GEN-LAST:event_btnBolsBothActionPerformed

    private void btnPartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartsActionPerformed
        // TODO add your handling code here:
        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("2");
        bLesson.setTitle(btnParts.getText()); // Remove this once the everything is right
        bLesson.getLessonData(bLesson, "2");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));
    }//GEN-LAST:event_btnPartsActionPerformed

    private void btnBolsBayanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolsBayanActionPerformed
        // TODO add your handling code here:
        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("7");
        bLesson.setTitle(btnBolsBayan.getText()); // Remove this once the everything is right
        bLesson.getLessonData(bLesson, "7");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));
    }//GEN-LAST:event_btnBolsBayanActionPerformed

    private void btnAllDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllDoneActionPerformed
        // TODO add your handling code here:
        if (student.getBasicLessonStat().equals("Undone")) {
            student.setBasicLessonStat("Done");
            student.updateStudentBasics(student);
            WelcomeITI witi = (WelcomeITI) this.welcomFrame;
            witi.lblBasic.setText(student.getBasicLessonStat());
            witi.btnCurrentActivity.setEnabled(true);
            if (student.getCurrentLesson() == 0) {
                student.setCurrentLesson(1);
                student.updateStudentCurrentLesson(student);
                witi.lblCurrentLesson.setText(String.valueOf(student.getCurrentLesson()));
            }
            new UIEnhancements().showFeedback(this, "Congratulations! You're now allowed to proceed with lessons at ITI");
            this.dispose();
        } else {
            new UIEnhancements().showFeedback(this, "You're already done with basics");
        }

    }//GEN-LAST:event_btnAllDoneActionPerformed

    private void btnPostureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostureActionPerformed
        // TODO add your handling code here:

        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("1");
        bLesson.getLessonData(bLesson, "1");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));

    }//GEN-LAST:event_btnPostureActionPerformed

    private void btnTuningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuningActionPerformed
        // TODO add your handling code here:
        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("4");
        bLesson.setTitle(btnTuning.getText()); // Remove this once the everything is right
        bLesson.getLessonData(bLesson, "4");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));
    }//GEN-LAST:event_btnTuningActionPerformed

    private void btnWhatBolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhatBolsActionPerformed
        // TODO add your handling code here:
        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("5");
        bLesson.setTitle(btnWhatBols.getText()); // Remove this once the everything is right
        bLesson.getLessonData(bLesson, "5");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));
    }//GEN-LAST:event_btnWhatBolsActionPerformed

    private void btnBolsDayanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolsDayanActionPerformed
        // TODO add your handling code here:
        BLesson bLesson = new BLesson();

        bLesson.setLessonNo("6");
        bLesson.setTitle(btnBolsDayan.getText()); // Remove this once the everything is right
        bLesson.getLessonData(bLesson, "6");
        new UIEnhancements().showDialog(new BasicLesson(this, true, bLesson));
    }//GEN-LAST:event_btnBolsDayanActionPerformed

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
            java.util.logging.Logger.getLogger(BasicLessonChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicLessonChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllDone;
    private javax.swing.JButton btnBolsBayan;
    private javax.swing.JButton btnBolsBoth;
    private javax.swing.JButton btnBolsDayan;
    private javax.swing.JButton btnParts;
    private javax.swing.JButton btnPlaceHands;
    private javax.swing.JButton btnPosture;
    private javax.swing.JButton btnTuning;
    private javax.swing.JButton btnWhatBols;
    private javax.swing.JMenuItem itemAbout;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemRegular;
    private javax.swing.JMenuItem itemWelcome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
