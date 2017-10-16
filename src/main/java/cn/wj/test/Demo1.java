package cn.wj.test;

/**
 * Created by WJ on 2017/10/15.
 */
public class Demo1 {
    private static Demo1 ourInstance = new Demo1();

    public static Demo1 getInstance() {
        return ourInstance;
    }

    private Demo1() {
    }
}
