package cn.running4light.javajichu.proxy;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author running4light
 * @description
 * @createTime 2021/7/30 11:41
 */
public class ProxyHandler implements InvocationHandler {
    Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("invoke start");
        method.invoke(object,args);
        System.err.println("invoke stop");
        return null;
    }
}
