package com.lemon.aopdemo.service;

public interface CheckUserService {
    /**
     * 校验是否管理员身份
     */
    void checkAdmin(String token) throws Exception;
}
