package com.titWeek4Day2GautamCollectionFramework.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "Policy Number='" + policyNumber + '\'' +
                ", Policyholder='" + policyHolder + '\'' +
                ", Expiry Date=" + expiryDate +
                ", Coverage Type='" + coverageType + '\'' +
                ", Premium=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicyManagementSystem {
    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> linkedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, Policy> sortedPolicyMap = new TreeMap<>();

    // Add a new policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        linkedPolicyMap.put(policy.policyNumber, policy);
        sortedPolicyMap.put(policy.expiryDate, policy);
    }

    // Retrieve a policy by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.getOrDefault(policyNumber, null);
    }

    // List policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate thresholdDate = today.plusDays(30);

        for (Map.Entry<LocalDate, Policy> entry : sortedPolicyMap.entrySet()) {
            if (entry.getKey().isAfter(today) && entry.getKey().isBefore(thresholdDate)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String policyHolder) {
        List<Policy> holderPolicies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.policyHolder.equalsIgnoreCase(policyHolder)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        sortedPolicyMap.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
        policyMap.values().removeIf(policy -> policy.expiryDate.isBefore(today));
        linkedPolicyMap.values().removeIf(policy -> policy.expiryDate.isBefore(today));
    }

    // Display all policies
    public void displayPolicies() {
        for (Policy policy : linkedPolicyMap.values()) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        // Adding policies
        system.addPolicy(new Policy("P101", "Alice", LocalDate.now().plusDays(20), "Health", 5000));
        system.addPolicy(new Policy("P102", "Bob", LocalDate.now().plusDays(35), "Auto", 3000));
        system.addPolicy(new Policy("P103", "Alice", LocalDate.now().minusDays(5), "Home", 7000));
        system.addPolicy(new Policy("P104", "Charlie", LocalDate.now().plusDays(10), "Health", 4000));

        // Display all policies
        System.out.println("All Policies:");
        system.displayPolicies();

        // Get a policy by number
        System.out.println("\nPolicy P101 Details:");
        System.out.println(system.getPolicyByNumber("P101"));

        // List policies expiring within 30 days
        System.out.println("\nPolicies Expiring Soon:");
        System.out.println(system.getExpiringPolicies());

        // List policies for a specific policyholder
        System.out.println("\nPolicies for Alice:");
        System.out.println(system.getPoliciesByHolder("Alice"));

        // Remove expired policies
        system.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies:");
        system.displayPolicies();
    }
}

