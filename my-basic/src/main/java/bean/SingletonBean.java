package bean;

/**
 * Created by liuxianhu on 2015/10/16.
 */
public class SingletonBean {

    PrototypeBean prototypeBean;

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }

    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }
}
