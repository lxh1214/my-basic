package bean;

import bean.annotation.SpelContextConfig;
import bean.spel.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liuxianhu on 2015/10/21.
 */
public class AnnotationSpelTest {

    @Test
    public void spelTest() {

        ApplicationContext app = new AnnotationConfigApplicationContext(SpelContextConfig.class);

        Customer c = app.getBean(Customer.class);

        System.out.println(c.getItem());
        System.out.println(c.getPrice());
        System.out.println(c.getName());
    }
}
