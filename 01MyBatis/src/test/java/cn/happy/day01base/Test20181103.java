package cn.happy.day01base;/**
 * Created by Happy on 2018-10-30.
 */

import cn.mybatis.day01base.dao.IMovieDAO;
import cn.mybatis.day01base.dao.impl.INewsDAO;
import cn.mybatis.day01base.dao.impl.MovieDAOImpl;
import cn.mybatis.day01base.entity.Movie;
import cn.mybatis.day01base.entity.News;
import cn.mybatis.day01base.util.MovieCondition;
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
public class Test20181103 {

    //2.multi select
    @Test
    public void t3() throws Exception {
        SqlSession session = MyBatisUtil.getSession();
        IMovieDAO dao=session.getMapper(IMovieDAO.class);
        MovieCondition condition=new MovieCondition();
        condition.setMoviename("无双");
        condition.setMoviedirector("庄文强");
        List<Movie> list = dao.multipleSelectByCondition(condition);
        for (Movie item:list){
            System.out.println(item.getMoviename());
        }
    }

    //1.验证ResultMaP
    @Test
    public void t2() throws Exception {
        SqlSession session = MyBatisUtil.getSession();
        INewsDAO dao=session.getMapper(INewsDAO.class);
        List<News> list = dao.findAll();
        for (News item:list){
            System.out.println(item.getNewid());
        }
    }
    @Test
    public void t1() throws Exception {
        SqlSession session = MyBatisUtil.getSession();

        IMovieDAO dao=session.getMapper(IMovieDAO.class);

        Movie movie=new Movie();
        movie.setMoviename("首富");

        List<Movie> list = dao.getLikeData("首富");

        for (Movie item:list){
            System.out.println(item.getMoviename());
        }
    }
}
