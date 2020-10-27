package com.xue.controller;

import com.xue.exception.MyException;
import com.xue.service.ProductionService;
import com.xue.utils.JSONResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/production")
public class ProductionController {

    @Autowired
    ProductionService productionService;

    @ApiOperation("根据标签获取作品")
    @GetMapping("/getProduction")
    public JSONResult getProductionByTag(String tag){
        try {
            return  JSONResult.success(productionService.selectProductionByTag(tag));
        } catch (MyException e) {
            return JSONResult.errorMsg(e.getMessage());
        }
    }
}
