package io.ronghuiye.minispring.context;

public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);
}
