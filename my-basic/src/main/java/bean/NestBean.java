package bean;

import javax.annotation.PostConstruct;

/**
 * Created by liuxianhu on 2015/10/15.
 *
 *  setter 方法注入
 *  需要有 setter 相应的属性
 *  然后在 bean 配置的 中set属性名字 以及对应的值
 */
public class NestBean {

    OneBean one;

    public OneBean getOne() {
        return one;
    }

    public void setOne(OneBean one) {
        this.one = one;
    }

    @PostConstruct
    public void init() {
        System.out.print("1111" + one);
    }
}
