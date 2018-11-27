package cn.happy.day09cglibdynamicproxy;/**
 * Created by Happy on 2018-11-22.
 */

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-22
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class CglibTest {
    public static void main(final String[] args) {
        //1.实例化目标对象
        final SomeService service=new SomeService();
        //2.EnHancer
        Enhancer enhancer=new Enhancer();
        //3.模板
        enhancer.setSuperclass(SomeService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            /** Object 代理类
             *  method：目标对象的方法
             *  objs：目标对象的方法参数
             *  MethodProxy：代理类对方法的代理引用----->目标类的方法
             */
            public Object intercept(Object o, Method method, Object[] objs, MethodProxy methodProxy) throws Throwable {
                System.out.println("写入日志");
                Object result = methodProxy.invoke(service, objs);
                return result;
            }
        });
        SomeService proxy=(SomeService)enhancer.create();
        proxy.doSome();






    }

}
