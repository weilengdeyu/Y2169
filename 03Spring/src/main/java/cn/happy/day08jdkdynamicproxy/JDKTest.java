package cn.happy.day08jdkdynamicproxy;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Happy on 2017-10-12.
 */
public class JDKTest {
    //psvm
    public static void main(String[] args) {

         //1.我得有一个代理对象
        //创建出一个SomeServiceImpl对象
        final SomeServiceImpl service=new SomeServiceImpl();
        //2.ClassLoader
        ISomeService proxy = (ISomeService)Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            //执行  反射
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("before===============");
                Object result = method.invoke(service, args);
                System.out.println("after===============");
                return result;
            }
        });

        //02,代理对象的方法调度
        proxy.doSome();
        proxy.doXXX();

    }
}
