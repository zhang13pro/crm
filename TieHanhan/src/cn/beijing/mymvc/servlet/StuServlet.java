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
@WebServlet({"/stuServlet.do","/stuDelete.do","/stuUpdate.do","/stuAdd.do"})
public class StuServlet extends HttpServlet {
    private final StuDao stuDao = new StuDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String url = request.getRequestURL().toString();
        if (url.contains("stuServlet.do")){
            query(request, response);
        }
        if (url.contains("stuDelete.do")){
            query(request, response);
        }
        if (url.contains("stuUpdate.do")){
            query(request, response);
        }
        if (url.contains("stuAdd.do")){
            addStudent(request,response);
        }
    }

    private void addStudent(HttpServletRequest request, HttpServletResponse response) {
        String stuName = request.getParameter("stuName");
        int num = stuDao.addStudent(stuName);
        try {
            if (num >= 1) {
                query(request, response);
            }
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final List<Student> stuList = stuDao.getStuInfo();
        //作用域
        request.setAttribute("stuList",stuList);
        //跳转 才能显示数据
        request.getRequestDispatcher("/stuList.jsp").forward(request,response);
    }
}
