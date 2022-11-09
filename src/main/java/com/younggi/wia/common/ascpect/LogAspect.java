package com.younggi.wia.common.ascpect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    Logger logger =  LoggerFactory.getLogger(LogAspect.class);

    //BookService의 모든 메서드
//    @Around("execution(* com.example.demo.service.BookService.*(..))")
    /*@Around("execution(* com.example.demo.controller..*.*(..))")*/
    /*@Around("execution(* com.example.demo..*.*(..))")*/
    /*@Around("execution(* com.ahope.ds..controller.*Controller.*(..))")*/
    public Object logging(ProceedingJoinPoint jp) throws Throwable {
        String className = jp.getTarget().getClass().getSimpleName();
        String methodName = jp.getSignature().getName();

        logger.debug("[START][" + className + " - " + methodName + "]");
        Object result = jp.proceed();
        logger.debug("[END][" + className + " - " + methodName + "]");
        return result;
    }
}
