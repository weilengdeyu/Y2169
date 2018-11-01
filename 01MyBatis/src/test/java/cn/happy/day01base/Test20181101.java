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

    @Test
    public void t2addMovie() throws Exception {
        IMovieDAO dao=new MovieDAOImpl();
        Movie movie=new Movie("李茶的姑妈","沈腾","开麻团队");
        int count = dao.addMovie(movie);
        System.out.println(count);
    }

        @Test
    public void t1() throws Exception {
       IMovieDAO dao=new MovieDAOImpl();
        Movie movie = dao.getMovieByMovieName("无双");
        System.out.println(movie.getMoviename());
    }
}
