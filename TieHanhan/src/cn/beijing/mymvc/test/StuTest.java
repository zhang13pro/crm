package cn.beijing.mymvc.test;

import cn.beijing.mymvc.dao.StuDao;
import cn.beijing.mymvc.po.Student;

import java.util.List;

/**
 * @author bobobo
 * @version 1.0
 * @date 2019/7/29 23:45
 */
public class StuTest {
    public static void main(String[] args) {
        final StuDao stuDao = new StuDao();
        final List<Student> stuInfo = stuDao.getStuInfo();
        System.out.println(stuInfo);
    }
}
