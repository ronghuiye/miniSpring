package io.ronghuiye.minispring.test;

import io.ronghuiye.minispring.BeanDefinition;
import io.ronghuiye.minispring.BeanFactory;
import io.ronghuiye.minispring.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
