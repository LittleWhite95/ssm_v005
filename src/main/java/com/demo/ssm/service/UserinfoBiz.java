package com.demo.ssm.service;

import com.demo.ssm.entity.Userinfo;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;


/**
 * Created by Administrator on 2018/10/9 0009.
 */

public interface UserinfoBiz {
    List<Userinfo> search() throws IOException;

    void addUserInfo(Userinfo userinfo);

    void updateUserInfo(Userinfo userinfo);

    void deleteUserInfo(Integer userid);
}
