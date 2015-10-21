package bean;

import bean.annotation.OneContextConfig;
import bean.scan.AnnotationBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuxianhu on 2015/10/19.
 */
public class AnnotationBeanLoadTest {



    @Test
    public void loadBeanTest() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OneContextConfig.class);

        NestBean bean = applicationContext.getBean(NestBean.class);

        OneBean oneBean = applicationContext.getBean(OneBean.class);
        NestBean tBean = applicationContext.getBean("a", NestBean.class);
        AnnotationBean annotationBean = applicationContext.getBean(AnnotationBean.class);

        System.out.println("bean : " + bean);
        System.out.println("tBean : " + tBean);
        System.out.println("oneBean : " + oneBean);
        System.out.println("annotationBean : " + annotationBean);


    }
}
