package cn.happy.day12aop03;/**
 * Created by Happy on 2018-11-22.
 */

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyArroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("before================");
        Object result= invocation.proceed();//目标方法
        System.out.println("after================");
        return result;
    }
}
