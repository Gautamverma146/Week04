package com.titWeek4Day3GautamStreams.CountWordsInAFile;

import java.io.*;
import java.util.*;

public class CountWords {

    public static void main(String[] args) throws IOException {
        String fileName = "C:/Gautam/Week-4/Day-3/Streams/src/main/java/com/titWeek4Day3GautamStreams/CountWordsInAFile/words.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            Map<String, Integer> wordCounts = new HashMap<>();
            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", ""); // Keep only alphanumeric and spaces
                // Split by any whitespace
                String[] words = line.split("\\s+");

                for (String word : words) {
                    // Skip empty strings
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort words by frequency (descending)
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
            sortedWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Display top 5 words
            System.out.println("Top 5 most frequent words:");
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedWords) {
                if (count < 5) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    count++;
                } else {
                    // Stop after top 5
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
