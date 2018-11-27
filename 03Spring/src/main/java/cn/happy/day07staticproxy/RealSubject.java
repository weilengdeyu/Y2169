package cn.happy.day07staticproxy;/**
 * Created by Happy on 2018-11-20.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-20
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class RealSubject implements Subject {
    @Override
    public void request() {

        System.out.println("还有77天就是过年，还有41天就是2019年");
    }


}
