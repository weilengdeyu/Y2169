package cn.happy.day03aop.dao;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day03aop.entity.User;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class UserDAOImpl implements IUserDAO {
    @Override
    public void save(User user) {
        System.out.println("Save OK!insert a record to db");
    }
}
