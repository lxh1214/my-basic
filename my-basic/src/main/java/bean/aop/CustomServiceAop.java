package bean.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by liuxianhu on 2015/10/21.
 */

@Aspect
@Service
public class CustomServiceAop {

    //所有公开方法
    @Pointcut("execution(public * * (..))")
    public void anyPublicOperateAspect() {

    }
    // 某个累下的所有方法
    @Pointcut("execution(* bean.service.CustomService.*(..))")
    public void inCustomService() {

    }

    // 方法以add结束
    @Pointcut("execution(* *add(..))")
    public void inAddTailMethod() {

    }

    // 方法以delete开始
    @Pointcut("execution(* delete*(..))")
    public void inPreMethod() {

    }

    // service 包下类的任意方法 不包含 service 子包的类
    @Pointcut("execution(* bean.service.*.*(..))")
    public void packageAnyMethod() {

    }

    // service 包下类的任意方法 包含 service 子包的类所有类方法
    @Pointcut("execution(* bean.service..*.*(..))")
    public void packageAndSunAnyMethod() {

    }


    // 带有@CustomAspect标注的所有类的任意方法
    @Pointcut("@within(customAnnotation.CustomAspect)")
    public void withAnnotation() {

    }



    // 带有@CustomAspect标注的所有类的任意方法
    @Pointcut("@target(customAnnotation.CustomAspect)")
    public void withTargetAnnotation() {

    }

    // 带有@CustomAspect标注的所有类的任意方法
    @Pointcut("@annotation(customAnnotation.CustomAspect)")
    public void withAnAnnotation() {

    }


    //参数带有@CustomAspect标注的方法.
    @Pointcut("@args(customAnnotation.CustomAspect)")
    public void withArgsAnnotation() {

    }

    //方法参数String 类型
    @Pointcut("args(String)")
    public void methArgType() {

    }

    @Before(value = "anyPublicOperateAspect() && inCustomService()  && methArgType() && withAnAnnotation() && withArgsAnnotation()")
    public void anyPublicBefore(JoinPoint joinPoint) {

        Object[] args = joinPoint.getArgs();
        if(args != null) {
            Arrays.asList(args).forEach( e -> System.out.println( "args " + e));
        }

        Object t = joinPoint.getThis();

        System.out.println("proxy source :" + t);

        Object target = joinPoint.getTarget();

        System.out.println("target :" + target);


        Signature signature = joinPoint.getSignature();

        System.out.println("signature getName :" + signature.getName().toString());
        System.out.println("signature :" + signature.toString());

    }
    //ProceedingJoinPoint只在 @Around中能用
//    @Around(value = "anyPublicOperateAspect()")
//    public void t(ProceedingJoinPoint joinPoint) {
//        Object[] args = joinPoint.getArgs();
//        if(args != null) {
//            Arrays.asList(args).forEach( e -> System.out.println(e));
//        }
//
//        Object t = joinPoint.getThis();
//
//        System.out.println("proxy source " + t);
//
//        Object target = joinPoint.getTarget();
//
//        System.out.println("target " + target);
//
//
//        Signature signature = joinPoint.getSignature();
//
//        System.out.println("signature " + signature.getName().toString());
//    }

}
