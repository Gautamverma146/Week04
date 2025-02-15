package com.titWeek4Day3GautamRegex.ExtractCurrencyValueFromText;

import java.util.regex.*;
import java.util.ArrayList;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regex to match currency values (optional $ sign, followed by numbers)
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> currencyValues = new ArrayList<>();

        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        // Print extracted currency values
        System.out.println(String.join(", ", currencyValues));
    }
}
