package io.ronghuiye.minispring.beans.factory;

import io.ronghuiye.minispring.beans.BeansException;

public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
