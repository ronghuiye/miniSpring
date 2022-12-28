package io.ronghuiye.minispring.beans.factory.support;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.core.io.Resource;
import io.ronghuiye.minispring.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
