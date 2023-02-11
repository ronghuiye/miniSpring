package io.ronghuiye.minispring.tx.transaction.interceptor;

import java.lang.reflect.Method;

public interface TransactionAttributeSource {
    TransactionAttribute getTransactionAttribute(Method method, Class<?> targetClass);

}
