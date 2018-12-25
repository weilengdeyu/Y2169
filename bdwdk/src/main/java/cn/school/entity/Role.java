package cn.school.entity;/**
 * Created by Happy on 2018-04-07.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-07
 * 博客地址:www.cnblogs.com/weilengdeyu
 */

/**
 * 角色实体
 */
public class Role {
    /**
     * 角色编号
     */
  private Integer rid;
    /**
     * 角色名称
     */
  private String roleName;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
