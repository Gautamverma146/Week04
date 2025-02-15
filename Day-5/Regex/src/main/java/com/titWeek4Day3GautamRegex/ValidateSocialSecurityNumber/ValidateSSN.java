package com.titWeek4Day3GautamRegex.ValidateSocialSecurityNumber;

import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String[] ssnNumbers = {
                "123-45-6789",  // Valid
                "987-65-4321",  // Valid
                "123456789",    // Invalid (missing dashes)
                "12-345-6789",  // Invalid (wrong format)
                "123-456-789"   // Invalid (wrong format)
        };

        // SSN format: XXX-XX-XXXX (3 digits - 2 digits - 4 digits)
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        for (String ssn : ssnNumbers) {
            Matcher matcher = pattern.matcher(ssn);
            if (matcher.matches()) {
                System.out.println(" \"" + ssn + "\" is valid");
            } else {
                System.out.println(" \"" + ssn + "\" is invalid");
            }
        }
    }
}

