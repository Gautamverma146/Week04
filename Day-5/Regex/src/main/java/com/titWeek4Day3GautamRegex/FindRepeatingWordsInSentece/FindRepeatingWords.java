package com.titWeek4Day3GautamRegex.FindRepeatingWordsInSentece;

import java.util.regex.*;
import java.util.HashSet;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regex to find repeating words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatingWords = new HashSet<>();

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        // Print repeating words
        System.out.println(String.join(", ", repeatingWords));
    }
}

