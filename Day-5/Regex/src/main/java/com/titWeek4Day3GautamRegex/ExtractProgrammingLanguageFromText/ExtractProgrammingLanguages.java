package com.titWeek4Day3GautamRegex.ExtractProgrammingLanguageFromText;

import java.util.regex.*;
import java.util.ArrayList;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // List of common programming languages
        String[] languages = {"Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "Swift", "Kotlin"};

        ArrayList<String> extractedLanguages = new ArrayList<>();

        for (String language : languages) {
            String regex = "\\b" + language + "\\b"; // Ensures full word match
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                extractedLanguages.add(language);
            }
        }

        // Print extracted languages
        System.out.println(String.join(", ", extractedLanguages));
    }
}

