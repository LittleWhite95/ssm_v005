package com.demo.ssm.entity;

public class Member {
    private Integer mid;

    private String mname;

    private String mimg;

    private String mexp;

    private String mjob;

    private String mskill;

    private String mphone;

    private String mqq;

    private String mstatus;

    private Integer miteamid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg == null ? null : mimg.trim();
    }

    public String getMexp() {
        return mexp;
    }

    public void setMexp(String mexp) {
        this.mexp = mexp == null ? null : mexp.trim();
    }

    public String getMjob() {
        return mjob;
    }

    public void setMjob(String mjob) {
        this.mjob = mjob == null ? null : mjob.trim();
    }

    public String getMskill() {
        return mskill;
    }

    public void setMskill(String mskill) {
        this.mskill = mskill == null ? null : mskill.trim();
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    public String getMqq() {
        return mqq;
    }

    public void setMqq(String mqq) {
        this.mqq = mqq == null ? null : mqq.trim();
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus == null ? null : mstatus.trim();
    }

    public Integer getMiteamid() {
        return miteamid;
    }

    public void setMiteamid(Integer miteamid) {
        this.miteamid = miteamid;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mimg='" + mimg + '\'' +
                ", mexp='" + mexp + '\'' +
                ", mjob='" + mjob + '\'' +
                ", mskill='" + mskill + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mqq='" + mqq + '\'' +
                ", mstatus='" + mstatus + '\'' +
                ", miteamid=" + miteamid +
                '}';
    }
}