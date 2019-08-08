package com.bobo.mybatis.sqlsession;

import com.bobo.mybatis.cfg.Configuration;

/**
 * @Author: bobobo
 * @Date: 2019/8/7 11:20
 * @Version：1.0
 */
public class SqlSessionFactoryImpl implements SqlSessionFactory {
    private Configuration cfg;
    public SqlSessionFactoryImpl(Configuration cfg){
        this.cfg = cfg;
    };
    /*
    * 创建新的操作数据库对象
    * */
    public SqlSession openSession() {

        return new SqlSessionImpl(cfg);
    }

}
