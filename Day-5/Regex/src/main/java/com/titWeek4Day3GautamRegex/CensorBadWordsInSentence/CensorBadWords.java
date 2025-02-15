package com.titWeek4Day3GautamRegex.CensorBadWordsInSentence;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

        // List of bad words to censor
        String[] badWords = {"damn", "stupid"};

        // Replace bad words with ****
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        System.out.println("Censored Text: " + text);
    }
}
