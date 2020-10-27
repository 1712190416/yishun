package com.xue.controller;

import com.xue.exception.MyException;
import com.xue.pojo.vo.AppointmentInfoShow;
import com.xue.service.AppointmentService;
import com.xue.utils.JSONResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @ApiOperation("获取热门约拍")
    @GetMapping("/getHotAppointment")
    public JSONResult getHotAppointment(){
        return JSONResult.success(appointmentService.selectHotAppointment());
    }

    @ApiOperation("获取关注约拍")
    @GetMapping("/getFocusAppointment")
    public JSONResult getFocusAppointment(String account){
        try {
            return JSONResult.success(appointmentService.selectFocusAppointment(account));
        } catch (MyException e) {
            return JSONResult.errorMsg(e.getMessage());
        }
    }
}
