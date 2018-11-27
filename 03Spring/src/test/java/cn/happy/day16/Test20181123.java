package cn.happy.day16;/**
 * Created by Happy on 2018-11-15.
 */
import cn.happy.day18aspectjxml.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181123 {

    //基于XMl的  AspectJ配置
    @Test
    public void testxmlAspectjConfig(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day18aspectjxml.xml");
        SomeService service=(SomeService)ctx.getBean("someService");
        service.add();
        service.list();
    }


    //自动代理，默认顾问自动代理生成器
    @Test
    public void testAspectJAnnotation(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day17aspectj.xml");
        SomeService service=(SomeService)ctx.getBean("someService");
       // AnyService anyService=(AnyService)ctx.getBean("anyService");
        service.add();
        service.list();
        System.out.println("============我是高傲的分割线");
       // anyService.delete();
    }

    //自动代理，默认顾问自动代理生成器
    @Test
    public void testDefaultAdvisorProxyCreator2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day16auto02.xml");
        SomeService service=(SomeService)ctx.getBean("someService");
        service.add();
        service.list();
    }

    //自动代理，默认顾问自动代理生成器
    @Test
    public void testDefaultAdvisorProxyCreator(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day16auto01.xml");
        SomeService service=(SomeService)ctx.getBean("someService");
        service.add();
        service.list();
    }

    //顾问
    @Test
    public void testAspect(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day15advisor02.xml");
        SomeService service=(SomeService)ctx.getBean("proxyService");
        service.add();
        service.list();
    }
}












