package com.xue.service;

import com.xue.exception.MyException;
import com.xue.pojo.po.AppointmentInfo;
import com.xue.pojo.vo.AppointmentInfoShow;

import java.util.List;

public interface AppointmentService {
    List<AppointmentInfoShow> selectHotAppointment();
    List<AppointmentInfoShow> selectFocusAppointment(String account) throws MyException;
}
