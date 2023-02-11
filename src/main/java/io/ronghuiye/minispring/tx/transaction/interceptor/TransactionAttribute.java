package io.ronghuiye.minispring.tx.transaction.interceptor;

import io.ronghuiye.minispring.tx.transaction.TransactionDefinition;

public interface TransactionAttribute extends TransactionDefinition {
    boolean rollbackOn(Throwable ex);
}
