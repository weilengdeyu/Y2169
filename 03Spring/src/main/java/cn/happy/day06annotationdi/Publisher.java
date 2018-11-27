package cn.happy.day06annotationdi;/**
 * Created by Happy on 2018-11-20.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-20
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//01.Publisher 出版社
@Component("pub")
public class Publisher {
    @Value("北京大学出版社")
    private String publisherName; //出版社名称

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                '}';
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
