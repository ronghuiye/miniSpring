package io.ronghuiye.minispring.beans.factory.support;

import io.ronghuiye.minispring.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
