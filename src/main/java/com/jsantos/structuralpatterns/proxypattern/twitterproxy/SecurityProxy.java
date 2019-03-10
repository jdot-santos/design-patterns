package com.jsantos.structuralpatterns.proxypattern.twitterproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Represents the Proxy in UML.
 * Created by jsantos on 10/18/17.
 */
public class SecurityProxy implements InvocationHandler {
    // This is a factory pattern, see newInstance() for the rest of the impl
    private Object obj;

    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * This is where the "magic" happens, or where the proxy comes into play.
     *
     * This determines what methods we will or won't invoke when this is called.
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            validate(method);
            result = method.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }

    /**
     * This acts as the "security layer" in the proxy. Note that this is a poor man's version of security. You can think of the various ways you can secure method calls (e.g., Spring security, OAuth, 509 certificates, etc.)
     * @param method
     * @throws IllegalAccessException
     */
    private void validate(Method method) throws IllegalAccessException {
        if (method.getName().contains("post")) {
			throw new IllegalAccessException("Posts are currently not allowed");
		}
    }

    /**
     * Uses the factory pattern to create a new SecurityProxy instance
     * @param obj
     * @return
     */
    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new SecurityProxy(obj));
    }
}
