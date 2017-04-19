package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by fido on 2017/4/19.
 */
//junit启动时加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;


    @Test
    public void insertSuccessKilled() throws Exception {
        long seckillId =1001L;
        long phone =15626154455L;
        int num=successKilledDao.insertSuccessKilled(seckillId,phone);
        System.out.print("num:"+num);
    }
    @Test
    public void queryByIdWithSeckill() throws Exception {
        long seckillId =1001L;
        long phone =15626154455L;
        SuccessKilled successKilled=successKilledDao.queryByIdWithSeckill(seckillId,phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }

}