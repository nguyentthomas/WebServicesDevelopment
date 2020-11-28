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
public class PassValidator {

    // Establishes the pattern for password
    private Pattern pattern = Pattern.compile(".{8}");

    // Checks if the password matches the regEx
    public boolean validate(String password) {
        Matcher match = pattern.matcher(password);
        if (match.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
