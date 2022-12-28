package io.ronghuiye.minispring.context;

import io.ronghuiye.minispring.beans.BeansException;
import io.ronghuiye.minispring.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
