package io.ronghuiye.minispring.beans.factory;

import io.ronghuiye.minispring.beans.BeansException;

public interface ObjectFactory<T> {
    T getObject() throws BeansException;
}
