package com.titWeek4Day3GautamRegex.ValidateUserName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User name:");
        String usernames = sc.nextLine();
        if(validateUsername(usernames)){
            //displayed if user name is valid
            System.out.println(usernames + " Your User name is valid you can use it");
        }
        else{
            //displayed if user name is invalid
            System.out.println("Invalid User name: "+ usernames);
        }


    }
    public static boolean validateUsername(String username){
        //check if username enter is not null
        if (username == null) {
            return false;
        }
//regex for username Validating
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
