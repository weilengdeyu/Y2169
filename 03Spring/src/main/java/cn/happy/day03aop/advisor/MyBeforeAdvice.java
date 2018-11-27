package cn.happy.day03aop.advisor;/**
 * Created by Happy on 2018-11-15.
 */

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    /**
     * Method method：方法的全名称  目标方法
     * Object[] args 目标方法的参数
     * target 目标类型
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("method====================="+method);
        //System.out.println("args====================="+args[0]);
        System.out.println("target====================="+target);
        System.out.println("===========Log============================");
    }
}
