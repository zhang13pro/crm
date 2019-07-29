package cn.beijing.mymvc.dao;

import cn.beijing.mymvc.po.Staff;
import cn.beijing.mymvc.util.DBCPUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 * @Author: bobobo
 * @Date: 2019/7/28 19:02
 * @Version：1.0
 */
public class StaffDao {
    private DataSource ds = DBCPUtils.getDataSource();
    private QueryRunner run = new QueryRunner(ds);

    public List<Staff> queryListAll(){
        String sql = "select * from crm_staff";
        return getStaffAll(sql);
    }

    public List<Staff> getStaffAll(String sql){
        List<Staff> staffs = new ArrayList<>(20);
        try {
            return run.query(sql,new BeanListHandler<>(Staff.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return staffs;
    }
}
