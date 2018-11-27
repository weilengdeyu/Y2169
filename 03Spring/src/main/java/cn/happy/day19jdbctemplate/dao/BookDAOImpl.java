package cn.happy.day19jdbctemplate.dao;/**
 * Created by Happy on 2018-11-27.
 */

import cn.happy.day19jdbctemplate.entity.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-27
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class BookDAOImpl extends JdbcDaoSupport implements IBookDAO {
    //DAO层  jdbcTemplate

    @Override
    public List<Book> findAll() {
        //直接getJdbcTemplate()  不是空指针
        //给他setXXX()
        //
        JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
        String sql="select * from book";
        //可以使用tab补全
        List<Book> list = jdbcTemplate.query(sql, new RowMapper<Book>() {
            @Override
            /**
             *
             * @param rs   普通的rs，系统的给我的   ，读取器
             * @param i  读取器读取的第几条记录
             * @return book  单个图书对象
             * @throws SQLException
             */
            public Book mapRow(ResultSet rs, int i) throws SQLException {
                Book book = new Book();
                book.setBookid(rs.getInt("bookid"));
                book.setBookname(rs.getString("bookname"));
                book.setBookprice(rs.getInt("bookprice"));
                return book;
            }
        });
        return list;
    }
}
