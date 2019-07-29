package cn.beijing.mymvc.util;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSourceFactory;

/**
 * @Author: bobobo
 * @Date: 2019/7/28 19:10
 * @Version：1.0
 */

public class DBCPUtils {

    private static DataSource ds = null;
    static {
        // 新建一个配置文件对象
        Properties prop = new Properties();
        try {
            // 通过类加载器找到文件路径，读配置文件
            InputStream in = new DBCPUtils().getClass().getClassLoader()
                    .getResourceAsStream("db.properties");
            // 把文件以输入流的形式加载到配置对象中
            prop.load(in);
            // 创建数据源对象
            ds = BasicDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource() {
        return ds;
    }
    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            //TODO 记录日志
            e.printStackTrace();
            return null;
        }
    }
}
