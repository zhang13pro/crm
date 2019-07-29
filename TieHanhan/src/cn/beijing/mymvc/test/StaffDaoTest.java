package cn.beijing.mymvc.test;

import cn.beijing.mymvc.dao.StaffDao;
import cn.beijing.mymvc.po.Staff;

import java.util.List;

/**
 * @Author: bobobo
 * @Date: 2019/7/28 20:51
 * @Version：1.0
 */
public class StaffDaoTest {
    public static void main(String[] args) {
        StaffDao staffDao = new StaffDao();
        List<Staff> staffList = staffDao.queryListAll();
        System.out.println(staffList);
    }
}
