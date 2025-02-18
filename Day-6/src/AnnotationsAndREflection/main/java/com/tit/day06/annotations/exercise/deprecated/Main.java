package com.tit.day06.annotations.exercise.deprecated;

public class Main{
    public static void main(String[] args) {
        //create object of legacy API
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();
        api.newFeature();
    }
}
