package cn.wj.demo2;

/**
 * 演示的构造方法的注入的方式
 * Created by WJ on 2017/10/15
 */
public class Car1 {
    private String cName;
    private Double cPrice;

    public Car1(String cName, Double cPrice) {
        this.cName = cName;
        this.cPrice = cPrice;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "cName='" + cName + '\'' +
                ", cPrice=" + cPrice +
                '}';
    }
}
