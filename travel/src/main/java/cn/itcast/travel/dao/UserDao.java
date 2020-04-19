package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

public interface UserDao {
    //根据用户名查询用户信息
    public User findbyUsername(String username);
    public void save(User user);

    public void updateStatus(User user);
    public User findByCode(String code);

    User findUserByUsernameAndPassword(String username, String password);
}
