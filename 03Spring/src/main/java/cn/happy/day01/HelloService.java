package cn.happy.day01;/**
 * Created by Happy on 2018-11-15.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class HelloService {
    private String info;
    public HelloService(){
        System.out.println("Spring容器已经创建了HelloService实例");
    }
    public void work(){
        System.out.println("Work"+info);
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
