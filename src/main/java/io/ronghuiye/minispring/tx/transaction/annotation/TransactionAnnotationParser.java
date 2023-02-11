package io.ronghuiye.minispring.tx.transaction.annotation;

import io.ronghuiye.minispring.tx.transaction.interceptor.TransactionAttribute;

import java.lang.reflect.AnnotatedElement;

public interface TransactionAnnotationParser {
    TransactionAttribute parseTransactionAnnotation(AnnotatedElement element);
}
