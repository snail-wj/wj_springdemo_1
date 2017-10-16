package cn.wj.demo2;

/**
 * Created by WJ on 2017/10/15.
 */
public class Person {
    private String name;
    private Car1 car;

    public Person(String name, Car1 car) {
        this.name = name;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
