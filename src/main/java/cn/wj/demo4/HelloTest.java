package cn.wj.demo4;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: WJ
 * Date: 2017/11/26
 */
public class HelloTest {

    @Test
    public void testHelloWorld(){
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("helloWorld.xml");

        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        HelloApi hello = context.getBean("hello",HelloApi.class);

        //3、执行业务逻辑
        hello.sayHello();
    }

    @Test
    public void testInstantiatingBeanByConstructor(){
        //使用构造器
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloWorld.xml");
        HelloApi bean1 = beanFactory.getBean("bean1", HelloApi.class);
        bean1.sayHello();
        HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
    }

    @Test
    public void testInstantiatingBeanByStaticFactory(){
        //使用静态工厂的方法
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloWorld.xml");
        HelloApi bean3 = beanFactory.getBean("bean3", HelloApi.class);
        bean3.sayHello();
    }

    @Test
    public void testInstantiatingBeanByInstanceFactory(){
        //使用实例工厂方法
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloWorld.xml");
        HelloApi bean4 = beanFactory.getBean("bean4", HelloApi.class);
        bean4.sayHello();
    }
}
