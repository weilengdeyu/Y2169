package cn.happy.day19jdbctemplate.dao;

import cn.happy.day19jdbctemplate.entity.Book;

import java.util.List;

/**
 * Created by Happy on 2018-11-27.
 */
public interface IBookDAO {

    public List<Book> findAll();

}
