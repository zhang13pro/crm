package com.bobo.mybatis.sqlsession;

import com.bobo.mybatis.cfg.Configuration;
import com.bobo.mybatis.proxy.MapperProxy;
import com.bobo.mybatis.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: bobobo
 * @Date: 2019/8/7 11:33
 * @Version：1.0
 */
public class SqlSessionImpl implements SqlSession {
    private Connection conn;
    private Configuration cfg;
    public SqlSessionImpl(Configuration cfg){
        this.cfg = cfg;
        conn = DataSourceUtil.getConnection(cfg);
    }
    /*用于创建代理对象
    * daoInterfaceClass dao的接口字节码*/
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},new MapperProxy(cfg.getMappers(),conn));
        return null;
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
