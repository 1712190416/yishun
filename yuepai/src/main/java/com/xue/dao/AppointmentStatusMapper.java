package com.xue.dao;

import com.xue.pojo.po.AppointmentStatus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
@Mapper
public interface AppointmentStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppointmentStatus record);

    AppointmentStatus selectByPrimaryKey(Integer id);

    List<AppointmentStatus> selectAll();

    int updateByPrimaryKey(AppointmentStatus record);
}