package cn.happy.day19;/**
 * Created by Happy on 2018-11-15.
 */
import cn.happy.day18aspectjxml.SomeService;
import cn.happy.day19jdbctemplate.entity.Book;
import cn.happy.day19jdbctemplate.service.IBookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181127 {

    //JDBCTemplate
    @Test
    public void testjdbcTemplate(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day19jdbc.xml");
        IBookService service=(IBookService)ctx.getBean("bookServcie");
        List<Book> list = service.findAll();
        for (Book item:list){
            System.out.println(item.getBookname());
        }

    }
}












