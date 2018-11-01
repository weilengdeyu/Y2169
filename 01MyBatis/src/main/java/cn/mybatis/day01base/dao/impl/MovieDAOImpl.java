package cn.mybatis.day01base.dao.impl;/**
 * Created by Happy on 2018-10-30.
 */

import cn.mybatis.day01base.dao.IMovieDAO;
import cn.mybatis.day01base.entity.Movie;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.security.sasl.SaslException;
import java.io.InputStream;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-10-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MovieDAOImpl implements IMovieDAO {
    @Override
    public List<Movie> findAll() throws Exception {
       //01.我们预习过会发现，我们要想和DB进行通信，需要一个sesssion。session的创建者是sessionFactory。
        //那么sessionFactory如何生成 ，通过一个SqlSessionFactoryBuilder的build的方法来的。
       //1.指定一个路径文件，配置文件
        String path="mybatis.xml";
        //2. 将路径字符串转成输入流
        InputStream is=Resources.getResourceAsStream(path);
        //3.创建出Builder对象
        SqlSessionFactoryBuilder sb=  new SqlSessionFactoryBuilder();
        //4.可以通过builder构建工厂
        SqlSessionFactory factory = sb.build(is);
        //5.构建session   session是和DB进行交互的一个数据入口
        SqlSession session = factory.openSession();
        //'6.通过selectList方法执行mapper中id对应的sql文件
        List<Movie> list = session.selectList("cn.mybatis.day01base.dao.IMovieDAO.findAll");
        return list;

    }

    @Override
    public Movie getMovieByMovieName(String movieName) throws Exception {
        //01.我们预习过会发现，我们要想和DB进行通信，需要一个sesssion。session的创建者是sessionFactory。
        //那么sessionFactory如何生成 ，通过一个SqlSessionFactoryBuilder的build的方法来的。
        //1.指定一个路径文件，配置文件
        String path="mybatis.xml";
        //2. 将路径字符串转成输入流
        InputStream is=Resources.getResourceAsStream(path);
        //3.创建出Builder对象
        SqlSessionFactoryBuilder sb=  new SqlSessionFactoryBuilder();
        //4.可以通过builder构建工厂
        SqlSessionFactory factory = sb.build(is);
        //5.构建session   session是和DB进行交互的一个数据入口
        SqlSession session = factory.openSession();
        Movie movie= (Movie)session.selectOne("cn.mybatis.day01base.dao.IMovieDAO.getMovieByMovieName", movieName);
        return movie;
    }

    @Override
    public int addMovie(Movie movie) throws Exception {
        String path="mybatis.xml";
        InputStream is=Resources.getResourceAsStream(path);
        SqlSessionFactoryBuilder sb=  new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = sb.build(is);
        SqlSession session = factory.openSession();


        int count = session.insert("cn.mybatis.day01base.dao.IMovieDAO.addMovie", movie);
        session.commit(); //增   删  改操作一定要执行在事务环境中。
        return count;
    }


}
