package com.example.smalltools.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.smalltools.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
