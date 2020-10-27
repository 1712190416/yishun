package com.xue.service;

import com.xue.pojo.po.UserDetail;
import com.xue.pojo.dto.UserDetailTransfer;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public interface UserService {
    UserDetail selectUserByAccount(String account);
    String updateUserByAccount(MultipartFile file, HttpServletRequest request, UserDetailTransfer userDetailTransfer)throws IOException;
}
