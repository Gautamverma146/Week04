package com.titWeek4Day5GautamJUnit.PerformanceTestingUsingTimeOut;

public class Task {
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task Completed";
    }
}

