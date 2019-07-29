package cn.beijing.mymvc.dao;

import cn.beijing.mymvc.po.Department;
import cn.beijing.mymvc.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: bobobo
 * @Date: 2019/7/25 10:03
 * @Version：1.0
 */
public class DepDao {
    public List<Department> getDepInfo(){
        List<Department> depList = null;
        String sql = "select * from crm_department";
        ResultSet rs = JDBCUtil.getQueryData(sql);
        try {
            if (rs != null){
                depList = new ArrayList<>();
                while (rs.next()){
                    Department depart = new Department();
                    depart.setId(rs.getInt("id"));
                    depart.setDepName(rs.getString("depName"));
                    depart.setIsCancel(rs.getInt("isCancel"));
                    depList.add(depart);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JDBCUtil.close(rs,null,null);
        return depList;
    }

    public int addDepart(String depName) {
        String sql = "insert into crm_department(depName) values('"+depName+"')";
        return JDBCUtil.executeUpdate(sql);
    }

    public int updateDepart(String depId, String depName) {
        //TODO 为什么是id 匹配不是 depId
        //po层的变量名 是 id
        String sql = "update crm_department set depName='"+depName+"' where id='"+depId+"'";
        return JDBCUtil.executeUpdate(sql);
    }

    public int delDepartById(String depId) {
        String sql = "delete FROM crm_department where id="+depId;
        return JDBCUtil.executeUpdate(sql);
    }
}
