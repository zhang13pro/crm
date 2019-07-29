package cn.beijing.mymvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author: bobobo
 * @Date: 2019/7/25 10:52
 * @Version：1.0
 */
public class MyConnection {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){

        String url = "jdbc:mysql://localhost/crm?useUnicode=true&characterEncoding=utf8";
        String user = "root";
        String password = "root";
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
