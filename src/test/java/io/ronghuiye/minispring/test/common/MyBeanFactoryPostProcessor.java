package io.ronghuiye.minispring.test.common;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.PropertyValue;
import io.ronghuiye.minispring.beans.PropertyValues;
import io.ronghuiye.minispring.beans.factory.ConfigurableListableBeanFactory;
import io.ronghuiye.minispring.beans.factory.config.BeanDefinition;
import io.ronghuiye.minispring.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "changed to sovos"));
    }
}
