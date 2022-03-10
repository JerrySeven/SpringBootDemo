package com.lemon.aopdemo.service.impl;

import com.lemon.aopdemo.service.CheckUserService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
public class CheckUserServiceImpl implements CheckUserService {

    @Override
    @SneakyThrows
    public void checkAdmin(String token) {
        if(!"777".equals(token)){
            throw new Exception("您不是管理员！不允许登录");
        }
    }
}
