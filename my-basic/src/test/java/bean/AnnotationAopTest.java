package bean;

import bean.annotation.AopContextConfig;
import bean.service.CustomService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxianhu on 2015/10/21.
 */
public class AnnotationAopTest {

    ApplicationContext applicationContext;

    @Test
    public void aopTest() {

        applicationContext = new AnnotationConfigApplicationContext(AopContextConfig.class);

        CustomService service = applicationContext.getBean(CustomService.class);

        service.hello();
        service.hello("a");
        service.helloWithAnnotation("a");
        service.helloWithMethoParameterAnnotation("a");

    }
}
