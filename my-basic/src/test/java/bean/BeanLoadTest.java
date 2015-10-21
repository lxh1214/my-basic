package bean;

import bean.life.ExePostProcessor;
import bean.scan.AnnotationBean;
import bean.scan.SpringApplicationContextProxy;
import bean.service.ClientService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by liuxianhu on 2015/10/15.
 */


public class BeanLoadTest {

    ApplicationContext context = null;

    @Before
    public void beforeWork() {
        context = new ClassPathXmlApplicationContext("classpath:application-content.xml");
    }

    @Test
    public void loadByName() {

        OneBean one = context.getBean("oneBean", OneBean.class);
        OneBean one1 = context.getBean("oneBean1", OneBean.class);
        System.out.println("one " + one);
        System.out.println("one " + one1);

    }

    // setter 方式注入
    @Test
    public void loadNestBeanBySetter() {
        NestBean bean = context.getBean("nestBean", NestBean.class);
        System.out.println("nest bean " + bean + " one properties : " + bean.getOne());
    }

    // 构造方法注入
    @Test
    public void loadNestBeanByConstructor() {
        NestConstrBean bean = context.getBean("nestBean1", NestConstrBean.class);
        System.out.println("nest bean " + bean + " one properties : " + bean.getOne());
    }

    // 通过component-scan 扫描注册成 bean
    @Test
    public void loadBeanByScanPackage() {
        AnnotationBean bean = context.getBean(AnnotationBean.class);
        String[] s = context.getBeanNamesForType(AnnotationBean.class);

        System.out.println("bean " + bean + " " + bean.getOne());
        Arrays.asList(s).forEach(e -> System.out.println("e " + e));
    }

    @Test
    public void loadBeanByFactory() {
        ClientService bean = context.getBean("clientService", ClientService.class);
        ClientService bean1 = context.getBean("clientService1", ClientService.class);
        System.out.println("bean " + bean);
        System.out.println("bean " + bean1);
    }

    /*
    如果 Class被声明为单例 而其中含有的属性 类是声明原型
    但我们又需要 每次 通过Class单例 来获得 此属性 为原型状态的
    则需要使用 lookup-method
    见 singletonBean bean里的声明

    或则 abstract 的 某个类 某个方法 没有实现 也可以用lookup-method
     */
    @Test
    public void loadBeanByNestProtoTypeBean() {
        SingletonBean bean = context.getBean(SingletonBean.class);
        PrototypeBean bean1 = bean.getPrototypeBean();
        PrototypeBean bean2 = bean.getPrototypeBean();
        PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
        System.out.println(bean1);
        System.out.println(bean2);
        System.out.println(prototypeBean);
    }

    /*
    通过注入 applicationContext 获得 context  用于工具类
     */
    @Test
    public void loadProxyApplicationContextTest() {
        SpringApplicationContextProxy contextBean = context.getBean(SpringApplicationContextProxy.class);

        System.out.println("contextBean :" + contextBean.getApplicationContext());
        SingletonBean bean = contextBean.getApplicationContext().getBean(SingletonBean.class);
        System.out.println("bean :" + bean);

    }

    @Test
    public void beanPostProcessorTest() {
        AnnotationBean bean = context.getBean(AnnotationBean.class);
        String[] s = context.getBeanNamesForType(AnnotationBean.class);
        ExePostProcessor exe = context.getBean(ExePostProcessor.class);

        System.out.println("bean " + bean + " " + bean.getOne());
        Arrays.asList(s).forEach(e -> System.out.println("e " + e));



    }

}
