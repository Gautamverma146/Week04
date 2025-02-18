package com.tit.day06.reflection.advanced_level.dependency_injection;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        DIContainer.inject(client);
        client.requestService();
    }
}
