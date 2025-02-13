package com.titWeek4Day2GautamCollectionFramework.QueueInterface.Problem03HospitalTriageSystem;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Patient{
    String name;
    int severity;
    public Patient(String name, int severity){
        this.name=name;
        this.severity=severity;
    }
    @Override
  public  String toString(){
        return name+ " severity := "+ severity;
    }
}
public class HospitalTriageSystem {
//main method
    public static void main(String[] args) {
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> p.severity).reversed());
       // PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> p.severity).reversed());
        priorityQueue.offer(new Patient("John", 3));
        priorityQueue.offer(new Patient("Alice", 5));
        priorityQueue.offer(new Patient("Bob", 2));

        System.out.println("Order of Severity");
//displaying patient name with higher severity priority
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
