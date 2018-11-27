package cn.happy.day18aspectjxml;/**
 * Created by Happy on 2018-11-24.
 */

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-24
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyAspect {
    //前置增强
    public void select(){
        System.out.println("before=====");
    }
    //后置增强
    public  void myAfter(){
        System.out.println("====after");
    }
    //环绕增强
    public void myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===before");
        pjp.proceed();
        System.out.println("===after");
    }
}