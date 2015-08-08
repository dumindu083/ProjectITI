/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

import UIL.UIEnhancements;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class Admin {

    String UserID;
    String FirstName;
    String LastName;
    String Gender;

    String Email;
    String Username;
    String Password;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean loginITI(Admin admin, String person) {
        DBConnection dBConnection = DBConnection.getInstance();

        try {

            String SQL = "SELECT * FROM " + person + " WHERE Username = '" + admin.getUsername() + "' AND Password = '" + admin.getPassword() + "';";

            ResultSet resultSet = dBConnection.getValues(SQL);

            if (resultSet.first()) {

                admin.setUserID(resultSet.getString(1));
                admin.setFirstName(resultSet.getString(2));
                admin.setLastName(resultSet.getString(3));
                admin.setGender(resultSet.getString(4));
                admin.setEmail(resultSet.getString(5));
                admin.setUsername(resultSet.getString(6));
                admin.setPassword(resultSet.getString(7));

                return true;

            } else {
                return false;
            }
        } catch (SQLException ex) {
//            ex.printStackTrace();
            new UIL.UIEnhancements().showError(null, "Something went wrong in DB operations");
            return false;
        }

    }

    public boolean loginITI(Student student, String person) {

        DBConnection dBConnection = DBConnection.getInstance();

        try {

            String SQL = "SELECT * FROM " + person + " WHERE Username = '" + student.getUsername() + "' AND Password = '" + student.getPassword() + "';";

            ResultSet resultSet = dBConnection.getValues(SQL);

            if (resultSet.first()) {

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
//            ex.printStackTrace();
            new UIL.UIEnhancements().showError(null, "Something went wrong in DB operations");
            return false;
        }
    }

    public void registerITI(Admin admin, JFrame window) {

        DBConnection dBConnection = DBConnection.getInstance();

        String SQL = "INSERT INTO `iti`.`admin` (`FirstName`, `LastName`, `Gender`, `Email`, `Username`, `Password`) VALUES ('" + admin.getFirstName() + ""
                + "', '" + admin.getLastName()
                + "', '" + admin.getGender()
                + "', '" + admin.getEmail()
                + "', '" + admin.getUsername()
                + "', '" + admin.getPassword()
                + "');";

        try {
            dBConnection.insertValues(SQL);
            new UIL.UIEnhancements().showFeedback(window, "You've registered as an admin for ITI!");
        } catch (SQLException e) {
//            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace(); // Set up proper msg to the user...
            if (e.getMessage().contains("Duplicate entry")) {
                new UIL.UIEnhancements().showWarning(window, "Please, try out a different username");
            } else {
                new UIL.UIEnhancements().showError(window, "Something went wrong in writing to the DB");
            }
        }

    }

    public void registerITI(Student student, JFrame window) {

        DBConnection dBConnection = DBConnection.getInstance();

        String SQL = "INSERT INTO `iti`.`student` (`FirstName`, `LastName`, `Gender`, `Email`, `Username`, `Password`, `PriorExperience`, `CurrentLesson`, `NoOfLessonsDone`, `DateRegistered`, `BasicLessonStat`) VALUES ('" + student.getFirstName() + ""
                + "', '" + student.getLastName()
                + "', '" + student.getGender()
                + "', '" + student.getEmail()
                + "', '" + student.getUsername()
                + "', '" + student.getPassword()
                + "', '" + student.getPriorExpereince()
                + "', '" + student.getCurrentLesson()
                + "', '" + student.getNumberOfLessonsCovered()
                + "', '" + student.getDateRegistred()
                + "', '" + student.getBasicLessonStat()
                + "');";

        try {
            dBConnection.insertValues(SQL);
            new UIL.UIEnhancements().showFeedback(window, "Account created successfully...\nThank you for registering with ITI!s");
        } catch (SQLException e) {
//            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            if (e.getMessage().contains("Duplicate entry")) {
                new UIL.UIEnhancements().showWarning(window, "Please, try out a different username");
            } else {
                new UIL.UIEnhancements().showError(window, "Something went wrong in writing to the DB");
            }
            
        }

    }

    public void updateAccount(Admin admin, JFrame window) {

        DBConnection dBConnection = DBConnection.getInstance();

        String SQL = "UPDATE admin SET FirstName = '"
                + admin.getFirstName() + "',"
                + "LastName = '" + admin.getLastName() + "',"
                + "Gender = '" + admin.getGender() + "',"
                + "Email = '" + admin.getEmail() + "',"
                + "Password = '" + admin.getPassword() + "'"
                + "WHERE ADMIN_ID = " + admin.getUserID() + ";";

        try {
            dBConnection.insertValues(SQL);
            new UIL.UIEnhancements().showFeedback(window, "Account updated successfully!");
        } catch (SQLException ex) {
//            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            new UIL.UIEnhancements().showError(window, "Something went wrong in writing to the DB");
        }
    }

    public void updateAccount(Student student, JFrame window) {

        DBConnection dBConnection = DBConnection.getInstance();

        String SQL = "UPDATE student SET FirstName = '"
                + student.getFirstName() + "',"
                + "LastName = '" + student.getLastName() + "',"
                + "Gender = '" + student.getGender() + "',"
                + "Email = '" + student.getEmail() + "',"
                + "Password = '" + student.getPassword() + "'"
                + "WHERE Student_ID = " + student.getUserID() + ";";

        try {
            dBConnection.insertValues(SQL);
            new UIL.UIEnhancements().showFeedback(window, "Account updated successfully!");
        } catch (SQLException ex) {
//            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            new UIL.UIEnhancements().showError(window, "Something went wrong in writing to the DB");
        }
    }
    
    public void logoutITI(JFrame currentWindow, JFrame underlyingWindow, JFrame loginWindow){
        
        new UIEnhancements().showWindow(currentWindow, loginWindow);
        underlyingWindow.dispose();
        
    }
    
     public boolean hasUsername(String Username, String tableName){
        
        try {
            DBConnection dBConnection = DBConnection.getInstance();
            
            String SQL = "SELECT * FROM " + tableName + " WHERE Username = '" + Username + "';";

            ResultSet resultSet = dBConnection.getValues(SQL);
            
            return resultSet.first();
        } catch (SQLException ex) {
            new UIEnhancements().showError(null, "Error in Database operations");
            return false;
        }
        
    }
    
}
