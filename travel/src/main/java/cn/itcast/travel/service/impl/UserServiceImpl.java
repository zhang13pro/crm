package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;

/**
 * @Author: bobobo
 * @Date: 2019/7/30 16:24
 * @Version：1.0
 *
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    /*
    * 注册用户
    * */
    @Override
    public boolean regist(User user) {
        /*
        * 1 根据用户名查询用户对象
        * 2 保存用户信息
        * */
        User u = userDao.findByUsername(user.getUsername());
        if (u != null){
            return false;
        }else
            userDao.save(user);
        return true;
    }
}
