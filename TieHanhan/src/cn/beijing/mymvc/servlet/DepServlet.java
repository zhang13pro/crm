package cn.beijing.mymvc.servlet;

import cn.beijing.mymvc.dao.DepDao;
import cn.beijing.mymvc.po.Department;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: bobobo
 * @Date: 2019/7/25 15:42
 * @Version：1.0
 */
@WebServlet({"/depList.do","/depAdd.do","/depUpdate.do","/depDelete.do"})
public class DepServlet extends HttpServlet {
    private DepDao depDao = new DepDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String url = req.getRequestURL().toString();
        if (url.contains("depList.do")){
            query(req, resp);
        }
        if (url.contains("depAdd.do")){
            addDepartment(req,resp);
        }
        if (url.contains("depUpdate.do")){
            updateDepartment(req,resp);
        }
        if (url.contains("depDelete.do")){
            deleteDepartment(req,resp);
        }
    }

    private void deleteDepartment(HttpServletRequest req, HttpServletResponse resp) {
        String depId = req.getParameter("id");
        int num = depDao.delDepartById(depId);
        handle(req, resp, num);
    }

    private void handle(HttpServletRequest req, HttpServletResponse resp, int num) {
        try {
            if (num >= 1) {
                query(req, resp);
            }
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateDepartment(HttpServletRequest req, HttpServletResponse resp) {
        String depName = req.getParameter("depName");
        String depId = req.getParameter("depId");
        int num = depDao.updateDepart(depId,depName);
        handle(req, resp, num);
    }

    private void query(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Department> depList = depDao.getDepInfo();
        req.setAttribute("depList",depList);
        req.getRequestDispatcher("/deplist.jsp").forward(req,resp);
    }

    private void addDepartment(HttpServletRequest req, HttpServletResponse resp) {
        String depName = req.getParameter("depName");
        int num = depDao.addDepart(depName);
        handle(req, resp, num);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
