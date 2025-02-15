package com.titWeek4Day3GautamRegex.ValidateACreditCardNumber;

import java.util.regex.*;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String[] cardNumbers = {
                "4111111111111111",
                // Valid Visa
                "5105105105105100",
                // Valid MasterCard
                "4111111111111",
                // Invalid Visa (too short)
                "6011111111111117",
                // Invalid
                "5200000000000000"
                // Valid MasterCard
        };

        // Regex for Visa (Starts with 4, has exactly 16 digits)
        String visaRegex = "^4\\d{15}$";

        // Regex for MasterCard (Starts with 5, has exactly 16 digits)
        String masterCardRegex = "^5\\d{15}$";

        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterCardPattern = Pattern.compile(masterCardRegex);

        for (String card : cardNumbers) {
            if (visaPattern.matcher(card).matches()) {
                System.out.println(card + " is a valid Visa card.");
            } else if (masterCardPattern.matcher(card).matches()) {
                System.out.println(card + " is a valid MasterCard.");
            } else {
                System.out.println(card + " is an invalid card number.");
            }
        }
    }
}

