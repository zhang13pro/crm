package cn.beijing.mymvc.po;

/**
 * @Author: bobobo
 * @Date: 2019/7/28 18:59
 * @Version：1.0
 */
public class Staff {
    private int staffId;
    private String staffName;
    private String loginName;
    private String staffCode;
    private String gender;
    private String email;
    private String birthday;
    private String onDutyDate;
    private String postId;
    private int state;

    public Staff(){};

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getOnDutyDate() {
        return onDutyDate;
    }

    public void setOnDutyDate(String onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", staffCode='" + staffCode + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", onDutyDate='" + onDutyDate + '\'' +
                ", postId='" + postId + '\'' +
                ", state=" + state +
                '}'+"\n";
    }
}
