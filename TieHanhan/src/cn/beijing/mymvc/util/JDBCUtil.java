package cn.beijing.mymvc.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: bobobo
 * @Date: 2019/7/25 10:32
 * @Version：1.0
 */
public class JDBCUtil {
    public static ResultSet getQueryData(String sql){
        Connection conn = MyConnection.getConnection();
        try {
            Statement st = conn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        return rs;
    }

    public static void close(ResultSet rs, Connection conn, Statement st) {
        try {
            if (rs != null)
                rs.close();
            if (conn != null)
                conn.close();
            if (st != null)
                st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int executeUpdate(String sql) {
        Connection conn = MyConnection.getConnection();
        try {
            if (conn == null){
                return 0;
            }
            Statement st = conn.createStatement();
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
