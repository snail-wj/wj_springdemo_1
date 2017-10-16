package cn.wj.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试IOC的程序
 * Created by WJ on 2017/10/15
 */
public class Demo1 {

    /**
     * 原来的方式,控制权由Demo1来执行
     */
    @Test
    public void run1(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("wj");
        userService.sayHello();
    }

    /**
     * 现在的方式，使用spring的框架的方式，IOC
     */
    @Test
    public void run2(){
        // 创建工厂，加载核心配置文件(单例)
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        UserService userService = (UserServiceImpl)ac.getBean("userService");
        // 调用对象的方法执行
        userService.sayHello();
    }

    /**
     * 现在的方式，使用spring的框架的方式，IOC
     * 可以看到销毁的方法
     */
    @Test
    public void run3(){
        // 创建工厂，加载核心配置文件(单例)
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        UserService userService = (UserServiceImpl)ac.getBean("userService");
        // 调用对象的方法执行
        userService.sayHello();
        // 关闭工厂
        ac.close();
    }

    /**
     * 依赖注入的概念的解释
     */
    @Test
    public void run4(){
        // 创建工厂，加载核心配置文件(单例)
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        UserService userService = (UserServiceImpl)ac.getBean("userService");
        // 调用对象的方法执行
        userService.sayHello();
    }
}
