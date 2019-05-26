package com.filters.demofilters;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAOP {

    @Before(value = "execution(* com.filters.demofilters.controller.MyController.*())")
    public void myAOPBefore(){
        System.out.println("MyAOP before");
    }
}
