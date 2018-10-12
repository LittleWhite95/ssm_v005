package com.demo.ssm.controller;

import com.demo.ssm.appcomm.MyBatisUtil;
import com.demo.ssm.entity.Userinfo;
import com.demo.ssm.service.UserinfoBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by Administrator on 2018/10/9 0009.
 */
@Controller
@RequestMapping("userinfo")
public class UserinfoController {
//    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    UserinfoBiz userinfoBiz;
    @Resource(name = "biz")
    public void setUserinfoBiz(UserinfoBiz userinfoBiz) {
        this.userinfoBiz = userinfoBiz;
    }




    public UserinfoController() {
        System.out.println(" userinfoBiz  spring is ok.................... ");
    }

    @RequestMapping(value = "search")
    public ModelAndView getAllUserInfo() throws IOException {
        ModelAndView m = new ModelAndView("user");
        List<Userinfo> search = userinfoBiz.search();
        m.addObject("search",search);
        for (Userinfo userinfo : search) {
            System.out.println(userinfo);
        }
        return m;
    }

    @RequestMapping(value = "addUserInfo")
    public String addUserInfo(HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String realname = request.getParameter("realname");
        String userphone = request.getParameter("userphone");
        String state = request.getParameter("state");
        String useraddr = request.getParameter("useraddr");
        Userinfo userinfo = new Userinfo(username, useraddr, userphone, realname, state);
        userinfoBiz.addUserInfo(userinfo);
        System.out.println(userinfo.toString());
        return "user";
    }

    @RequestMapping(value = "deleteUserInfo")
    public String deleteUserInfo(HttpServletRequest request) {
        String useridStr = request.getParameter("myuserid");
        System.out.println(useridStr);
        Integer userid = 0;
        if (useridStr != null) {
            userid = Integer.parseInt(useridStr);
        }
        userinfoBiz.deleteUserInfo(userid);
        return "user";
    }

    @RequestMapping("updateUserInfo")
    public String updateUserInfo(HttpServletRequest request) {
        String username = request.getParameter("u_username");
        String realname = request.getParameter("u_realname");
        String userphone = request.getParameter("u_userphone");
        String state = request.getParameter("u_userstate");
        String useraddr = request.getParameter("u_useraddr");
        Userinfo userinfo = new Userinfo(username, useraddr, userphone, realname, state);
        userinfoBiz.updateUserInfo(userinfo);
        return "user";
    }

}
