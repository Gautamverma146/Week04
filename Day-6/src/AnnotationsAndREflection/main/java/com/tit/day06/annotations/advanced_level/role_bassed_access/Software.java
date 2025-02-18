package com.tit.day06.annotations.advanced_level.role_bassed_access;

import static java.lang.System.out;

public class Software{
    //constructor
    public Software() {}

    //methods with annotations
    @RoleAllowed(role = "ADMIN")
    public void accessDatabase(){
        out.println("database accessed");
    }
    @RoleAllowed(role = "USER")
    public void useSoftware(){
        out.println("software used");
    }
}
