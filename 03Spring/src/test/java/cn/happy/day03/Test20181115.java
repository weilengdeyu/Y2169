package cn.happy.day03;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day02print.Printer;
import cn.happy.day03aop.dao.IUserDAO;
import cn.happy.day03aop.entity.User;
import cn.happy.day03aop.service.IUserService;
import cn.happy.day03aop.service.UserServiceImpl;
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
        IUserService service=(IUserService) ctx.getBean("service");
        service.save(new User());

    }

}












