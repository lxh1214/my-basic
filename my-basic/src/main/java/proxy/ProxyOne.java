package proxy;

/**
 * Created by liuxianhu on 2015/10/21.
 *
 * 代理对象 1
 * 比较繁琐 需要有一个 方法把 被代理者设置 进入 代理里
 * 且 如果有 大量的相同
 */
public class ProxyOne {

    ProxyTarget target;

    public ProxyOne(ProxyTarget target) {
        this.target = target;
    }

    public void hello() {
        System.out.println("proxy one object method : hello ");
        this.target.hello();
    }
}
