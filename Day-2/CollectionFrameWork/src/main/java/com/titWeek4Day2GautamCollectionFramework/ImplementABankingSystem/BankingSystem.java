package com.titWeek4Day2GautamCollectionFramework.ImplementABankingSystem;

import java.util.*;

class BankingSystem {
    // HashMap for quick lookups
    private Map<Integer, Double> accounts;
    // TreeMap for sorted balances
    private TreeMap<Double, List<Integer>> sortedAccounts;
    // Queue for processing withdrawals
    private Queue<Integer> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        sortedAccounts = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a new account
    public void addAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.putIfAbsent(initialBalance, new ArrayList<>());
        sortedAccounts.get(initialBalance).add(accountNumber);
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }
        double oldBalance = accounts.get(accountNumber);
        double newBalance = oldBalance + amount;

        // Update HashMap
        accounts.put(accountNumber, newBalance);

        // Update TreeMap
        sortedAccounts.get(oldBalance).remove((Integer) accountNumber);
        if (sortedAccounts.get(oldBalance).isEmpty()) {
            sortedAccounts.remove(oldBalance);
        }
        sortedAccounts.putIfAbsent(newBalance, new ArrayList<>());
        sortedAccounts.get(newBalance).add(accountNumber);
    }

    // Request a withdrawal (adds to queue)
    public void requestWithdrawal(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }
        withdrawalQueue.offer(accountNumber);
        System.out.println("Withdrawal request added for account: " + accountNumber);
    }

    // Process withdrawal requests
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                withdraw(accountNumber, amount);
            } else {
                System.out.println("Insufficient funds for account: " + accountNumber);
            }
        }
    }

    // Withdraw money from an account
    private void withdraw(int accountNumber, double amount) {
        double oldBalance = accounts.get(accountNumber);
        double newBalance = oldBalance - amount;

        // Update HashMap
        accounts.put(accountNumber, newBalance);

        // Update TreeMap
        sortedAccounts.get(oldBalance).remove((Integer) accountNumber);
        if (sortedAccounts.get(oldBalance).isEmpty()) {
            sortedAccounts.remove(oldBalance);
        }
        sortedAccounts.putIfAbsent(newBalance, new ArrayList<>());
        sortedAccounts.get(newBalance).add(accountNumber);

        System.out.println("Withdrawn $" + amount + " from account: " + accountNumber);
    }

    // Display all accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, List<Integer>> entry : sortedAccounts.entrySet()) {
            for (Integer accNum : entry.getValue()) {
                System.out.println("Account " + accNum + " -> $" + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(101, 500.00);
        bank.addAccount(102, 1200.00);
        bank.addAccount(103, 800.00);

        // Depositing money
        bank.deposit(101, 300.00);
        bank.deposit(103, 200.00);

        // Display sorted accounts
        bank.displaySortedAccounts();

        // Request withdrawals
        bank.requestWithdrawal(101);
        bank.requestWithdrawal(103);

        // Process withdrawals
        bank.processWithdrawals(400.00);

        // Display sorted accounts after withdrawals
        bank.displaySortedAccounts();
    }
}

