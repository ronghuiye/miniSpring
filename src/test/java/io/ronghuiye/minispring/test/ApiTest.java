package io.ronghuiye.minispring.test;

import io.ronghuiye.minispring.context.support.ClassPathXmlApplicationContext;
import io.ronghuiye.minispring.test.bean.UserService;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

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
    public void test_prototype() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService1 = applicationContext.getBean("userService", UserService.class);
        UserService userService2 = applicationContext.getBean("userService", UserService.class);

        System.out.println(userService1);
        System.out.println(userService2);

        System.out.println(userService1 + Integer.toHexString(userService1.hashCode()));
        System.out.println(ClassLayout.parseInstance(userService1).toPrintable());
    }

    @Test
    public void test_factory_bean() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println("result：" + userService.queryUserInfo());
    }
}
