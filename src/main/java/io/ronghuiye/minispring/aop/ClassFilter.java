package io.ronghuiye.minispring.aop;

public interface ClassFilter {
    boolean matches(Class<?> clazz);

    ClassFilter TRUE = TrueClassFilter.INSTANCE;
}
