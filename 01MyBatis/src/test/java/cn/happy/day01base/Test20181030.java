package cn.happy.day01base;/**
 * Created by Happy on 2018-10-30.
 */

import cn.mybatis.day01base.dao.IMovieDAO;
import cn.mybatis.day01base.dao.impl.MovieDAOImpl;
import cn.mybatis.day01base.entity.Movie;
import org.junit.Test;

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-10-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Test20181030 {
    @Test
    public void t1() throws Exception {
       IMovieDAO dao=new MovieDAOImpl();
        List<Movie> list = dao.findAll();
        for (Movie movie:list) {
            System.out.println(movie.getMoviename());
        }
    }

}
