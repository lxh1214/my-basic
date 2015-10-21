package bean.scan;

import bean.OneBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * Created by liuxianhu on 2015/10/15.
 */
@Component
public class AnnotationBean {

    private String name;


    private OneBean one;

    public String getName() {
        return name;
    }


    public OneBean getOne() {
        return one;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 是否 应用了 set 注入
    // Autowired 可通过验证 或者 在xml 文件中声明ben的属性 并赋值
    @Required
    @Autowired
    public void setOne(OneBean one) {
        this.one = one;
    }
}
