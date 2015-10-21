package bean.annotation;

import bean.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by liuxianhu on 2015/10/21.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"bean.aop", "bean.service"})
public class AopContextConfig {

    @Autowired
    CustomService service;

}
