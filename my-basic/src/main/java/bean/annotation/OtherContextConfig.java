package bean.annotation;

import bean.OneBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liuxianhu on 2015/10/19.
 */
@Configuration
public class OtherContextConfig {

    @Bean
    OneBean oneBean() {
        return new OneBean();
    }

}
