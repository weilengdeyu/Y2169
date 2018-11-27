package cn.happy.day01;/**
 * Created by Happy on 2018-11-15.
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181115 {
    @Test
    public void testBean(){
        //01,我要装载applicationContext.xml文件
        //这就是传说中的Spring容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
           HelloService service=(HelloService)ctx.getBean("helloService");
        HelloService service2=(HelloService)ctx.getBean("helloService");
        System.out.println(service.getInfo());
        System.out.println(service2);
    }

}












