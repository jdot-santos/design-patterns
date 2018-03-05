package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jsantos on 10/18/17.
 */
public class SecurityProxy implements InvocationHandler {
    private Object obj;

    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            if (method.getName().contains("post")) {
                throw new IllegalAccessException("Posts are currently not allowed");
            }
            result = method.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }
}
