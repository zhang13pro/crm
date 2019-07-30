package cn.beijing.mymvc.po;

import java.util.Date;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/7/29 23:17
 */
public class Student {
    private int id;
    private String stuName;
    private String stuCode;


    private String stuSex;
    private int referid;
    private int classid;
    private Date beginTime;
    private Date jobTime;
    private String stuState;
    private String checkLevel;
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuCode() {
        return stuCode;
    }

    public void setStuCode(String stuCode) {
        this.stuCode = stuCode;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getReferid() {
        return referid;
    }

    public void setReferid(int referid) {
        this.referid = referid;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getJobTime() {
        return jobTime;
    }

    public void setJobTime(Date jobTime) {
        this.jobTime = jobTime;
    }

    public String getStuState() {
        return stuState;
    }

    public void setStuState(String stuState) {
        this.stuState = stuState;
    }

    public String getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(String checkLevel) {
        this.checkLevel = checkLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuCode='" + stuCode + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", referid=" + referid +
                ", classid=" + classid +
                ", beginTime=" + beginTime +
                ", jobTime=" + jobTime +
                ", stuState='" + stuState + '\'' +
                ", checkLevel='" + checkLevel + '\'' +
                ", remark='" + remark + '\'' +
                '}'+"\n";
    }
}
