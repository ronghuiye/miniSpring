package io.ronghuiye.minispring.context.event;

import io.ronghuiye.minispring.beans.factory.BeanFactory;
import io.ronghuiye.minispring.context.ApplicationEvent;
import io.ronghuiye.minispring.context.ApplicationListener;

public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
