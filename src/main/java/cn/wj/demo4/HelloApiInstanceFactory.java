package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/11/26
 */
public class HelloApiInstanceFactory {
    public HelloApi newInstance(String message){
        return new HelloImp2(message);
    }
}
