package com.titWeek4Day3GautamRegex.ValidateLicenceVehiclePlateNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateVehicleLicencePlateNumber {
    public static void main(String[] args) {
        String[] vehiclePlateNumbers = {"MP1212", "MH10", "MP0404"};
        String regex = "^[A-Z]{2}\\d{4}$"; // Allows 2 to 4 digits
        Pattern pattern = Pattern.compile(regex);

        for (String number : vehiclePlateNumbers) {
            Matcher matcher = pattern.matcher(number);

            if (matcher.matches()) {
                System.out.println(number + " is Valid");
            } else {
                //It will give MH10 as invalid
                System.out.println(number + " is Invalid");
            }
        }
    }
}
