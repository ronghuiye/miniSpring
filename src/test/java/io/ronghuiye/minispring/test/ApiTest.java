package io.ronghuiye.minispring.test;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.factory.config.BeanPostProcessor;
import io.ronghuiye.minispring.context.support.ClassPathXmlApplicationContext;
import io.ronghuiye.minispring.test.bean.Husband;
import io.ronghuiye.minispring.test.bean.IUserService;
import io.ronghuiye.minispring.test.bean.Wife;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

//    private AdvisedSupport advisedSupport;
//
//    @Before
//    public void init() {
//        IUserService userService = new UserService();
//        advisedSupport = new AdvisedSupport();
//        advisedSupport.setTargetSource(new TargetSource(userService));
//        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
//        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* io.ronghuiye.minispring.test.bean.IUserService.*(..))"));
//    }
//
//    @Test
//    public void test_proxyFactory() {
//        advisedSupport.setProxyTargetClass(false);
//        IUserService proxy = (IUserService) new ProxyFactory(advisedSupport).getProxy();
//
//        System.out.println("result：" + proxy.queryUserInfo());
//    }
//
//    @Test
//    public void test_beforeAdvice() {
//        UserServiceBeforeAdvice beforeAdvice = new UserServiceBeforeAdvice();
//        MethodBeforeAdviceInterceptor interceptor = new MethodBeforeAdviceInterceptor(beforeAdvice);
//        advisedSupport.setMethodInterceptor(interceptor);
//
//        IUserService proxy = (IUserService) new ProxyFactory(advisedSupport).getProxy();
//        System.out.println("result：" + proxy.queryUserInfo());
//    }
//
//    @Test
//    public void test_advisor() {
//        IUserService userService = new UserService();
//
//        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
//        advisor.setExpression("execution(* io.ronghuiye.minispring.test.bean.IUserService.*(..))");
//        advisor.setAdvice(new MethodBeforeAdviceInterceptor(new UserServiceBeforeAdvice()));
//
//        ClassFilter classFilter = advisor.getPointcut().getClassFilter();
//        if (classFilter.matches(userService.getClass())) {
//            AdvisedSupport advisedSupport = new AdvisedSupport();
//
//            TargetSource targetSource = new TargetSource(userService);
//            advisedSupport.setTargetSource(targetSource);
//            advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
//            advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());
//            advisedSupport.setProxyTargetClass(true);
//
//            IUserService proxy = (IUserService) new ProxyFactory(advisedSupport).getProxy();
//            System.out.println("result：" + proxy.queryUserInfo());
//        }
//    }
//
//    @Test
//    public void test_aop() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//
//        IUserService userService = applicationContext.getBean("userService", IUserService.class);
//        System.out.println("result：" + userService.queryUserInfo());
//    }

//    @Test
//    public void test_dynamic() {
//        IUserService userService = new UserService();
//        AdvisedSupport advisedSupport = new AdvisedSupport();
//        advisedSupport.setTargetSource(new TargetSource(userService));
//        advisedSupport.setMethodInterceptor(new UserServiceInterceptor());
//        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* io.ronghuiye.minispring.test.bean.IUserService.*(..))"));
//
//        IUserService proxy_jdk = (IUserService) new JdkDynamicAopProxy(advisedSupport).getProxy();
//        System.out.println("result：" + proxy_jdk.queryUserInfo());
//
//        IUserService proxy_cglib = (IUserService) new Cglib2AopProxy(advisedSupport).getProxy();
//        System.out.println("result：" + proxy_cglib.register("huahua"));
//    }
//
//    @Test
//    public void test_proxy_class() {
//        IUserService userService = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IUserService.class}, (proxy, method, args) -> "proxied！");
//        String result = userService.queryUserInfo();
//        System.out.println("result：" + result);
//
//    }

//    @Test
//    public void test_proxy_method() {
//        Object targetObj = new UserService();
//
//        IUserService proxy = (IUserService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), targetObj.getClass().getInterfaces(), new InvocationHandler() {
//            MethodMatcher methodMatcher = new AspectJExpressionPointcut("execution(* io.ronghuiye.minispring.test.bean.IUserService.*(..))");
//
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                if (methodMatcher.matches(method, targetObj.getClass())) {
//                    MethodInterceptor methodInterceptor = invocation -> {
//                        long start = System.currentTimeMillis();
//                        try {
//                            return invocation.proceed();
//                        } finally {
//                            System.out.println("Begin By AOP");
//                            System.out.println("method：" + invocation.getMethod().getName());
//                            System.out.println("took：" + (System.currentTimeMillis() - start) + "ms");
//                            System.out.println("End\r\n");
//                        }
//                    };
//                    return methodInterceptor.invoke(new ReflectiveMethodInvocation(targetObj, method, args));
//                }
//                return method.invoke(targetObj, args);
//            }
//        });
//
//        String result = proxy.queryUserInfo();
//        System.out.println("result：" + result);
//
//    }

//    @Test
//    public void test_autoProxy() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        IUserService userService = applicationContext.getBean("userService", IUserService.class);
//        System.out.println("result：" + userService.queryUserInfo());
//    }

//    @Test
//    public void test_property() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
//        IUserService userService = applicationContext.getBean("userService", IUserService.class);
//        System.out.println("result：" + userService);
//    }
//
//    @Test
//    public void test_beanPost(){
//
//        BeanPostProcessor beanPostProcessor = new BeanPostProcessor() {
//            @Override
//            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//                return null;
//            }
//
//            @Override
//            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//                return null;
//            }
//        };
//
//        List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();
//        beanPostProcessors.add(beanPostProcessor);
//        beanPostProcessors.add(beanPostProcessor);
//        beanPostProcessors.remove(beanPostProcessor);
//
//        System.out.println(beanPostProcessors.size());
//    }

    @Test
    public void test_circular() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Husband husband = applicationContext.getBean("husband", Husband.class);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println("husband's wife：" + husband.queryWife());
        System.out.println("wife's husband：" + wife.queryHusband());
    }
}
