/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 *
 * @author hp
 */
public class Student extends Admin {

    String PriorExpereince;
    String BasicLessonStat;
    int NumberOfLessonsCovered;
    int CurrentLesson;
    String DateRegistred;
    
    private Logger logger = Logger.getLogger(Student.class);

    public String getBasicLessonStat() {
        return BasicLessonStat;
    }

    public void setBasicLessonStat(String BasicLessonStat) {
        this.BasicLessonStat = BasicLessonStat;
    }

    public String getDateRegistred() {
        return DateRegistred;
    }

    public void setDateRegistred(String DateRegistred) {
        this.DateRegistred = DateRegistred;
    }

    public String getPriorExpereince() {
        return PriorExpereince;
    }

    public void setPriorExpereince(String PriorExpereince) {
        this.PriorExpereince = PriorExpereince;
    }

    public int getNumberOfLessonsCovered() {
        return NumberOfLessonsCovered;
    }

    public void setNumberOfLessonsCovered(int NumberOfLessonsCovered) {
        this.NumberOfLessonsCovered = NumberOfLessonsCovered;
    }

    public int getCurrentLesson() {
        return CurrentLesson;
    }

    public void setCurrentLesson(int CurrentLesson) {
        this.CurrentLesson = CurrentLesson;
    }

    public boolean findStudentByID(Student student) {

        try {
            DBConnection dBConnection = DBConnection.getInstance();

            String SQL = "SELECT * FROM student WHERE Student_ID = " + student.getUserID() + ";";

            ResultSet resultSet = dBConnection.getValues(SQL);

            if (student.getUserID().equals(resultSet.getString(1))) {

                student.setUserID(resultSet.getString(1));
                student.setFirstName(resultSet.getString(2));
                student.setLastName(resultSet.getString(3));
                student.setGender(resultSet.getString(4));
                student.setEmail(resultSet.getString(5));
                student.setUsername(resultSet.getString(6));
                student.setPassword(resultSet.getString(7));
                student.setPriorExpereince(resultSet.getString(8));
                student.setCurrentLesson(resultSet.getInt(9));
                student.setNumberOfLessonsCovered(resultSet.getInt(10));
                student.setDateRegistred(resultSet.getDate(11).toString());
                student.setBasicLessonStat(resultSet.getString(12));
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {

            if (ex.getMessage().equals("Illegal operation on empty result set.")) {
                new UIL.UIEnhancements().showError(null, "The student you search can't be found!");
                logger.info("No Student found!!", ex);
            } else {
                new UIL.UIEnhancements().showError(null, "Something went wrong in writing to the DB");
                logger.error("Error in DB Operation", ex);
            }
            return false;
        }

    }

    public void updateStudentBasics(Student student) {

        DBConnection dBConnection = DBConnection.getInstance();

        String SQL = "UPDATE  `iti`.`student` SET  `BasicLessonStat` =  'Done' WHERE  `student`.`Student_ID` =" + student.getUserID() + ";";

        try {
            dBConnection.insertValues(SQL);
        } catch (SQLException ex) {
            logger.error("Error in DB Operations", ex);
            new UIL.UIEnhancements().showError(null, "Something went wrong in writing to the DB");
        }
    }

    public void updateStudentCurrentLesson(Student student) {

        DBConnection dBConnection = DBConnection.getInstance();

        String SQL;

        if (student.getCurrentLesson() == 0) {
            SQL = "UPDATE  `iti`.`student` SET  `CurrentLesson` =  '1' WHERE  `student`.`Student_ID` =" + student.getUserID() + ";";
        } else {
            SQL = "UPDATE  `iti`.`student` SET  `CurrentLesson` =  ' " + (student.getCurrentLesson() + 1) + " ' WHERE  `student`.`Student_ID` =" + student.getUserID() + ";";
        }
        try {
            dBConnection.insertValues(SQL);
        } catch (SQLException ex) {
            logger.error("Error in DB Operations", ex);
            new UIL.UIEnhancements().showError(null, "Something went wrong in writing to the DB");
        }
    }

}
