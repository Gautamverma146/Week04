package com.titWeek4Day3GautamRegex.ExtractCapitalizedWords;

import java.util.regex.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-z]*\\b";  // Match capitalized words

        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}
