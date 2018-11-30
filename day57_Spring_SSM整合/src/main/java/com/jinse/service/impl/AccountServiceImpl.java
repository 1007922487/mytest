package com.jinse.service.impl;

import com.jinse.dao.IAccountDao;
import com.jinse.entity.Account;
import com.jinse.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class AccountServiceImpl implements IAccountService {
    //注入dao
    @Autowired
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("findAll->查询全部...");
        return accountDao.finAll();
    }
}
