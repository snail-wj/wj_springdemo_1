package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/11/27
 */
public class HelloImpl4 implements HelloApi {
    private String message;
    private String index;

    //setter method
    public void setMessage(String message) {
        this.message = message;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
