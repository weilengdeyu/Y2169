package cn.school.service;

import cn.school.entity.UserInfo;
import cn.school.util.PageUtil;

/**
 * Created by Happy on 2018-12-20.
 */

/**
 * 用户Service
 */
public interface IUserInfoService {
    //01.用于登录的方法
    public UserInfo isLogin(UserInfo info);
    //02.写一个获取单页数据的方法
    public PageUtil<UserInfo> getOnePageData(int pageIndex, int pageSize) throws  Exception;
    //03.写一个获取单页数据的方法  带条件查询
    public PageUtil<UserInfo> getOnePageData(int pageIndex,int pageSize,UserInfo info) throws  Exception;
}
