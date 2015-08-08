/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIL;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;

/**
 *
 * @author hp
 */
public class Validator {

    /**
     * Checks whether user entered email is valid or not
     * 
     * @param email Address to be validated
     * @return true if it is a valid email, false it isn't a valid email
     */
    protected boolean validateEmail(String email) {

        boolean status = false;

        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean isEmpty(String text) {

        boolean status;

        if (text.isEmpty()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    
    /**
     * Returns true if the text contains Apostrophe 
     * @param text
     * @return
     */
    public boolean containsApo(String text){
        
        boolean status;
        
        if (text.contains("'"))
            status = true;
        else
            status = false;
        return status;
    }

    public boolean isMatching(char[] password, char[] confirmPassword) {

        boolean status;

        String pwd = String.valueOf(password);
        String pwd2 = String.valueOf(confirmPassword);

        if (pwd.equals(pwd2)) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean isItemSelected(JComboBox comboBoxName) {

        boolean status;

        if (comboBoxName.getSelectedIndex() != -1) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean isNumeric(String number) {//method to check if a string is numeric or not
        try {
            double d = Double.parseDouble(number);

        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    
    public boolean isWithinRange(String number, int min, int max){
        
        int value = Integer.parseInt(number);
        boolean status = value >= min && value <= max;
        if (status) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    /**
     *  Checks whether the provided String has enough number of characters given under length
     * 
     * 
     * @param text String to be evaluated
     * @param length Number of characters
     * @return true if the text contains enough number of characters specified under length, false if it doesn't
     */
    public boolean hasEnoughChar(String text, int length) {

        boolean status;

        if (text.length() >= length) {
            status = true;
        } else {
            status = false;
        }
        return status;

    }

    /**
     *
     * @param username
     * @param password
     * @return
     */
    public boolean verifyAdmin(String username, String password) {

        boolean status;

        if (username.equals("admin") && password.equals("admin@iti")) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

}
