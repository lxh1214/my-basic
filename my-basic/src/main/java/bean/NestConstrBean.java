package bean;

import javax.annotation.PostConstruct;

/**
 * Created by liuxianhu on 2015/10/15.
 */
public class NestConstrBean {


    OneBean one;

    public NestConstrBean(OneBean one) {
        this.one = one;
    }

    public OneBean getOne() {
        return one;
    }

    //bean 调用 set properties 完成后 调用
    @PostConstruct
    public void printOne() {

        System.out.println(one);

    }
}
