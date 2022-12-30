package io.ronghuiye.minispring.aop;

public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();
}
