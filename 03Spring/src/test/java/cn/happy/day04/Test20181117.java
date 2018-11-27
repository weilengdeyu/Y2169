package cn.happy.day04;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day04xmldi.MyCollection;
import cn.happy.day04xmldi.Poser;
import cn.happy.day04xmldi.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181117 {
    @Test
    public void testBean(){

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-xmlDI.xml");
        MyCollection collection=(MyCollection) ctx.getBean("collection");
        String[] names = collection.getNames();
        List<String> list = Arrays.asList(names);
        System.out.println(list);
        System.out.println("==============");
        List<String> teacherList = collection.getList();
        Map<String, String> map = collection.getMap();
        //map  entry
        for (Map.Entry<String,String> item:map.entrySet()){
            System.out.println(item.getKey()+"=============="+item.getValue());
        }
        // System.out.println(stu);

    }

}












