package io.ronghuiye.minispring.aop.support;

import io.ronghuiye.minispring.aop.ClassFilter;
import io.ronghuiye.minispring.aop.MethodMatcher;
import io.ronghuiye.minispring.aop.Pointcut;

public abstract class StaticMethodMatcherPointcut extends StaticMethodMatcher implements Pointcut {
    private ClassFilter classFilter = ClassFilter.TRUE;
    public void setClassFilter(ClassFilter classFilter) {
        this.classFilter = classFilter;
    }

    public ClassFilter getClassFilter() {
        return classFilter;
    }

    @Override
    public MethodMatcher getMethodMatcher() {
        return this;
    }
}
