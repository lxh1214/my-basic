package bean;

import bean.spel.Customer;
import bean.spel.Item;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuxianhu on 2015/10/21.
 */
public class SpelTest {

    ApplicationContext app;

    @Before
    public void init() {
        app = new ClassPathXmlApplicationContext("application-content.xml");
    }

    /**
     *
     * #{}配置用法测试
     */
    @Test
    public void customerTest() {
        Customer c = app.getBean(Customer.class);

        Item item = c.getItem();

        System.out.println("item " + item);

    }
}
