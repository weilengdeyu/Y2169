package cn.happy.day05autowire;

/**
 * Created by Happy on 2018-11-18.
 */
public class MySingleton {
    private static MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }
}
