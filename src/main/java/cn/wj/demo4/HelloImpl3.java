package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/11/27
 */
public class HelloImpl3 implements HelloApi {

    private String message;
    private int index;

    public HelloImpl3(String message, int index) {
        this.message = message;
        this.index = index;
    }

    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
