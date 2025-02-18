package com.tit.day06.annotations.advanced_level.coustom_catching_system;

import static java.lang.System.out;

public class CachingSystem {
    public static void main(String[] args) {
        //create object of operation
        Operation operation = new Operation();

        out.println(operation.cachedCompute(5));
        out.println(operation.cachedCompute(5));
        out.println(operation.cachedCompute(10));
    }
}
