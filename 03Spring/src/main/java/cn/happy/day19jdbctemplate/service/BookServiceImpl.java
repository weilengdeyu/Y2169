package cn.happy.day19jdbctemplate.service;/**
 * Created by Happy on 2018-11-27.
 */

import cn.happy.day19jdbctemplate.dao.IBookDAO;
import cn.happy.day19jdbctemplate.entity.Book;

import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-27
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class BookServiceImpl implements IBookService {
    private IBookDAO bookDAO;
    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    public IBookDAO getBookDAO() {
        return bookDAO;
    }

    public void setBookDAO(IBookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
}
