package cn.school.dao;

import cn.school.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2018-12-20.
 */

/**
 * 用户DAO
 */
public interface IUserInfoDAO {
    //01.用于登录的方法
    public UserInfo isLogin(UserInfo info);
    //02.写一个获取单页数据的方法
    public List<UserInfo> getOnePageData(Map<String,Object> map) throws  Exception;
    //03.写一个获取整张表记录总数的方法
    public int getTotalCount(UserInfo info);
}
