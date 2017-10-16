package cn.wj.demo1;

import cn.wj.demo.UserService;
import cn.wj.demo.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WJ on 2017/10/15.
 */
public class Demo2 {

    /**
     * 原始方法
     */
    @Test
    public void run1(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.save();
    }

    /**
     *
     */
    @Test
    public void run2(){
        // 创建工厂，加载p配置文件，CustomerDaoImpl创建了，CustomerServiceImpl创建了
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        CustomerServiceImpl customerService = (CustomerServiceImpl)ac.getBean("customerService");
        // 调用对象的方法执行
        customerService.save();
    }

}
