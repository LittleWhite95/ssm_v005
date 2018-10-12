package com.demo.ssm.entity;

/**
 * Created by Administrator on 2018/10/9 0009.
 */
public class Userinfo {
    private Integer userid;
    private String username;
    private String useraddr;
    private String userphone;
    private String userrealname;
    private String userstate;

    public Userinfo() {
    }

    public Userinfo(String username, String useraddr, String userphone, String userrealname, String userstate) {
        this.username = username;
        this.useraddr = useraddr;
        this.userphone = userphone;
        this.userrealname = userrealname;
        this.userstate = userstate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname;
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", useraddr='" + useraddr + '\'' +
                ", userphone='" + userphone + '\'' +
                ", userrealname='" + userrealname + '\'' +
                ", userstate='" + userstate + '\'' +
                '}';
    }
}
