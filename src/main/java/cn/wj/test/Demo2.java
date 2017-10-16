package cn.wj.test;


import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by WJ on 2017/10/15.
 */
public class Demo2 {
    private Logger log = Logger.getLogger(Demo2.class);

    @Test
    public void play(){
        System.out.println("打日志之前");
        log.debug("执行了");
        System.out.println("打日志之后");
    }
}
