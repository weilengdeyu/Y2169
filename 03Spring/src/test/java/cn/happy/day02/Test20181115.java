package cn.happy.day02;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day01.HelloService;
import cn.happy.day02print.Printer;
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
        Printer printer = (Printer)ctx.getBean("printer");
        printer.print();
    }

}












