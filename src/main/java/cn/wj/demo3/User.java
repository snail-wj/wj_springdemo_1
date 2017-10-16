package cn.wj.demo3;

import cn.wj.demo2.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 *  演示的集合注入的方式
 * Created by WJ on 2017/10/15
 */
public class User {
    private List<String> arras;
    private Map<String,String> map;
    private Properties properties;

    public void setArras(List<String> arras) {
        this.arras = arras;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "arras=" + arras +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
