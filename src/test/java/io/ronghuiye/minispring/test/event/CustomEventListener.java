package io.ronghuiye.minispring.test.event;

import io.ronghuiye.minispring.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("source: " + event.getSource());
        System.out.println("id: " + event.getId());
        System.out.println("message: " + event.getMessage());
    }
}
