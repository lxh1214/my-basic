package customAnnotation;

import java.lang.annotation.*;

/**
 * Created by liuxianhu on 2015/10/21.
 */
@Target({ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAspect {

}
