package com.example.smalltools.controller;


import com.example.smalltools.entity.User;
import com.example.smalltools.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    /**
     * 查询全部学生信息
     *
     * @return
     */
    @RequestMapping("/selectAll")
    public List<User> selectAll() {
        return userService.list();
    }
}
