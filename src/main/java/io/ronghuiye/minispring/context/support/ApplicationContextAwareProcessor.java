package io.ronghuiye.minispring.context.support;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.factory.config.BeanPostProcessor;
import io.ronghuiye.minispring.context.ApplicationContext;
import io.ronghuiye.minispring.context.ApplicationContextAware;

public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException {
        if (existingBean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) existingBean).setApplicationContext(applicationContext);
        }
        return existingBean;
    }

    @Override
    public Object postProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException {
        return existingBean;
    }
}
