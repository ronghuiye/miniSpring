package io.ronghuiye.minispring.test;

import io.ronghuiye.minispring.beans.factory.config.BeanDefinition;
import io.ronghuiye.minispring.beans.factory.support.DefaultListableBeanFactory;
import io.ronghuiye.minispring.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }
}
