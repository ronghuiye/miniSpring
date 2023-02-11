package io.ronghuiye.minispring.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;

public class TransactionProxy implements InvocationHandler {
    private final Connection connection;

    private final Object target;

    public TransactionProxy(Connection connection, Object target) {
        this.connection = connection;
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //开启事务
        connection.setAutoCommit(true);

        //如果发生异常则进行回滚
        Object invokeResult = null;
        try {
            invokeResult = method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
            connection.rollback();
        }

        //提交
        connection.commit();

        return invokeResult;
    }
}
