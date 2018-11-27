package cn.happy.day17aspectj;/**
 * Created by Happy on 2018-11-24.
 */

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-24
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Aspect
public class MyAspect {
    //注解：依赖   给类的  方法   字段的   参数的
    @Pointcut("execution(* *..*.day17aspectj.*.*(..))")
    public void myselect(){

    }
   /* @Before("execution(* *..*.day17aspectj.*.*(..))")
    public void myBefore(){
        System.out.println("before===============================");
    }

    @AfterReturning(value = "execution(* *..*.day17aspectj.*.*(..))",returning = "result")
    public void myAfterReturing(Object result) {
        System.out.println("after==============================="+result);
    }
*/
   //环绕增强
    @Around("myselect()")
    public void myAfterReturing(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("before===============================");
        jp.proceed();//隔离点  ，调度 前置增强
        System.out.println("after-------------------------");
    }

}
