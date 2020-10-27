package com.xue.service;

import com.xue.exception.MyException;
import com.xue.pojo.vo.ProductionShow;

import java.util.List;

public interface ProductionService {
    List<ProductionShow>  selectProductionByTag(String tag) throws MyException;
}
