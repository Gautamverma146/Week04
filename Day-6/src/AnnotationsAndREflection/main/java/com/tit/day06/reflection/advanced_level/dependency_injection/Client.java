package com.tit.day06.reflection.advanced_level.dependency_injection;

public class Client {
    @Inject
    private Service service;

    public void requestService() {
        service.serve();
    }
}
