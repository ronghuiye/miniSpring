package io.ronghuiye.minispring.test.event;

import io.ronghuiye.minispring.context.ApplicationListener;
import io.ronghuiye.minispring.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("closed event: " + this.getClass().getName());
    }
}
