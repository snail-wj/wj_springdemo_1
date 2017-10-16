package cn.wj.demo1;

/**
 * Created by WJ on 2017/10/15.
 */
public class CustomerServiceImpl {

    //提供一个成员属性，提供set方法
    private CustomerDaoImpl customerDao;

    public void setCustomerDao(CustomerDaoImpl customerDao) {
        this.customerDao = customerDao;
    }

    public void save(){
        System.out.println("我是业务层service...");
        customerDao.save();
    }
}
