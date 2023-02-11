package io.ronghuiye.minispring.tx.transaction;

import java.io.Flushable;
import java.io.IOException;

public interface TransactionStatus extends SavepointManager, Flushable {
    boolean isNewTransaction();

    boolean hasSavepoint();

    void setRollbackOnly();

    boolean isRollbackOnly();

    @Override
    void flush() throws IOException;

    boolean isCompleted();
}
