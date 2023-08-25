package top.kk.bookmanagerspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import top.kk.bookmanagerspringboot.mappers.UserMapper;

import javax.servlet.http.HttpServletResponse;

/**
 * @author kk
 * @description 用户控制层
 * @date 2023-08-25 14:38:24
 */
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

//    @RequestMapping("/login.html?Un={Username}&Pd={password}")
    /**
    * @Description:登录验证
    * @Params:
    * @Return:
    */
//    public String Login(@PathVariable("Username")String name, @PathVariable("password")String pwd, HttpServletResponse response){
//        if(userMapper.SelectUserByNameAndPwd(name,pwd) == null){
//            return "redirct:/loginrefuse.html";
//        }
//
//    }
}
