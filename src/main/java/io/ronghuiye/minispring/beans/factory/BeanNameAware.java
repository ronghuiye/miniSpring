package io.ronghuiye.minispring.beans.factory;

public interface BeanNameAware extends Aware {
    void setBeanName(String name);
}
