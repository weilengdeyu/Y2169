package cn.happy.day06annotationdi;/**
 * Created by Happy on 2018-11-20.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-20
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Component
//默认将类名称首字母小写变成对象名
public class Book {
    //注入域属性
    /*@Resource*/
    //默认按照类型装配的
    @Autowired
    @Qualifier("pub")
    private Publisher publisher;
    @Value("小米思维的互联网+")
    private String bookName;
    @Value("60.55")
    private double bookPrice;

    @Override
    public String toString() {
        return "Book{" +
                "publisher=" + publisher +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
