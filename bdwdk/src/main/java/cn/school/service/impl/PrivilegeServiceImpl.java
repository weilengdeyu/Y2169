package cn.school.service.impl;/**
 * Created by Happy on 2018-04-07.
 */

import cn.school.dao.IPrivilegeDAO;
import cn.school.entity.Privilege;
import cn.school.service.IPrivilegeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-07
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Service("privilegeService")
/**
 * 权限service实现类
 */
public class PrivilegeServiceImpl implements IPrivilegeService {
    /**
     * 在service中需要植入 DAO接口对象
     */
    @Resource(name = "IPrivilegeDAO")
    private IPrivilegeDAO privilegeDAO;

    /**
     * 调度DAO层的根据用户编号获取所有权限的方法
     * @param uid  用户编号
     * @return
     * @throws Exception
     */
    public List<Privilege> getAllPrivileges(Integer uid) throws Exception {
        return privilegeDAO.getAllPrivileges(uid);
    }

    public IPrivilegeDAO getPrivilegeDAO() {
        return privilegeDAO;
    }

    public void setPrivilegeDAO(IPrivilegeDAO privilegeDAO) {
        this.privilegeDAO = privilegeDAO;
    }
}
