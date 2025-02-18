package com.tit.day06.annotations.advanced_level.coustom_catching_system;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;

public class Operation {
    //map to store cached result
    private Map<Integer, Integer> cache = new HashMap<>();

    //method to double number with annotation
    @CacheResult
    public int doubleNumber(int num) {
        System.out.println("Computing " + num);
        int result = num * 2;
        cache.put(num, result);
        return result;
    }
    public int cachedCompute(int num){
        Method method = null;
        try {
            method = this.getClass().getMethod("doubleNumber", int.class);
        } catch (NoSuchMethodException e) {
            out.println("can not access method");
        }
        if (method.getAnnotation(CacheResult.class) != null) {
            if (!cache.containsKey(num)) {
                cache.put(num, doubleNumber(num));
            }
            return cache.get(num);
        }
        return doubleNumber(num);
    }
}
