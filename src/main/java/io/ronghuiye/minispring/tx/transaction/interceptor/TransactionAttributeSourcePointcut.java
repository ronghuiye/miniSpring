package io.ronghuiye.minispring.tx.transaction.interceptor;

import io.ronghuiye.minispring.aop.support.StaticMethodMatcherPointcut;
import io.ronghuiye.minispring.tx.transaction.PlatformTransactionManager;

import java.io.Serializable;
import java.lang.reflect.Method;

public abstract class TransactionAttributeSourcePointcut extends StaticMethodMatcherPointcut implements Serializable {
    @Override
    public boolean matches(Method method, Class<?> clazz) {
        if (PlatformTransactionManager.class.isAssignableFrom(clazz)) {
            return false;
        }

        TransactionAttributeSource tas = getTransactionAttributeSource();

        return null == tas || tas.getTransactionAttribute(method, clazz) != null;
    }


    //---------------------------------------------------------------------
    // Abstract methods to be implemented by subclasses start
    //---------------------------------------------------------------------

    protected abstract TransactionAttributeSource getTransactionAttributeSource();
}
