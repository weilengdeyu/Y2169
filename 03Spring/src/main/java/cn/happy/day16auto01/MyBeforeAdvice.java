package cn.happy.day16auto01;/**
 * Created by Happy on 2018-11-22.
 */

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("before===================");
    }
}
