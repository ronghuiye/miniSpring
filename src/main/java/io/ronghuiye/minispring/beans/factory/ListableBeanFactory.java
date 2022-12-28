package io.ronghuiye.minispring.beans.factory;

import io.ronghuiye.minispring.beans.BeansException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory{

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();
}
