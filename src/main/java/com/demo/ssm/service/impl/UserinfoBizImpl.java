package com.demo.ssm.service.impl;

import com.demo.ssm.dao.mapper.UserinfoMapper;
import com.demo.ssm.entity.Userinfo;
import com.demo.ssm.service.UserinfoBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/10/9 0009.
 */
@Service("biz")
public class UserinfoBizImpl implements UserinfoBiz {
    @Resource(name = "userinfoMapper")
    UserinfoMapper userinfoMapper;
    @Override
    public List<Userinfo> search() throws IOException {
        return userinfoMapper.selectByExample(null);
    }

    @Override
    public void addUserInfo(Userinfo userinfo) {
        userinfoMapper.insert(userinfo);
    }

    @Override
    public void updateUserInfo(Userinfo userinfo) {
        userinfoMapper.updateByPrimaryKey(userinfo);
    }

    @Override
    public void deleteUserInfo(Integer userid) {
        userinfoMapper.deleteByPrimaryKey(userid);
    }


}
