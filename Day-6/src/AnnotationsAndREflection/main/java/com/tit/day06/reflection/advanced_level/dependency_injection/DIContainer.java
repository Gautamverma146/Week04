package com.tit.day06.reflection.advanced_level.dependency_injection;

import java.lang.reflect.Field;
import static java.lang.System.out;

public class DIContainer {
    public static void inject(Object target) {
        Class<?> clazz = target.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = createDependency(field.getType());
                try {
                    field.set(target, dependency);
                } catch (IllegalAccessException e) {
                    out.println("unable to inject dependency");
                }
            }
        }
    }

    private static Object createDependency(Class<?> type) {
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
           out.println("failed to create dependency");
           return null;
        }
    }

}
