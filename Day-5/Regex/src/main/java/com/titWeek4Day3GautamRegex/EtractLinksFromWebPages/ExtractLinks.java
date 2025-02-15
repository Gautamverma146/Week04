package com.titWeek4Day3GautamRegex.EtractLinksFromWebPages;

import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regex to match URLs starting with http or https
        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}

