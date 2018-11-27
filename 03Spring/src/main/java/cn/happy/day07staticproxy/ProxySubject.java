package cn.happy.day07staticproxy;/**
 * Created by Happy on 2018-11-20.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-20
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//代理主题
public class ProxySubject implements Subject {

    //真实主题的对象
    private RealSubject subject;
    @Override
    public void request() {
        System.out.println("before=============");
        subject.request();
        System.out.println("aftter==============");
    }
    //增强真题主题的方法

    public RealSubject getSubject() {
        return subject;
    }

    public void setSubject(RealSubject subject) {
        this.subject = subject;
    }
}
