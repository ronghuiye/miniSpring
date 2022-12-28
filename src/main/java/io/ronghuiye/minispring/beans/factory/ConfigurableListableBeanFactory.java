package io.ronghuiye.minispring.beans.factory;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.factory.config.AutowireCapableBeanFactory;
import io.ronghuiye.minispring.beans.factory.config.BeanDefinition;
import io.ronghuiye.minispring.beans.factory.config.BeanPostProcessor;
import io.ronghuiye.minispring.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
