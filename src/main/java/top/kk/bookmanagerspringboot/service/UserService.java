package top.kk.bookmanagerspringboot.service;

import top.kk.bookmanagerspringboot.entity.User;

/**
 * @author kk
 * @description 用户服务层
 * @date 2023-08-25 13:49:46
 */
public interface UserService {
    public User SelectUserByNameAndPwd(String name, String pwd);
}
