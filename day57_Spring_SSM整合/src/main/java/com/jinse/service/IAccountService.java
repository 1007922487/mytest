package com.jinse.service;

import com.jinse.entity.Account;

import java.util.List;

public interface IAccountService {
    /**
     * 查询全部
     */
    List<Account> findAll();
}
