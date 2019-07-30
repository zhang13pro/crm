package cn.beijing.mymvc.servlet;

import cn.beijing.mymvc.dao.StuDao;
import cn.beijing.mymvc.po.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: bobobo
 * @Date: 2019/7/30 10:51
 * @Version：1.0
 */
@WebServlet("stuServlet.do")
public class StuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final StuDao stuDao = new StuDao();
        final List<Student> stuList = stuDao.getStuInfo();
        //作用域
        request.setAttribute("stuList",stuList);
        //跳转 才能显示数据
        request.getRequestDispatcher("/stuList.jsp").forward(request,response);
    }
}
