package cn.happy.day04xmldi;/**
 * Created by Happy on 2018-11-17.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-17
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Car {
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
