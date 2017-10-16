package cn.wj.demo2;

import cn.wj.demo.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WJ on 2017/10/15.
 */
public class Demo3 {

    @Test
    public void run1(){
        // 创建工厂，加载核心配置文件(单例)
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        Car1 car1 = (Car1)ac.getBean("car1");
        // 调用对象的方法执行
        System.out.println(car1);
    }

    @Test
    public void run2(){
        // 创建工厂，加载核心配置文件(单例)
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        Person person = (Person) ac.getBean("person");
        // 调用对象的方法执行
        System.out.println(person);
    }
}
