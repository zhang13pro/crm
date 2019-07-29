package cn.bobobo.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: bobobo
 * @Date: 2019/7/24 20:26
 * @Version：1.0
 */
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text.html;charset=utf-8");

        Cookie[] cookies = request.getCookies();
        if (cookies != null & cookies.length > 0){
            for (Cookie cookie:cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)){
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    String str_date = sdf.format(date);
                    cookie.setValue(str_date);
                    cookie.setMaxAge(60*60*24*30);
                    response.addCookie(cookie);

                    String value = cookie.getValue();
                    System.out.println("回来，上次时间："+value);
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
