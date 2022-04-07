package com.qiujianwei.common.Controller;

import com.qiujianwei.common.Entity.User;
import com.qiujianwei.common.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUserInfoById")
    public User getUserInfoById(Integer userId){
        return userService.getUserById(userId);
    }
}
