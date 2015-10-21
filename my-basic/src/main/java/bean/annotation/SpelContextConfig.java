package bean.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuxianhu on 2015/10/21.
 */
@Configuration
@ComponentScan(basePackages = {"bean.spel"})
public class SpelContextConfig {



}
