package com.titWeek4Day3GautamRegex.ValidateAHexColorCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAhexColorCode {
    //main method
    public static void main(String[] args) {
        //String array of hex color codes
        String[] hexColorCodes = {"#ff0011", "#AA1000", "#MP04"};
        //regex to validate hex color code
        String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Pattern pattern = Pattern.compile(regex);
      //  Matcher matcher = pattern.matcher(hexColorCodes);
        for(String hexColorCode : hexColorCodes){
            Matcher matcher = pattern.matcher(hexColorCode);
            if(matcher.matches()){
                System.out.println("Hex color Code: "+ hexColorCode+ " Is Valid");
            }
            else {
                //thiis will execute if hex color will not matches with regex
                //while hex color code "#MP04" will come Invalid will display
                System.out.println("Hex color Code: "+ hexColorCode+ " Is Invalid");
            }
        }

    }

}
