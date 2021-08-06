package cn.running4light.javajichu.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

/**
 * @author running4light
 * @description
 * @createTime 2021/7/30 11:37
 */
public class ProxyTest {
    public static void main(String[] args) {
        HelloInt hello = new Hello();
        InvocationHandler handler = new ProxyHandler(hello);
        HelloInt helloProxy = (HelloInt)Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);
        helloProxy.func();
    }
}
