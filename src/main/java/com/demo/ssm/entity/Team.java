package com.demo.ssm.entity;

import java.util.Date;

public class Team {
    private Integer tid;

    private String tstatus;

    private String tlogo;

    private String tname;

    private String timg;

    private String tslogan;

    private String tdesc;

    private String tpm;

    private Date ttime;

    private Double tmoney;

    private String tcontract;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTstatus() {
        return tstatus;
    }

    public void setTstatus(String tstatus) {
        this.tstatus = tstatus == null ? null : tstatus.trim();
    }

    public String getTlogo() {
        return tlogo;
    }

    public void setTlogo(String tlogo) {
        this.tlogo = tlogo == null ? null : tlogo.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTimg() {
        return timg;
    }

    public void setTimg(String timg) {
        this.timg = timg == null ? null : timg.trim();
    }

    public String getTslogan() {
        return tslogan;
    }

    public void setTslogan(String tslogan) {
        this.tslogan = tslogan == null ? null : tslogan.trim();
    }

    public String getTdesc() {
        return tdesc;
    }

    public void setTdesc(String tdesc) {
        this.tdesc = tdesc == null ? null : tdesc.trim();
    }

    public String getTpm() {
        return tpm;
    }

    public void setTpm(String tpm) {
        this.tpm = tpm == null ? null : tpm.trim();
    }

    public Date getTtime() {
        return ttime;
    }

    public void setTtime(Date ttime) {
        this.ttime = ttime;
    }

    public Double getTmoney() {
        return tmoney;
    }

    public void setTmoney(Double tmoney) {
        this.tmoney = tmoney;
    }

    public String getTcontract() {
        return tcontract;
    }

    public void setTcontract(String tcontract) {
        this.tcontract = tcontract == null ? null : tcontract.trim();
    }
}