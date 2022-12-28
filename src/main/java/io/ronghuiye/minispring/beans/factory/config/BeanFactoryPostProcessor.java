package io.ronghuiye.minispring.beans.factory.config;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.factory.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactoryØ) throws BeansException;
}
