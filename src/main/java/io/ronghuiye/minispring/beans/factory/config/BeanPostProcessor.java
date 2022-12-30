package io.ronghuiye.minispring.beans.factory.config;

import io.ronghuiye.minispring.beans.BeansException;

public interface BeanPostProcessor {
    Object postProcessBeforeInitialization(Object existingBean, String beanName) throws BeansException;
    Object postProcessAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
