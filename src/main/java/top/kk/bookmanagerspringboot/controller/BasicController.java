package top.kk.bookmanagerspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kk
 * @description 基础服务控制层:实现网站访问跳转到登录界面
 * @date 2023-08-25 15:07:15
 */
@Slf4j
@Controller
public class BasicController {
    @RequestMapping("")
    public String Redirect(){
        log.info("第一次尝试重定向");
        return "redirect:/login.html";
    }
}
