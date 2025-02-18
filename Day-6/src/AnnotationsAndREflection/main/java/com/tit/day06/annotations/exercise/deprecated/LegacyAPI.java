package com.tit.day06.annotations.exercise.deprecated;
import static java.lang.System.out;

public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        out.println("This is an old feature");
    }

    public void newFeature() {
        out.println("This is the new feature");
    }
}
