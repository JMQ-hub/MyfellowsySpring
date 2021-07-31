package com.lovecoding.aop.impl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
public class AddCommodity {

    public void addCommodity(){
        System.out.println("添加商品");
    }

}
