package cn.beijing.mymvc.test;

import cn.beijing.mymvc.dao.DepDao;
import cn.beijing.mymvc.po.Department;

import java.util.List;

/**
 * @Author: bobobo
 * @Date: 2019/7/25 15:18
 * @Version：1.0
 */
public class DepTest {
    public static void main(String[] args) {
        DepDao depDao = new DepDao();
        List<Department> depInfo = depDao.getDepInfo();
        System.out.println(depInfo);
    }
}
