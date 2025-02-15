package com.titWeek4Day3GautamRegex.ExtractEmailFromText;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    //main method
    public static void main(String[] args) {
        //text where we finnd email address
        String text = "my name is gautam verma gautamofficial@gmail.com is my emailId, my brother name is Sidhharth verma siddharthofficial@gmail.com is his emailid";
       // regex pattern
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            //display one by one extracted emails
            System.out.println("Extracted Email Addresses : " + matcher.group());
        }

    }

}
