package cn.beijing.mymvc.dao;

import cn.beijing.mymvc.po.Student;
import cn.beijing.mymvc.util.JDBCUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/7/29 23:26
 */
public class StuDao {
    public List<Student> getStuInfo(){
        List<Student> stuList = null;
        String sql = "select * from crm_student";
        ResultSet rs = JDBCUtil.getQueryData(sql);
        if (rs != null){
            stuList = new ArrayList<>();
            try {
                while (rs.next()){
                    final Student student = new Student();
                    student.setId(rs.getInt("id"));
                    student.setStuName(rs.getString("stuName"));
                    student.setStuCode(rs.getString("stuCode"));
                    student.setStuSex(rs.getString("stuSex"));
                    student.setReferid(rs.getInt("referid"));
                    student.setClassid(rs.getInt("classid"));
                    student.setBeginTime(rs.getDate("beginTime"));
                    student.setJobTime(rs.getDate("jobTime"));
                    student.setStuState(rs.getString("stuState"));
                    student.setCheckLevel(rs.getString("checkLevel"));
                    student.setRemark(rs.getString("remark"));
                    stuList.add(student);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JDBCUtil.close(rs,null,null);
        return stuList;
    }
}
