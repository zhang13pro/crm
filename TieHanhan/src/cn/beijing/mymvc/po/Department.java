package cn.beijing.mymvc.po;

/**
 * @Author: bobobo
 * @Date: 2019/7/25 9:53
 * @Version：1.0
 */
public class Department {
    private int id;
    private String depName;
    private int isCancel;

    public Department(){};

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", depName='" + depName + '\'' +
                ", isCancel=" + isCancel +
                '}'+"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public int getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(int isCancel) {
        this.isCancel = isCancel;
    }


}
