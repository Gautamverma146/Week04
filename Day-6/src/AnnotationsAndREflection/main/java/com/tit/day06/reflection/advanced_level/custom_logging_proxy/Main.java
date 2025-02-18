package com.tit.day06.reflection.advanced_level.custom_logging_proxy;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImplementation();
        Greeting proxyGreeting = (Greeting) LoggingProxy.createProxy(greeting);
        proxyGreeting.sayHello();
    }
}
