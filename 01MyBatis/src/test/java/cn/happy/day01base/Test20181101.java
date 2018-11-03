package cn.happy.day01base;/**
 * Created by Happy on 2018-10-30.
 */

import cn.mybatis.day01base.dao.IMovieDAO;
import cn.mybatis.day01base.dao.impl.MovieDAOImpl;
import cn.mybatis.day01base.entity.Movie;
import cn.mybatis.day01base.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-10-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181101 {

    //添加
    @Test
    public void t4() throws Exception {

        SqlSession session = MyBatisUtil.getSession();
        IMovieDAO dao = session.getMapper(IMovieDAO.class);//意思：通过动态代理生成一个接口的实现类 ，以后再做MyBatis开发的时候，再也不需要实现类了
        Movie movie=new Movie("西虹市首富222","沈腾","开麻团队");
        int count = dao.addMovie(movie);
       // session.commit();

        System.out.println(count);
    }


    //查询所有
    @Test
    public void t3() throws Exception {

        SqlSession session = MyBatisUtil.getSession();
        IMovieDAO dao = session.getMapper(IMovieDAO.class);//Class????????什么鬼？？？？
        //类型：是谁的类型？   类型.class   对象名.getClass()   Class.forName()
        List<Movie> list = dao.findAll();
        for (Movie movie:list) {
            System.out.println(movie.getMoviename());
        }
    }

    @Test
    public void t2addMovie() throws Exception {
        /*IMovieDAO dao=new MovieDAOImpl();
        Movie movie=new Movie("李茶的姑妈","沈腾","开麻团队");
        int count = dao.addMovie(movie);
        System.out.println(count);*/
    }

        @Test
    public void t1() throws Exception {
      /* IMovieDAO dao=new MovieDAOImpl();
        Movie movie = dao.getMovieByMovieName("无双");
        System.out.println(movie.getMoviename());*/
    }
}
