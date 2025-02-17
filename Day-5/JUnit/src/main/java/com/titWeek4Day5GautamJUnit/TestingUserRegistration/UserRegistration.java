package com.titWeek4Day5GautamJUnit.TestingUserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.length() < 3) {
            throw new IllegalArgumentException("Username must be at least 3 characters long.");
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (email == null || !Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        if (password == null || password.length() < 8 ||
                !password.matches(".*[A-Z].*") || !password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, contain one uppercase letter, and one digit.");
        }
    }
}

