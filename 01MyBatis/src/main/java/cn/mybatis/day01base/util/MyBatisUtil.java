package cn.mybatis.day01base.util;/**
 * Created by Happy on 2018-10-31.
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 作者：微冷的雨
 *
 * @create 2018-10-31
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyBatisUtil {
    //01.我们预习过会发现，我们要想和DB进行通信，需要一个sesssion。session的创建者是sessionFactory。
    //那么sessionFactory如何生成 ，通过一个SqlSessionFactoryBuilder的build的方法来的。
    //1.指定一个路径文件，配置文件
    static String path="mybatis.xml";
    //2. 将路径字符串转成输入流
    static InputStream is;
    static{
        try {
            is= Resources.getResourceAsStream(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //3.创建出Builder对象
    static SqlSessionFactoryBuilder sb=  new SqlSessionFactoryBuilder();
    //4.可以通过builder构建工厂
    static SqlSessionFactory factory = sb.build(is);
    //5.构建session   session是和DB进行交互的一个数据入口

    public static SqlSession getSession(){
      return factory.openSession();

    }
}
