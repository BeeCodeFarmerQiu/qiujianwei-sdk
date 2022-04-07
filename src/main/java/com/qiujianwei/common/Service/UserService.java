package com.qiujianwei.common.Service;

import com.qiujianwei.common.Entity.User;
import com.qiujianwei.common.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer id){
       return userMapper.findById(id);
    }
}
