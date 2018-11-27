package cn.happy.day10;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day07staticproxy.ProxySubject;
import cn.happy.day07staticproxy.RealSubject;
import cn.happy.day15advisor02.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181122 {

    //顾问
    @Test
    public void testAdvisor(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day15advisor02.xml");
        SomeService service=(SomeService)ctx.getBean("proxyService");
        service.add();
        service.list();
    }
    //异常增强
    @Test
    public void testException(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day10aop04.xml");
        SomeService service=(SomeService)ctx.getBean("proxyService");
        service.add();
        service.list();

    }

    //环绕增强
    @Test
    public void tsetArround(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day10aop03.xml");
        SomeService service=(SomeService)ctx.getBean("proxyService");
        service.list();
    }


    //后置增强
    @Test
    public void testAfter(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day10aop02.xml");
        SomeService service=(SomeService)ctx.getBean("proxyService");
        service.list();
        service.add();
    }


    //前置增强
    @Test
    public void testBean(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day10aop01.xml");
        SomeService service=(SomeService)ctx.getBean("proxyService");
        service.list();
        service.add();
    }

}












