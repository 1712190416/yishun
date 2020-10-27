package com.xue.service.Impl;

import com.xue.dao.AppointmentInfoMapper;
import com.xue.dao.FocusUserMapper;
import com.xue.exception.MyException;
import com.xue.pojo.po.AppointmentInfo;
import com.xue.pojo.vo.AppointmentInfoShow;
import com.xue.service.AppointmentService;
import com.xue.utils.AddressTransferUtil;
import com.xue.utils.IPAddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentInfoMapper appointmentInfoMapper;
    @Autowired
    FocusUserMapper focusUserMapper;

    @Override
    public List<AppointmentInfoShow> selectHotAppointment() {
        List<AppointmentInfo> appointmentInfos = appointmentInfoMapper.selectHot();
        List<AppointmentInfoShow> appointmentInfoShows=new ArrayList<>();
        for (AppointmentInfo appointmentInfo : appointmentInfos) {
            AppointmentInfoShow appointmentInfoShow = new AppointmentInfoShow();
            appointmentInfoShow.setAccount(appointmentInfo.getAccount());
            appointmentInfoShow.setAvatarUrl(IPAddressUtil.getLocalIp()+appointmentInfo.getAvatarUrl());
            appointmentInfoShow.setCameraArea(appointmentInfo.getCameraArea());
            appointmentInfoShow.setCameraTime(appointmentInfo.getCameraTime());
            appointmentInfoShow.setExplain(appointmentInfo.getExplain());
            appointmentInfoShow.setGender(appointmentInfo.getGender());
            appointmentInfoShow.setGetInvite(appointmentInfo.getGetInvite());
            appointmentInfoShow.setId(appointmentInfo.getId());
            appointmentInfoShow.setImgList(AddressTransferUtil.addressTrans(appointmentInfo.getImgList()));
            appointmentInfoShow.setLaunchTime(appointmentInfo.getLaunchTime());
            appointmentInfoShow.setNickName(appointmentInfo.getNickName());
            appointmentInfoShow.setPrice(appointmentInfo.getPrice());
            appointmentInfoShow.setReadNumber(appointmentInfo.getReadNumber());
            appointmentInfoShow.setTagList(Arrays.asList(appointmentInfo.getTagList().split(";")));
            appointmentInfoShows.add(appointmentInfoShow);
        }
        return appointmentInfoShows;
    }

    @Override
    public List<AppointmentInfoShow> selectFocusAppointment(String account) throws MyException {
        List<AppointmentInfoShow> appointmentInfoShows=new ArrayList<>();
        List<String> focus = focusUserMapper.selectFocus(account);
        if (focus==null){
            throw new  MyException("没有关注的人");
        }
        for (String s : focus) {
            List<AppointmentInfo> appointmentInfoList = appointmentInfoMapper.selectByAccount(s);
            for (AppointmentInfo appointmentInfo : appointmentInfoList) {
                AppointmentInfoShow appointmentInfoShow = new AppointmentInfoShow();
                appointmentInfoShow.setAccount(appointmentInfo.getAccount());
                appointmentInfoShow.setAvatarUrl(IPAddressUtil.getLocalIp()+appointmentInfo.getAvatarUrl());
                appointmentInfoShow.setCameraArea(appointmentInfo.getCameraArea());
                appointmentInfoShow.setCameraTime(appointmentInfo.getCameraTime());
                appointmentInfoShow.setExplain(appointmentInfo.getExplain());
                appointmentInfoShow.setGender(appointmentInfo.getGender());
                appointmentInfoShow.setGetInvite(appointmentInfo.getGetInvite());
                appointmentInfoShow.setId(appointmentInfo.getId());
                appointmentInfoShow.setImgList(AddressTransferUtil.addressTrans(appointmentInfo.getImgList()));
                appointmentInfoShow.setLaunchTime(appointmentInfo.getLaunchTime());
                appointmentInfoShow.setNickName(appointmentInfo.getNickName());
                appointmentInfoShow.setPrice(appointmentInfo.getPrice());
                appointmentInfoShow.setReadNumber(appointmentInfo.getReadNumber());
                appointmentInfoShow.setTagList(Arrays.asList(appointmentInfo.getTagList().split(";")));
                appointmentInfoShows.add(appointmentInfoShow);
            }
        }
        if (appointmentInfoShows.size()==0){
            throw  new MyException("关注的人还没有发表约拍呢");
        }
        return appointmentInfoShows;
    }
}
