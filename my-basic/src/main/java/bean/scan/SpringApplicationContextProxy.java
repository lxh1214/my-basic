package bean.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by liuxianhu on 2015/10/16.
 */

@Component
public class SpringApplicationContextProxy {

    @Autowired
    ApplicationContext applicationContext;

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
