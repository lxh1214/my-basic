package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liuxianhu on 2015/10/21.
 */
public class ProxyReflectHandler implements InvocationHandler {

    //被代理对象
    Object obj;

    public ProxyReflectHandler(Object obj) {
        this.obj = obj;
    }

    public static Object getNewInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new ProxyReflectHandler(obj));
    }

    /*
    proxy 是代理对象
    不是 被代理对象
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equals("hello")) {
            System.out.println("invoke");
        }

        return method.invoke(this.obj, args);
    }

}
