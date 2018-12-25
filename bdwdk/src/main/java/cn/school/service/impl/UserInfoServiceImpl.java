package cn.school.service.impl;/**
 * Created by Happy on 2018-12-20.
 */

import cn.school.dao.IUserInfoDAO;
import cn.school.entity.UserInfo;
import cn.school.service.IUserInfoService;
import cn.school.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：微冷的雨
 *
 * @create 2018-12-20
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("userService")
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private IUserInfoDAO userInfoDAO;
    @Override
    public UserInfo isLogin(UserInfo info) {
        return userInfoDAO.isLogin(info);
    }

    //02.获取单页数据的方法
    public PageUtil<UserInfo> getOnePageData(int pageIndex, int pageSize) throws Exception {
        PageUtil<UserInfo> pageUtil=new PageUtil<UserInfo>();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("pageIndex",(pageIndex)*pageSize);
        map.put("pageSize",pageSize);
        //list集合
        List<UserInfo> list = userInfoDAO.getOnePageData(map);
        pageUtil.setList(list);
        //总记录数
        int count = userInfoDAO.getTotalCount(new UserInfo());
        pageUtil.setTotalRecords(count);
        //页大小
        pageUtil.setPageSize(pageSize);
        //总页数
        int pageCount=pageUtil.getTotalRecords()%pageUtil.getPageSize()==0?pageUtil.getTotalRecords()/pageUtil.getPageSize():pageUtil.getTotalRecords()/pageUtil.getPageSize()+1;
        pageUtil.setTotalPages(pageCount);
        //当前页码
        pageUtil.setPageIndex(pageIndex);
        return pageUtil;
    }

    public PageUtil<UserInfo> getOnePageData(int pageIndex, int pageSize, UserInfo info) throws Exception {
        PageUtil<UserInfo> pageUtil=new PageUtil<UserInfo>();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("pageIndex",(pageIndex)*pageSize); //当前页码
        map.put("pageSize",pageSize); //每页的数据量
        map.put("uname",info.getUname());
        //list集合
        List<UserInfo> list = userInfoDAO.getOnePageData(map);
        pageUtil.setList(list);
        //总记录数
        int count = userInfoDAO.getTotalCount(info);
        pageUtil.setTotalRecords(count);
        //页大小
        pageUtil.setPageSize(pageSize);
        //总页数
        int pageCount=pageUtil.getTotalRecords()%pageUtil.getPageSize()==0?pageUtil.getTotalRecords()/pageUtil.getPageSize():pageUtil.getTotalRecords()/pageUtil.getPageSize()+1;
        pageUtil.setTotalPages(pageCount);
        //当前页码
        pageUtil.setPageIndex(pageIndex);
        return pageUtil;
    }
}
