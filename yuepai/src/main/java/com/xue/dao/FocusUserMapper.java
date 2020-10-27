package com.xue.dao;

import com.xue.pojo.po.FocusUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FocusUserMapper {
    int insert(FocusUser record);

    List<FocusUser> selectAll();

    List<String> selectFocus(String account);

}