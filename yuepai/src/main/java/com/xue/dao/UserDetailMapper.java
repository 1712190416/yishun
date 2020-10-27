package com.xue.dao;

import com.xue.pojo.po.UserDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDetailMapper {
    int deleteByPrimaryKey(String account);

    int insert(UserDetail record);

    UserDetail selectByPrimaryKey(String account);

    List<UserDetail> selectAll();

    int updateByPrimaryKey(UserDetail record);
}