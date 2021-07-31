package com.lovecoding.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Advice {
    @Pointcut("execution(* com.lovecoding.aop.impl.AddCommodity.*(..))")
    public void pc(){}

    @Before("Advice.pc()")
    public void before(){
        System.out.println("前置通知，在目标方法执行前执行");
    }

    @After(("Advice.pc()"))
    public void afterRunning(){
        System.out.println("后置通知，在目标方法执行后执行");
    }

    public void throwing(){
        System.out.println("异常通知，在目标方法发生异常时执行");
    }
    public void finalAfter(){
        System.out.println("最终通知，无论目标方法是否出现异常都会执行");
    }
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("环绕前通知，在目标方法执行前执行");
        Object o = pjp.proceed();
        System.out.println("环绕后通知，在目标方法执行后执行");
        return o;
    }

}