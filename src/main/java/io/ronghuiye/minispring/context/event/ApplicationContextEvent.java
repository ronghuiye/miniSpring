package io.ronghuiye.minispring.context.event;

import io.ronghuiye.minispring.context.ApplicationContext;
import io.ronghuiye.minispring.context.ApplicationEvent;

public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
