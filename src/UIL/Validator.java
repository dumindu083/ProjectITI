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

    public boolean validateEmail(String email) {

        boolean status = false;

//        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-­]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\­.[A-Za-z]{2,})$";
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
    
    public boolean isEmpty(String firstName){
        
        boolean status;
        
        if (firstName.isEmpty()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    
    public boolean isMatching(char[] password, char[] confirmPassword){
        
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
    
    public boolean isItemSelected(JComboBox comboBoxName){
        
        boolean status;
        
        if (comboBoxName.getSelectedIndex() != -1) {
            status =true;
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
    

}
