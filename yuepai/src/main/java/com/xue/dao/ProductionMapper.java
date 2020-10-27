package com.xue.dao;

import com.xue.pojo.po.Production;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Production record);

    Production selectByPrimaryKey(Integer id);

    List<Production> selectAll();

    int updateByPrimaryKey(Production record);

    List<Production> selectByAccount(String account);

    List<Production> fuzzyQueryByTagList(@Param("tag") String tag);
}