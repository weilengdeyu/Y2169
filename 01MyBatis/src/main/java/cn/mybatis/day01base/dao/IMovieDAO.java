package cn.mybatis.day01base.dao;

import cn.mybatis.day01base.entity.Movie;

import java.util.List;

/**
 * Created by Happy on 2018-10-30.
 */
public interface IMovieDAO {
    //显示所有电影 的信息
    public List<Movie> findAll() throws Exception;
    //1.根据电影名称检索整个电影对象
    public Movie getMovieByMovieName(String movieName) throws Exception;
}
