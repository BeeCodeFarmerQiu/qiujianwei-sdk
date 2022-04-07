package com.qiujianwei.common.mapper;

import com.qiujianwei.common.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findById(Integer id);
}
