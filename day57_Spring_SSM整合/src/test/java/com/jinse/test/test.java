package com.jinse.test;

import com.jinse.dao.IAccountDao;
import com.jinse.entity.Account;
import com.jinse.service.IAccountService;
import com.jinse.service.impl.AccountServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

//Spring整合Junit实现测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
    //注入service
    @Autowired
    private IAccountService accountService;

    @Test
    public void find(){
        List<Account> list = accountService.findAll();
        System.out.println(list);
    }

    @Test
    public void findAll() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //通过工厂构造器创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建会话
        SqlSession sqlSession = factory.openSession();
        //生成接口代理对象
        IAccountDao mapper = sqlSession.getMapper(IAccountDao.class);
        List<Account> list = mapper.finAll();
        System.out.println(list);
        sqlSession.close();
        in.close();
    }

    @Test
    //Spring整合mybatis测试
    public void findAll1(){
        System.out.println(accountService.getClass());
        List<Account> list = accountService.findAll();
        System.out.println(list);
    }
}
