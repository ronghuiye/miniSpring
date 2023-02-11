package io.ronghuiye.minispring.aop.support;

import io.ronghuiye.minispring.aop.MethodMatcher;

import java.lang.reflect.Method;

public abstract class StaticMethodMatcher implements MethodMatcher {
    @Override
    public boolean matches(Method method, Class<?> clazz) {
        throw new UnsupportedOperationException("not support");
    }
}
