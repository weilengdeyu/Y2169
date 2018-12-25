package cn.school.controller;/**
 * Created by Happy on 2018-12-20.
 */

import cn.school.entity.Privilege;
import cn.school.entity.UserInfo;
import cn.school.service.IPrivilegeService;
import cn.school.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：微冷的雨
 *
 * @create 2018-12-20
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Controller
public class UserInfoController {
    /**
     * 注入用户的service
     */
    @Autowired
    private IUserInfoService userInfoService;
    /**
     * 注入权限的Service
     */
    @Resource(name = "privilegeService")
    private IPrivilegeService privilegeService;

    @RequestMapping("/isLogin")
    //01.后台登录：：植入用于维持会话的session
    public String isLogin(UserInfo info, HttpSession session) throws Exception {
        UserInfo uinfo = userInfoService.isLogin(info);
        if (uinfo!=null){
            session.setAttribute("userInfo",uinfo);
            //获取登录用户拥有的所有权限集合
            List<Privilege> allPrivileges = getAllPrivileges(uinfo.getUid());
            System.out.println(allPrivileges+"===================");
            session.setAttribute("allPrivileges",allPrivileges);
            //登录成功
            return "/background/main";
        }else {
            return "/background/login";
        }
    }
    //2.登出系统
    @RequestMapping("/logout")
    public String loginOut(HttpSession session) {
        session.removeAttribute("userInfo");
        //1.清空session
        //2.跳转到登录
        return "redirect:/background/login.jsp";
    }
    //3.获取某个用户所有权限的方法
    public List<Privilege> getAllPrivileges(int uid) throws Exception {
        //新的容器 保存有父子关系的权限
        List<Privilege> rootMenus=new ArrayList<Privilege>();
        try {
            //get  Data from db  , this list is not layer list这个集合是平级的，没有任何的对象植入
            List<Privilege> privilegeList = privilegeService.getAllPrivileges(uid);
            for (Privilege item:privilegeList){//原始平级容器
                Privilege childMenu=item;//接收每一项
                int pid = childMenu.getParent(); //当前项目的pid  父分类编号  1
                if (pid==0){  //如果是0，证明是顶级分类
                    rootMenus.add(item); //作为单列集合的直接对象
                }else{
                    for (Privilege innerMenu:privilegeList){  //扫描整个内存中的数据
                        Integer id = innerMenu.getId(); //1
                        if (id==pid){
                            Privilege parentMenu=innerMenu;
                            parentMenu.getChildren().add(childMenu);
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rootMenus;
    }
}
