package io.ronghuiye.minispring.context;

import io.ronghuiye.minispring.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext {
    void refresh() throws BeansException;
}
