package cn.wj.demo4;

/**
 * User: WJ
 * Date: 2017/11/26
 */
public class HelloApiStaticFactory {
    //工厂方法
    public static HelloApi newInstance(String message){
        //返回需要的Bean实例
        return new HelloImp2(message);
    }
}
