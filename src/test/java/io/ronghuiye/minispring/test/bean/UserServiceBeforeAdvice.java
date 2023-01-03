package io.ronghuiye.minispring.test.bean;

import io.ronghuiye.minispring.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class UserServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("interceptor: " + method.getName());
    }
}
