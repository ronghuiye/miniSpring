package io.ronghuiye.minispring.test;

import io.ronghuiye.minispring.context.support.ClassPathXmlApplicationContext;
import io.ronghuiye.minispring.test.bean.UserService;
import org.junit.Test;

public class ApiTest {
    //need to add vm arg(--add-opens java.base/java.lang=ALL-UNNAMED) in java18
//    @Test
//    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions("classpath:spring.xml");
//
//        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
//        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
//
//        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
//        beanFactory.addBeanPostProcessor(beanPostProcessor);
//
//        UserService userService = beanFactory.getBean("userService", UserService.class);
//        String result = userService.queryUserInfo();
//        System.out.println("result: " + result);
//    }

    @Test
    public void test_xml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("result：" + result);

        System.out.println("ApplicationContextAware：" + userService.getApplicationContext());
        System.out.println("BeanFactoryAware：" + userService.getBeanFactory());
    }
}
