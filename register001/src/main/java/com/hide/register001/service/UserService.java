package com.hide.register001.service;

import com.hide.register001.entity.User;
import com.hide.register001.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public String register(User user){
            User userExist = userMapper.findByName(user.getName());
            if (user.getName().equals("")) {
                return "用户名不能为空";
            }else if (user.getPassword().equals("")) {
                return "密码不能为空";
            }else if (userExist != null) {
                return "账号已经存在";
            }else {
                userMapper.save(user);
                return "注册成功";
            }
    }
    public String login(User user) {
            User userExistN = userMapper.findByName(user.getName());
            if (userExistN != null) {
                String userExistP = userMapper.findPswByName(user.getName());
                if (userExistP.equals(user.getPassword())) {
                    return user.getName()+"登录成功，欢迎您！";
                }else{
                    return "登录失败，密码错误！";
                }
            }else {
                return "登录失败，用户不存在!";
            }

    }
}
