package cn.happy.day19jdbctemplate.service;

import cn.happy.day19jdbctemplate.entity.Book;

import java.util.List;

/**
 * Created by Happy on 2018-11-27.
 */
public interface IBookService {

    public List<Book> findAll();

}
