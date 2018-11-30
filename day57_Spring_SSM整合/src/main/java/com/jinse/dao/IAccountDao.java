package com.jinse.dao;

import com.jinse.entity.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

import java.util.List;
public interface IAccountDao {
    /**
     * 查询
     */
    @Select("SELECT * FROM account")
    List<Account> finAll();
}
