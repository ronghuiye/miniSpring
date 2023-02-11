package io.ronghuiye.minispring.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public interface AnnotationAttributeExtractor<S> {
    Class<? extends Annotation> getAnnotationType();

    Object getAnnotatedElement();

    S getSource();

    Object getAttributeValue(Method attributeMethod);
}
