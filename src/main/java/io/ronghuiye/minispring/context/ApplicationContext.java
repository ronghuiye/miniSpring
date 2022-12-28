package io.ronghuiye.minispring.context;

import io.ronghuiye.minispring.beans.factory.HierarchicalBeanFactory;
import io.ronghuiye.minispring.beans.factory.ListableBeanFactory;
import io.ronghuiye.minispring.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
