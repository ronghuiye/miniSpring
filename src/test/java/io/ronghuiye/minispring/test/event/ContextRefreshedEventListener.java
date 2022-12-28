package io.ronghuiye.minispring.test.event;

import io.ronghuiye.minispring.context.ApplicationListener;
import io.ronghuiye.minispring.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("refreshed event: " + this.getClass().getName());
    }
}
