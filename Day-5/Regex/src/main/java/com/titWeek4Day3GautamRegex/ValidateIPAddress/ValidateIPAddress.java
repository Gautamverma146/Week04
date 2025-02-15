package com.titWeek4Day3GautamRegex.ValidateIPAddress;

import java.util.regex.*;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String[] ipAddresses = {"192.168.1.1", "256.100.50.25", "10.0.0.1", "123.456.78.90"};

        // Regex pattern to validate an IPv4 address
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        Pattern pattern = Pattern.compile(regex);

        for (String ip : ipAddresses) {
            Matcher matcher = pattern.matcher(ip);
            if (matcher.matches()) {
                System.out.println(ip + " is a valid IPv4 address.");
            } else {
                System.out.println(ip + " is an invalid IPv4 address.");
            }
        }
    }
}

