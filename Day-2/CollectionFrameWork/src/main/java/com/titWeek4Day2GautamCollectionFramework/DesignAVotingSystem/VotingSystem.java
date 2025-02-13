package com.titWeek4Day2GautamCollectionFramework.DesignAVotingSystem;

import java.util.*;

class VotingSystem {
    // HashMap to store votes
    private Map<String, Integer> voteMap;
    // Maintains order of votes
    private LinkedHashMap<String, Integer> voteOrderMap;
    // Stores results in sorted order
    private TreeMap<String, Integer> sortedVoteMap;

    public VotingSystem() {
        voteMap = new HashMap<>();
        voteOrderMap = new LinkedHashMap<>();
        sortedVoteMap = new TreeMap<>();
    }

    // Cast a vote for a candidate
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteMap.get(candidate));
        sortedVoteMap.put(candidate, voteMap.get(candidate));
    }

    // Display votes in the order they were cast
    public void displayVoteOrder() {
        System.out.println("\nVotes in Order of Casting:");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display results in alphabetical order
    public void displaySortedResults() {
        System.out.println("\nSorted Voting Results:");
        for (Map.Entry<String, Integer> entry : sortedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Display the winner(s)
    public void displayWinner() {
        int maxVotes = Collections.max(voteMap.values());
        System.out.println("\nWinner(s) with " + maxVotes + " votes:");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() == maxVotes) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display voting data
        // Order of voting
        votingSystem.displayVoteOrder();
        // Sorted results
        votingSystem.displaySortedResults();
        // Winner(s)
        votingSystem.displayWinner();
    }
}
