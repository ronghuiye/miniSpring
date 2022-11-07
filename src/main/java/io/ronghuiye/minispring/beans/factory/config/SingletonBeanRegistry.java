package io.ronghuiye.minispring.beans.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
