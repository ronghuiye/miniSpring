package io.ronghuiye.minispring.beans.factory.config;

import io.ronghuiye.minispring.beans.BeansException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
