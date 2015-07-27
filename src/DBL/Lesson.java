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
public class Lesson {

    String lessonNo;
    String title;
    String Description;
    String Aksharas;
    String PlayAreas;
    String playingFingers;
    String ImagePath;
    byte[] ImageData;
    String videoPath;

    public String getLessonNo() {
        return lessonNo;
    }

    public void setLessonNo(String lessonNo) {
        this.lessonNo = lessonNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getAksharas() {
        return Aksharas;
    }

    public void setAksharas(String Aksharas) {
        this.Aksharas = Aksharas;
    }

    public String getPlayAreas() {
        return PlayAreas;
    }

    public void setPlayAreas(String PlayAreas) {
        this.PlayAreas = PlayAreas;
    }

    public String getPlayingFingers() {
        return playingFingers;
    }

    public void setPlayingFingers(String playingFingers) {
        this.playingFingers = playingFingers;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public byte[] getImageData() {
        return ImageData;
    }

    public void setImageData(byte[] ImageData) {
        this.ImageData = ImageData;
    }
    
    

    public void getLessonData(Lesson lesson, String LessonID) {

        try {
            DBConnection dBConnection = DBConnection.getInstance();

            String SQL = "SELECT * FROM regularlesson WHERE Lesson_ID = " + lesson.getLessonNo() + ";";

            ResultSet resultSet = dBConnection.getValues(SQL);

            if (resultSet.first()) {

                lesson.setLessonNo(resultSet.getString(1));
                lesson.setTitle(resultSet.getString(2));
                lesson.setDescription(resultSet.getString(3));
                lesson.setAksharas(resultSet.getString(4));
                lesson.setPlayingFingers(resultSet.getString(6));
                lesson.setPlayAreas(resultSet.getString(5));
                lesson.setImageData(resultSet.getBytes(7));

            } else {
                new UIL.UIEnhancements().showError(null, "NO DATA");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(Lesson.class.getName()).log(Level.SEVERE, null, ex);
            new UIL.UIEnhancements().showError(null, "Something went wrong in DB operations\n" + ex.getMessage());
        }
    }
}
