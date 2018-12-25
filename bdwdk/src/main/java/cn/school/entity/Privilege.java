package cn.school.entity;/**
 * Created by Happy on 2018-04-07.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-07
 * 博客地址:www.cnblogs.com/weilengdeyu
 */

/**
 * 权限实体
 */
public class Privilege {
    /**
     * 权限编号
     */
    private Integer id;
    /**
     * 权限名称对应地址url
     */
    private String url; //权限导航的地址  /roleList
    /**
     * 权限名称
     */
    private String name; // 用户管理
    /**
     * 父权限编号
     */
    private Integer parent; //权限编号
    /**
     * 权限小图标
     */
    private String icon; //小图标，小logo

    /**
     * 小Tip：是否被选中，easyui中使用，数据库中需要字段
     */
    private boolean checked;

    /**
     * 子权限集合
     */
    private List<Privilege> children=new ArrayList<Privilege>();

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }




    public List<Privilege> getChildren() {
        return children;
    }

    public void setChildren(List<Privilege> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
