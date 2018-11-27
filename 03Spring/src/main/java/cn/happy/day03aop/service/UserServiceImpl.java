package cn.happy.day03aop.service;/**
 * Created by Happy on 2018-11-15.
 */

import cn.happy.day03aop.dao.IUserDAO;
import cn.happy.day03aop.entity.User;

/**
 * 作者：微冷的雨
 *
 * @create 2018-11-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class UserServiceImpl implements IUserService {
    private IUserDAO userDAO;
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    public IUserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
