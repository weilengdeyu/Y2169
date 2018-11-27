package cn.happy.day08jdkdynamicproxy;

/**
 * Created by Happy on 2017-10-12.
 */
public class SomeServiceImpl implements ISomeService {
    public void doSome() {
        System.out.println("Java编程我最牛，世界第一等！！就像阳哥说的：我认第二，没有人敢自称第一，嚣张啊！！！");
    }

    @Override
    public void doXXX() {
        System.out.println("doXXX");
    }
}
