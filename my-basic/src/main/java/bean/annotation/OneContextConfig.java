package bean.annotation;

import bean.NestBean;
import bean.life.ExeOrderPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by liuxianhu on 2015/10/19.
 * Configuration 类似整个 xml 文件
 * Import 类似 import: resource
 * Bean 类似 <bean ></bean>
 */
@Configuration
@Import({OtherContextConfig.class})
@ComponentScan(basePackages = {"bean.scan"})
public class OneContextConfig {

    @Bean(name = "a")
    public NestBean nestBean() {
        return new NestBean();
    }

    @Bean
    public ExeOrderPostProcessor exeOrderPostProcessor() {
        return new ExeOrderPostProcessor();
    }
}
