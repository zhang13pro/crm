package com.bobo.mybatis.proxy;

import com.bobo.mybatis.cfg.Mapper;
import com.bobo.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @Author: bobobo
 * @Date: 2019/8/7 13:15
 * @Version：1.0
 */
public class MapperProxy implements InvocationHandler {
    private Connection conn;
    //map的key是全限定类名.方法名
    private final Map<String, Mapper> mappers;

    public MapperProxy(Map<String, Mapper> mappers,Connection conn) {
        this.mappers = mappers;
        this.conn = conn;
    }

    /*
    * 用于对方法进行增强
    * 这里就是调用selectList方法*/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //1获取方法名
        String methodName = method.getName();
        //2获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        //3组合key
        String key = className+"."+methodName;
        //4获取mappers里的mapper对象
        Mapper mapper = mappers.get(key);
        //5判断
        if(mapper == null){
            throw new IllegalArgumentException("传入参数出错");
        }
        //6调用工具类查询所有
        return new Executor().selectList(mapper,conn);
    }
}
