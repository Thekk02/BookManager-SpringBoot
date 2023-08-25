package top.kk.bookmanagerspringboot.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.kk.bookmanagerspringboot.entity.User;
import top.kk.bookmanagerspringboot.mappers.UserMapper;
import top.kk.bookmanagerspringboot.service.UserService;

/**
 * @author kk
 * @description 拥护服务层实现
 * @date 2023-08-25 13:50:10
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User SelectUserByNameAndPwd(String name, String pwd) {
        return userMapper.SelectUserByNameAndPwd(name, pwd);
    }
}
