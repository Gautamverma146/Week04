package com.tit.day06.annotations.advanced_level.role_bassed_access;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//custom annotations
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    public String role();
}
