package cn.happy.day13aop04;/**
 * Created by Happy on 2018-11-22.
 */

import org.springframework.aop.ThrowsAdvice;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println(ex.getMessage()+"出错了");
    }
}
