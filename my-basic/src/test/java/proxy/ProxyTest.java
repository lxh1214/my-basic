package proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by liuxianhu on 2015/10/21.
 */
public class ProxyTest {

    @Test
    public void proxyOneTest() {

        ProxyTarget source = new ProxyTarget();

        ProxyOne proxy = new ProxyOne(source);

        proxy.hello();
    }

    @Test
    public void proxyReflectTest() {


        ProxyTargetInterface source = new ProxyTarget();

        ProxyTargetInterface proxy = (ProxyTargetInterface)ProxyReflectHandler.getNewInstance(source);

        proxy.hello();

    }
}
