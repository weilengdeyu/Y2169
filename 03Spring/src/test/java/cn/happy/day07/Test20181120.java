package cn.happy.day07;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day06annotationdi.Book;
import cn.happy.day07staticproxy.ProxySubject;
import cn.happy.day07staticproxy.RealSubject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181120 {
    @Test
    public void testBean(){
         //做一个增强类
        ProxySubject proxy=new ProxySubject();
        RealSubject real=new RealSubject();
        proxy.setSubject(real);
        proxy.request();
    }

}












