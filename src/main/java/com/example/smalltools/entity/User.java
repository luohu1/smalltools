package com.example.smalltools.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId("id")
    private String id;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;
}
