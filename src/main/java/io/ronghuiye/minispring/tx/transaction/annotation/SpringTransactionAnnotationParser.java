package io.ronghuiye.minispring.tx.transaction.annotation;

import io.ronghuiye.minispring.core.annotation.AnnotatedElementUtils;
import io.ronghuiye.minispring.core.annotation.AnnotationAttributes;
import io.ronghuiye.minispring.tx.transaction.interceptor.RollbackRuleAttribute;
import io.ronghuiye.minispring.tx.transaction.interceptor.RuleBasedTransactionAttribute;
import io.ronghuiye.minispring.tx.transaction.interceptor.TransactionAttribute;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

public class SpringTransactionAnnotationParser implements TransactionAnnotationParser, Serializable {
    @Override
    public TransactionAttribute parseTransactionAnnotation(AnnotatedElement element) {
        AnnotationAttributes attributes = AnnotatedElementUtils.findMergedAnnotationAttributes(
                element, Transactional.class, false, false);
        if (null != attributes) {
            return parseTransactionAnnotation(attributes);
        } else {
            return null;
        }

    }

    protected TransactionAttribute parseTransactionAnnotation(AnnotationAttributes attributes) {
        RuleBasedTransactionAttribute rbta = new RuleBasedTransactionAttribute();

        List<RollbackRuleAttribute> rollbackRules = new ArrayList<>();
        for (Class<?> rbRule : attributes.getClassArray("rollbackFor")) {
            rollbackRules.add(new RollbackRuleAttribute(rbRule));
        }

        rbta.setRollbackRules(rollbackRules);
        return rbta;
    }
}
