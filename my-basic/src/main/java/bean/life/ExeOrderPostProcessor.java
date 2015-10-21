package bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * Created by liuxianhu on 2015/10/19.
 *
 * 在加载所有bean 设置完属性后
 *
 * 接口必须返回bean 要不然 spring 容器无法管理 bean
 *
 * Ordered 出现多个 BeanPostProcessor 时 则按接口实现的顺序 执行 Integer 大的 在前面
 *
 */
@Component
public class ExeOrderPostProcessor implements BeanPostProcessor, Ordered{

    //后并在执行init-method 之前
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("ExeOrderPostProcessor postProcessBeforeInitialization:" + beanName);
        return bean;
    }

    //后并在执行init-method 之后
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("ExeOrderPostProcessor postProcessAfterInitialization:" + beanName);

        return bean;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
