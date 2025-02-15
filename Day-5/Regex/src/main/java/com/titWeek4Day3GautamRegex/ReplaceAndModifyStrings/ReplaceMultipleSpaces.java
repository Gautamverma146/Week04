package com.titWeek4Day3GautamRegex.ReplaceAndModifyStrings;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "This   is  an    example    with   multiple    spaces.";

        // Replace multiple spaces with a single space
        String modifiedText = text.replaceAll("\\s+", " ");

        System.out.println("Modified Text: " + modifiedText);
    }
}
