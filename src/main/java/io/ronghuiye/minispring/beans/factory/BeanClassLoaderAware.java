package io.ronghuiye.minispring.beans.factory;

public interface BeanClassLoaderAware extends Aware {
    void setBeanClassLoader(ClassLoader classLoader);
}
