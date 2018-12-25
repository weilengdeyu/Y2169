package cn.school.service;
import cn.school.entity.Privilege;

import java.util.List;

/**
 * Created by Happy on 2018-04-07.
 */

/**
 * 权限Service
 */
public interface IPrivilegeService {
    /**
     * 1.根据用户编号获取权限集合
     * @param uid  用户编号
     * @return  权限集合
     * @throws Exception  异常声明
     */
    public List<Privilege> getAllPrivileges(Integer uid) throws  Exception;
}
