package cn.happy.day04xmldi;/**
 * Created by Happy on 2018-11-17.
 */

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-17
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyCollection {
    private String[] names;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
