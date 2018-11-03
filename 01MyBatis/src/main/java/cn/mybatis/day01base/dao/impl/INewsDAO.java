package cn.mybatis.day01base.dao.impl;

import cn.mybatis.day01base.entity.News;

import java.util.List;

/**
 * Created by Happy on 2018-11-03.
 */
public interface INewsDAO {
    public List<News> findAll() throws Exception;
}
