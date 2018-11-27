package cn.happy.day11aop02;/**
 * Created by Happy on 2018-11-22.
 */

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("after"+returnValue);
    }
}
