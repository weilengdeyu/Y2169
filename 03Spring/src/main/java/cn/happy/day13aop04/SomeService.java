package cn.happy.day13aop04;/**
 * Created by Happy on 2018-11-22.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class SomeService {
    public void  list(){
        int result=5/0;
        System.out.println("list");
    }
    public void  add(){
        System.out.println("add");
    }
}
