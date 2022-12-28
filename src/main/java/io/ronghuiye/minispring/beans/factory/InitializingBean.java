package io.ronghuiye.minispring.beans.factory;

public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
