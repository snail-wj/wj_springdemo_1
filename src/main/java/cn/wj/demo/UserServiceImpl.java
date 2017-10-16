package cn.wj.demo;

/**
 * Created by WJ on 2017/10/15
 */
public class UserServiceImpl implements UserService {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello, " + name);
    }

    public void init() {
        System.out.println("初始化");
    }

    public void destory() {
        System.out.println("销毁方法");
    }
}
