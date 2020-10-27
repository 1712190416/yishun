package com.xue.dao;

import com.xue.pojo.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String account);

    int insert(User record);

    User selectByPrimaryKey(String account);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}