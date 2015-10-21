package proxy;

/**
 * Created by liuxianhu on 2015/10/21.
 *
 * 被代理的对象
 *
 */
public class ProxyTarget implements ProxyTargetInterface{

    public void hello() {
        System.out.println("ProxyTarget object method : hello ."  );
    }


}
