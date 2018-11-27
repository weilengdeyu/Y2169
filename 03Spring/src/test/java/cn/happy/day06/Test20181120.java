package cn.happy.day06;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day04xmldi.MyCollection;
import cn.happy.day06annotationdi.Book;
import cn.happy.day06annotationdi.Publisher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181120 {
    @Test
    public void testBean(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-day06AnnotationDI.xml");
        Book book=(Book) ctx.getBean("book");
        System.out.println(book);
    }

}












