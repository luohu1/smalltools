package com.example.smalltools.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.smalltools.entity.User;
import com.example.smalltools.mapper.UserMapper;
import com.example.smalltools.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
