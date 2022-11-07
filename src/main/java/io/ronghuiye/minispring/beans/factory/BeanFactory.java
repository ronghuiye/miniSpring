package io.ronghuiye.minispring.beans.factory;

import io.ronghuiye.minispring.beans.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
