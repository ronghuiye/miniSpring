package io.ronghuiye.minispring.test.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class UserServiceInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long start = System.currentTimeMillis();
        try {
            return methodInvocation.proceed();
        } finally {
            System.out.println("Begin by AOP");
            System.out.println("method: " + methodInvocation.getMethod());
            System.out.println("took：" + (System.currentTimeMillis() - start) + "ms");
            System.out.println("end");
        }
    }
}
