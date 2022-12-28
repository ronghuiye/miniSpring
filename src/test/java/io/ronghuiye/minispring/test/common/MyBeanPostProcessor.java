package io.ronghuiye.minispring.test.common;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.PropertyValue;
import io.ronghuiye.minispring.beans.PropertyValues;
import io.ronghuiye.minispring.beans.factory.ConfigurableListableBeanFactory;
import io.ronghuiye.minispring.beans.factory.config.BeanDefinition;
import io.ronghuiye.minispring.beans.factory.config.BeanFactoryPostProcessor;
import io.ronghuiye.minispring.beans.factory.config.BeanPostProcessor;
import io.ronghuiye.minispring.test.bean.UserService;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) existingBean;
            userService.setLocation("changed to Wilmington");
        }
        return existingBean;
    }

    @Override
    public Object postProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException {
        return existingBean;
    }
}
