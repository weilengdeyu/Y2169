package cn.school.dao;
import cn.school.entity.Privilege;

import java.util.List;

/**
 * Created by Happy on 2018-04-07.
 */

/**
 * 权限接口
 */
public interface IPrivilegeDAO {
   /**
    * 1.根据用户编号，获取该用户所有的权限集合
    * @param uid  用户编号
    * @return  该用户所有全案集合
    * @throws Exception  异常上抛
    */
   public List<Privilege> getAllPrivileges(Integer uid) throws  Exception;
}

