package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/12/2
 */
public class HelloApiDecorator implements HelloApi {

    private HelloApi helloApi;

    public HelloApiDecorator() {
    }

    public HelloApiDecorator(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    public HelloApi getHelloApi() {
        return helloApi;
    }

    public void setHelloApi(HelloApi helloApi) {
        this.helloApi = helloApi;
    }

    public void sayHello() {
        helloApi.sayHello();
    }
}
