package cn.wj.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WJ on 2017/10/15.
 */
public class Demy4 {

    @Test
    public void run1(){
        // 创建工厂，加载核心配置文件(单例)
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        User user = (User)ac.getBean("user");
        // 调用对象的方法执行
        System.out.println(user);
    }
}
