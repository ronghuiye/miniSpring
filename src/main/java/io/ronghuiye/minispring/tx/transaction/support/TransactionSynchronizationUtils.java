package io.ronghuiye.minispring.tx.transaction.support;

import cn.hutool.core.lang.Assert;

public class TransactionSynchronizationUtils {
    static Object unwrapResourceIfNecessary(Object resource) {
        Assert.notNull(resource, "Resource must not be null");
        Object resourceRef = resource;

        return resourceRef;
    }
}
