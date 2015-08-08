/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class LessonActivity extends Lesson {

    private String activityID;
    private String activityTitle;
    private String PassingScore;
    String[] BolsToPlay = new String[10];

    public String getActivityID() {
        return activityID;
    }

    public void setActivityID(String activityID) {
        this.activityID = activityID;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getPassingScore() {
        return PassingScore;
    }

    public void setPassingScore(String PassingScore) {
        this.PassingScore = PassingScore;
    }

    public String[] getBolsToPlay() {
        return BolsToPlay;
    }

    public void setBolsToPlay(String[] BolsToPlay) {
        this.BolsToPlay = BolsToPlay;
    }
    
    

    public void getActivityData(LessonActivity lessonActivity, String ActivityID) {

        try {
            DBConnection dBConnection = DBConnection.getInstance();
            
            String SQL = "SELECT * FROM activity WHERE Activity_ID = " + lessonActivity.getActivityID() + ";";
            
            ResultSet resultSet = dBConnection.getValues(SQL);
            
            if (resultSet.first()) {
                
                lessonActivity.setActivityID(resultSet.getString(1));
                lessonActivity.setActivityTitle(resultSet.getString(2));
                lessonActivity.setPassingScore(resultSet.getString(3));
                
                //think for a loop
                lessonActivity.setBolsToPlay(new String[]{resultSet.getString(4),
                resultSet.getString(5),
                resultSet.getString(6),
                resultSet.getString(7),
                resultSet.getString(8),
                resultSet.getString(9),
                resultSet.getString(10),
                resultSet.getString(11),
                resultSet.getString(12),
                resultSet.getString(13)});
            }
        } catch (SQLException ex) {
//            Logger.getLogger(LessonActivity.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
}
