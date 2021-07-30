package com.lovecoding.aop.impl;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AddCommodity {
    public void addCommodity(){
        System.out.println("添加商品");
    }

}
