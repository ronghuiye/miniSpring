package io.ronghuiye.minispring.aop.framework.autoproxy;

import io.ronghuiye.minispring.aop.*;
import io.ronghuiye.minispring.aop.aspectj.AspectJExpressionPointcutAdvisor;
import io.ronghuiye.minispring.aop.framework.ProxyFactory;
import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.PropertyValues;
import io.ronghuiye.minispring.beans.factory.BeanFactory;
import io.ronghuiye.minispring.beans.factory.BeanFactoryAware;
import io.ronghuiye.minispring.beans.factory.config.InstantiationAwareBeanPostProcessor;
import io.ronghuiye.minispring.beans.factory.support.DefaultListableBeanFactory;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;

import java.util.Collection;

public class DefaultAdvisorAutoProxyCreator implements InstantiationAwareBeanPostProcessor, BeanFactoryAware {

    private DefaultListableBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (DefaultListableBeanFactory) beanFactory;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

    private boolean isInfrastructureClass(Class<?> beanClass) {
        return Advice.class.isAssignableFrom(beanClass) || Pointcut.class.isAssignableFrom(beanClass) || Advisor.class.isAssignableFrom(beanClass);
    }

    @Override
    public Object postProcessBeforeInitialization(Object existingBean, String beanName) throws BeansException {
        return existingBean;
    }

    @Override
    public Object postProcessAfterInitialization(Object existingBean, String beanName) throws BeansException {
        if (isInfrastructureClass(existingBean.getClass())) return existingBean;

        Collection<AspectJExpressionPointcutAdvisor> advisors = beanFactory.getBeansOfType(AspectJExpressionPointcutAdvisor.class).values();

        for (AspectJExpressionPointcutAdvisor advisor : advisors) {
            ClassFilter classFilter = advisor.getPointcut().getClassFilter();
            if(!classFilter.matches(existingBean.getClass())) continue;

            AdvisedSupport advisedSupport = new AdvisedSupport();

            TargetSource targetSource = new TargetSource(existingBean);
            advisedSupport.setTargetSource(targetSource);
            advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
            advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());
            advisedSupport.setProxyTargetClass(false);

            return new ProxyFactory(advisedSupport).getProxy();
        }
        return existingBean;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        return pvs;
    }
}
