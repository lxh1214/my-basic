package bean.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by liuxianhu on 2015/10/21.
 */

@Service
public class Item {
    @Value("annotationName")
    private String name;

    @Value("10")
    private Integer age;

    public double getPrice() {
        return new Double("88.88");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Object Item [ age: "+age + ", name :" + name+ "]";
    }
}
