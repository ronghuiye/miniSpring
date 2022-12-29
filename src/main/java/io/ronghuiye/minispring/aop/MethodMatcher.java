package io.ronghuiye.minispring.aop;

import java.lang.reflect.Method;

public interface MethodMatcher {
    boolean matches(Method method, Class<?> clazz);
}
