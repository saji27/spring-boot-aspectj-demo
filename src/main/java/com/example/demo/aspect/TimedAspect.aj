package com.example.demo.aspect;

public aspect TimedAspect {
        pointcut timedAnnotation() : @annotation(com.example.demo.annotation.Timed) && execution(* *(..));
        Object around() : timedAnnotation() {
        long start = System.currentTimeMillis();
        Object ret = proceed();
        long end = System.currentTimeMillis();
        System.out.println("The method :" + thisJoinPointStaticPart.getSignature()
        + " took " + (end-start) + " ms");

        return ret;
        }
}