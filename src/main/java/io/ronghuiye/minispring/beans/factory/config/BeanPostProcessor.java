package io.ronghuiye.minispring.beans.factory.config;

import io.ronghuiye.minispring.beans.BeansException;

public interface BeanPostProcessor {
    Object postProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;
    Object postProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
