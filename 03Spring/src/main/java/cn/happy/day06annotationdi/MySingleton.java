package cn.happy.day06annotationdi;

/**
 * Created by Happy on 2018-11-20.
 */
public class MySingleton {

    private static MySingleton ourInstance = new MySingleton(); //饿汉模式

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }
}
