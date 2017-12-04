package cn.wj.demo4;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
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

    @Test
    public void testConstructorDependencyInjectTest(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloWorld.xml");
        //获取根据参数索引依赖注入的Bean
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();
        //获取根据参数类型依赖注入的Bean
        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();
        //获取根据参数名字依赖注入的Bea
        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }

    @Test
    public void testSetterDependencyInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloWorld.xml");
        HelloApi bean5 = beanFactory.getBean("bean5", HelloApi.class);
        bean5.sayHello();
    }

    @Test
    public void testBooleanDependencyInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloWorld.xml");
        BooleanTestBean bean = beanFactory.getBean("bean6-1", BooleanTestBean.class);
        bean.saySuccess();
        BooleanTestBean bean2 = beanFactory.getBean("bean6-2", BooleanTestBean.class);
        bean2.saySuccess();
    }

    @Test
    public void testIdRefTestBean(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloWorld.xml");
        IdRefTestBean idrefBean1 = beanFactory.getBean("idrefBean1", IdRefTestBean.class);
        System.out.println(idrefBean1.getId());
        IdRefTestBean idrefBean2 = beanFactory.getBean("idrefBean2", IdRefTestBean.class);
        System.out.println(idrefBean2.getId());
    }

    @Test
    public void testListInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("listInject.xml");
        ListTestBean listBean = beanFactory.getBean("listBean", ListTestBean.class);
        System.out.println(listBean.getValues());
    }

    @Test
    public void testSetInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("listInject.xml");
        SetTestBean setBean = beanFactory.getBean("setBean", SetTestBean.class);
        System.out.println(setBean.getValues());
    }

    @Test
    public void testarraysInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("listInject.xml");
        ArrayTestBean arrayBean = beanFactory.getBean("arrayBean", ArrayTestBean.class);
        System.out.println(arrayBean.getArray() );
        System.out.println(arrayBean.getArray2());

    }

    @Test
    public void testmapInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("listInject.xml");
        MapTestBean mapBean = beanFactory.getBean("mapBean", MapTestBean.class);
        System.out.println(mapBean);
    }

    @Test
    public void testPropertiesInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("listInject.xml");
        PropertiesTestBean propertiesBean = beanFactory.getBean("propertiesBean", PropertiesTestBean.class);
        System.out.println(propertiesBean.getValues().toString());
    }

    @Test
    public void testProperties2Inject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("listInject.xml");
        PropertiesTestBean propertiesBean2 = beanFactory.getBean("propertiesBean2", PropertiesTestBean.class);
        System.out.println(propertiesBean2.getValues().toString());
    }

    @Test
    public void testBeanInject(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanInject.xml");
        HelloApiDecorator bean1 = beanFactory.getBean("bean1", HelloApiDecorator.class);
        bean1.sayHello();
        HelloApiDecorator bean2 = beanFactory.getBean("bean2", HelloApiDecorator.class);
        bean2.sayHello();
    }

    @Test
    public void testBeanParentInject(){
        //初始化父容器
        ApplicationContext parentBeanContext = new ClassPathXmlApplicationContext("parentBeanInject.xml");
        //初始化当前容器
        ApplicationContext localBeanContext = new ClassPathXmlApplicationContext(new String[]{"localBeanInject.xml"}, parentBeanContext);
        HelloApi helloApi = localBeanContext.getBean("bean1", HelloApi.class);
        HelloApi bean2 = localBeanContext.getBean("bean2", HelloApi.class);
        helloApi.sayHello();
        bean2.sayHello();
    }

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleByConstructor() throws Throwable{
        try {
            new ClassPathXmlApplicationContext("circleInjectByConstructor.xml");
        }catch (Exception e){
            //因为要在circle3是抛出
            Throwable e1 = e.getCause().getCause().getCause();
            throw  e1;
        }

    }

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleBySetterAndPrototype()throws Throwable{
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("circleInjectByConstructor.xml");
            System.out.println(ctx.getBean("circleA"));
        }catch (Exception e){
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
