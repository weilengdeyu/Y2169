package cn.happy.day04xmldi;/**
 * Created by Happy on 2018-11-17.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-17
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Student {
    private int age;
    private String name;
    private Car car;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(int age, String name, Car car) {
        this.age = age;
        this.name = name;
        this.car = car;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
