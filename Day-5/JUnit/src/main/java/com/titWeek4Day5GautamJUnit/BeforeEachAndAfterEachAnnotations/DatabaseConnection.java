package com.titWeek4Day5GautamJUnit.BeforeEachAndAfterEachAnnotations;

public class DatabaseConnection {
    private boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return isConnected;
    }
}

