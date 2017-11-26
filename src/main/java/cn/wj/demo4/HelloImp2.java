package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/11/26
 */
public class HelloImp2 implements HelloApi {

    private String message;

    public HelloImp2() {
        this.message = "Hello World";
    }

    public HelloImp2(String message) {
        this.message = message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
