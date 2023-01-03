package io.ronghuiye.minispring.beans.factory.config;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.PropertyValues;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException;

    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;
}
