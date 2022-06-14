package com.lemon.aopdemo.aspect;

import com.lemon.aopdemo.service.CheckUserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect //声明该类为切面类
@Component //将类放入容器中
public class CheckUserAspect {

    @Autowired
    private CheckUserService checkUserService;

    @Pointcut("@annotation(com.lemon.aopdemo.annotation.CheckAdmin)")
    public void checkAmin(){ }


    @Before("checkAmin()")
    public void before(JoinPoint joinPoint) throws Exception {
        System.out.println("before");
        Object[] args = joinPoint.getArgs();
        checkUserService.checkAdmin(String.valueOf(args[0]));
    }

}
