package cn.happy.day19jdbctemplate.entity;/**
 * Created by Happy on 2018-11-27.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-27
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Book {
    private Integer bookid;
    private String bookname;
    private Integer bookprice;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getBookprice() {
        return bookprice;
    }

    public void setBookprice(Integer bookprice) {
        this.bookprice = bookprice;
    }
}
