package io.ronghuiye.minispring.context.event;

import io.ronghuiye.minispring.context.ApplicationEvent;
import io.ronghuiye.minispring.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
