/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HenryDinh
 */
public class UserValidator {
    //Sets the pattern for username
    private Pattern pattern = Pattern.compile("([A-Z][a-z]+[\\s])+[A-Z][a-z]*");
    
    //Checks if username matches the regEx
    public boolean validate(String userName) {
        Matcher match = pattern.matcher(userName); 
        if (match.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
