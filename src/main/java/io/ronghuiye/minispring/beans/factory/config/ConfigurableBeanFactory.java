package io.ronghuiye.minispring.beans.factory.config;

import io.ronghuiye.minispring.beans.factory.HierarchicalBeanFactory;
import io.ronghuiye.minispring.core.convert.ConversionService;
import io.ronghuiye.minispring.util.StringValueResolver;


public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();

    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    String resolveEmbeddedValue(String value);

    void setConversionService(ConversionService conversionService);

    ConversionService getConversionService();
}
