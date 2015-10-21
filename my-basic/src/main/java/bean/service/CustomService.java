package bean.service;

import customAnnotation.CustomAspect;
import org.springframework.stereotype.Service;

/**
 * Created by liuxianhu on 2015/10/21.
 */

@Service
public class CustomService {

    public void hello() {
        System.out.println("CustomService public void hello ");
    }

    public void hello(String a) {

        System.out.println("CustomService public void hello a: "+ a);
    }

    @CustomAspect
    public void helloWithAnnotation( String a) {

        System.out.println("CustomService public void helloWithAnnotation a: "+ a);
    }

    @CustomAspect
    public void helloWithMethoParameterAnnotation(@CustomAspect String a) {

        System.out.println("CustomService public void helloWithMethoParameterAnnotation a: "+ a);
    }



    protected void helloPrivate() {
        System.out.println("CustomService protected void helloPrivate");
    }


    public Integer add() {
        System.out.println("CustomService  public Integer add");
        return 1;
    }

}
