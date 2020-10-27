package com.xue.dao;

import com.xue.pojo.po.AppointmentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AppointmentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppointmentInfo record);

    AppointmentInfo selectByPrimaryKey(Integer id);

    List<AppointmentInfo> selectAll();

    int updateByPrimaryKey(AppointmentInfo record);

    List<AppointmentInfo> selectByAccount(String account);

    List<AppointmentInfo> selectHot();
}